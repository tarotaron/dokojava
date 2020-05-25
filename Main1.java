public class Main1 {
	public static void main (String[] args) {
		// 出力
		// System.out.println ("Hello World");

		// 文字列出力
		// System.out.println ("すがわら");
		// System.out.println ("31歳です");
		// System.out.println ("お酒が好きです");

		// 計算式
		// System.out.println ("31 + 31の計算をします");
		// System.out.println (35 - 10);
		// System.out.println (-5 * 2);
		// System.out.println (6 * 6 * 3.14);
		// System.out.println ("こたえは" + 64);

		// 変数計算
		// int x;
		// x = 6;
		// System.out.println (x * x * 3.14);

		// 変数の再代入
		// int age  = 20;
		// System.out.println("私の年齢は" + age);
		// age = 31;
		// System.out.println("・・・いや、本当の年齢は" + age);

		// 変えてはいけないものを定数宣言
		// final double TAX = 1.05;//定数宣言 final型 定数名(全大文字) = 初期値
		// int fax = 5;
		// System.out.println("5万円から4万円に値下げします");
		// fax = 4;
		// System.out.println("FAXの新価格(税込み)");
		// System.out.println(fax * TAX + "万円");

		int a = 3;
		int b = 5;
		int c = a * b;
		System.out.println("縦幅" + a + "横幅" + b + "の長方形の面積は、" + c);

		boolean result = true;
		char initial = '駆';
		double pi = 3.14;
		long number = 31224564321345L;
		String msg = "ミナトの攻撃！敵に１５ポイントのダメージを加えた。";

	}
}
// javaをプログラムを開発するためには、コンパイラとインタプリタというソフトウェアが必要です。
// コンパイラは、私たちがjavaの文法に沿って記述したソースコードをバイトコードに変換してくれます。
// インタプリタは内部に持っているJVMの仕組みを使って解釈しマシン語に変換してCPUが実行します。