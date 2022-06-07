
// janken.java ではクラス化、インスタンス化を進める。

class janken {
  public static void main(String[] args){

    c_engine engine1 = new c_engine();

    // scoreboardの初期化：未実装

    // 第一引数 plyr_num：プレイヤーを識別するための番号
    // 第二引数 egType  ：1=手を任意に入力する 2=ランダムで手を出す
    // 先攻：人間が手を入力
    int hand_1 = engine1.engine(1,1);

    // 後攻：ランダム
    int hand_2 = engine1.engine(2,2);

    // 審判
    judge(hand_1, hand_2);

    // スコア記録：未実装
    // 結果表示：未実装
  
  }  



  

  static void judge(int hand_1,int hand_2 ) {
    // 部品：審判
    // スコアボード機能も混ざっちゃっている
    Integer bout_rslt = hand_1 - hand_2;
    if (bout_rslt == 0) {
      System.out.println("あいこです");
    }
    else if (bout_rslt == -1 || bout_rslt == 2) {
      System.out.println("勝ちです");
    }
    else if (bout_rslt == -2 || bout_rslt == 1) {
      System.out.println("負けです");
    }
    else {
      System.out.println("エラー");
    }
  }


  
}
    
    
    /////////////////////////////////////////
        //if a-b =
        //-1 or 2 than return win
        //-2 or 1 than return lose
        //0 than return draw
    
    ////////////////////////////////////////
        //String[] str = {"グー", "チョキ", "パー"};
        //乱数をnumへ代入
        //int num =  (int) (Math.random() * (str.length));
        //System.out.print(str[num]);
    
    ////////////////////////////////////////





    


    

// static int engine(int plyr_num,int egType) {
//     
//  // 部品 エンジン プレイヤー（人間）が手を入力する
//  // 引数：なし
//  // 戻り値：プレイヤーが入力した値
//  
//  //Random  rnd     = new Random();
//  //Scanner scanner = new Scanner(System.in);
//
//  if (plyr_num < 1 || 10 < plyr_num) {
//    
//    //プレイヤーナンバーエラー
//    System.out.println("エラーです : プレイヤーナンバー");
//    return 99;
//  }
//  
//  if (egType < 1 || 2 < egType) {
//    //エンジンタイプエラー
//    System.out.println("エラーです : egTypeが 1 or 2 じゃない");
//    return 99;
//  }
//  
//  if (egType == 1) {
//    // egType：1 … プレイヤー（人間）が手を入力する
//    System.out.println("入力してください。グー 0 / チョキ 1 / パー 2");
//    
//    Scanner sc_hand = new Scanner(System.in);
//    Integer hand_1 = sc_hand.nextInt();
//    System.out.println("プレイヤー " + plyr_num + " の手は " + hand_1 + " です");
//    // sc_hand.close(); // closeしないと警告が出る
//    return hand_1;
//  } 
//  else if (egType == 2) {
//    // egType：2 … 手をランダム生成する
//    Random  rnd     = new Random();
//    Integer hand_2 = rnd.nextInt(3);
//    System.out.println("プレイヤー " + plyr_num + " [CP] の手は " + hand_2 + " です");
//    return hand_2;
//  }
//  else {
//    System.out.println("エラーです : egTypeが 1 or 2 じゃない");
//    return 99;
//  }
//  
//}  
//
