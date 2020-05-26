public class Main3 {
	public static void main (String[] args) {
		// if分岐
		// boolean tenki = true;
		// if(tenki == true) {
		// 	System.out.println("洗濯します");
		// 	System.out.println("散歩にいきます");
		// } else {
		// 	System.out.println("DVDを見ます");
		// }

		// かつ 両方満たしているとtrue
		// if( && )
		// または どちらか一方が満たしていればtrue
		// if( || )
		// 結果を逆にする 条件満たさなければture
		// if(! ( === ))

		// switch分岐(左辺と右辺が一致するか比較する式 ==のみ、整数・文字(char)のみ使用可 文字列×)
		// System.out.println("あなたの運勢を占います");
		// int fortune = new java.util.Random().nextInt(4) + 1;
		// switch(fortune) {
		// 	case 1:
		// 		System.out.println("大吉");
		// 		break;
		// 	case 2:
		// 		System.out.println("中吉");
		// 		break;
		// 	case 3:
		// 		System.out.println("吉");
		// 		break;
		// 	default:
		// 		System.out.println("凶");
		// }

		// while繰り返し
		// boolean doorClose = true;
		// while(doorClose == true) {
		// 	System.out.println("ノックする");
		// 	System.out.println("1分待つ");

		// 	※※文字列を比較する場合は演算子は使用できない 変数名.equals("文字列")
		// 	if(s === "文字列") →→ if(s.equals ("文字列"))
		// }

		// for繰り返し
		// （変数を初期化;繰り返す回数の条件;繰り返時に処理する事）
		// for(int i = 0 ; i < 10 ; i++) {
		// 	System.out.println("こんにちは");
		// }
		// break文（繰り返し自体を中断）
		// continue文（その周だけを中断し次の周へ）

		// weight == 60;
		// (age1 + age2) * 2 > 60;
		// age % 2 = 1;
		// name.equals("湊");

		int seibetsu = 0;
		int age = 24;
		System.out.println("こんにちは");
		if(seibetsu == 0) {
			System.out.println("私は男です");
			System.out.println(age + "歳です");
		} else {
			System.out.println("私は女です");
		}
		System.out.println("よろしくおながいします。");

		
		System.out.println("[メニュー]1:検索2:登録3:削除4:変更");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch(selected) {
			case 1:
				System.out.println("検索します");
				break;
			case 2:
				System.out.println("登録します");
				break;
			case 3:
				System.out.println("削除します");
				break;
			case 4:
				System.out.println("変更します");
				break;
			default:
		}

		System.out.println("数当てゲーム");
		int ans = new java.util.Random().nextInt(10);
		for(int i = 0; i < 5; i++) {
			System.out.println("0〜9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("あたり");
				break;
			} else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
	}
}