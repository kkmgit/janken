import java.util.Random;
import java.util.Scanner;
// import engine.java;

public class c_engine {

    int engine(int plyr_num,int egType) {
    
    // 部品 エンジン プレイヤー（人間）が手を入力する
    // 引数：なし
    // 戻り値：プレイヤーが入力した値
    
    //Random  rnd     = new Random();
    //Scanner scanner = new Scanner(System.in);

      if (plyr_num < 1 || 10 < plyr_num) {
        
        //プレイヤーナンバーエラー
        System.out.println("エラーです : プレイヤーナンバー");
        return 99;
      }
        
      if (egType < 1 || 2 < egType) {
            
            //エンジンタイプエラー
            System.out.println("エラーです : egTypeが 1 or 2 じゃない");
            
        return 99;
      }
    
    if (egType == 1) {
      // egType：1 … プレイヤー（人間）が手を入力する
      System.out.println("入力してください。グー 0 / チョキ 1 / パー 2");
      
      Scanner sc_hand = new Scanner(System.in);
      Integer hand_1 = sc_hand.nextInt();
      System.out.println("プレイヤー " + plyr_num + " の手は " + hand_1 + " です");
      sc_hand.close(); // closeしないと警告が出るけど動く → Resource leak: 'sc_hand' is never closed
      return hand_1;
    } 
    else if (egType == 2) {
      // egType：2 … 手をランダム生成する
      Random  rnd     = new Random();
      Integer hand_2 = rnd.nextInt(3);
      System.out.println("プレイヤー " + plyr_num + " [CP] の手は " + hand_2 + " です");
      return hand_2;
    }
    else {
      System.out.println("エラーです : egTypeが 1 or 2 じゃない");
      return 99;
    }
    
  }  
  
}















// 引数で
// プレイヤー1か2か（はたまた3以上が参加しちゃうのか！？
// 手動か自動か、


//////////////////////////////////////////////////////////////////////////////
//  
//  
//  public class engine {
//  
//  
//    private static int engine(int plyr_num,int egType) {
//       
//      // 部品 エンジン プレイヤー（人間）が手を入力する
//      // 引数：なし
//      // 戻り値：プレイヤーが入力した値
//      Scanner scanner = new Scanner(System.in);
//      Random  rnd     = new Random();
//      
//      if (plyr_num < 1 || 10 < plyr_num) {
//        
//        //プレイヤーナンバーエラー
//        System.out.println("エラーです : プレイヤーナンバー");
//        return 99;
//      }
//      
//      if (egType < 1 || 2 < egType) {
//        //エンジンタイプエラー
//        System.out.println("エラーです : egTypeが 1 or 2 じゃない");
//        return 99;
//      }
//      
//      if (egType == 1) {
//        // egType：1 … プレイヤー（人間）が手を入力する
//        System.out.println("入力してください。グー 0 / チョキ 1 / パー 2");
//        Integer hand_1 = scanner.nextInt();
//        scanner.close();
//        System.out.println("プレイヤー " + plyr_num + " の手は " + hand_1 + " です");
//        return hand_1;
//      } 
//      else if (egType == 2) {
//        // egType：2 … 手をランダム生成する
//        Integer hand_2 = rnd.nextInt(3);
//        System.out.println("プレイヤー " + plyr_num + " [CP] の手は " + hand_2 + " です");
//        return hand_2;
//      }
//      else {
//        System.out.println("エラーです : egTypeが 1 or 2 じゃない");
//        return 99;
//      }
//      
//    }  
//    
//  
//  }
//  
//  
//  