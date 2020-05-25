public class Main2 {
	public static void main(String[] args) {
		// int a;
		// int b;
		// a = 20;
		// b = a + 5;
		// System.out.println(a);
		// System.out.println(b);

		// System.out.print//改行せずに出力

		// int m = Math.max(①,②) //どちらか大きい方が代入される

		// int n = Integer.parselnt()//文字列を数字に変換する
		// String age = "31";
		// int n = Interger.parselnt(age);
		// System.out.println("あなたは来年、" + (n + 1) + "歳になりますね")

		// int r = new java.util.Random().nextlnt();//nextInt(0以上)の中からランダムな数字を代入


		// String input = new java.util.Scanner(System.in).nextLine();//キーボードからの入力を代入（文字列）
		// int input = new java.util.Scanner(System.in).nextInt();//（整数）

		int x = 5;
		int y = 10;
		String ans = "x+yは" + (x + y);
		System.out.println(ans);

		System.out.println("ようこそ占い館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");

	}
}