public class Main5 {
	// public static void main(String[] args) {

		// メソッド定義 public static 戻り値の型(void(戻り値がない場合),String(戻り値が文字列),int(戻り値が整数)) メソッド名 (引数)
		// メソッド呼び出し [戻り値なしの場合]メソッド名（引数）[戻り値ありの場合]型 変数名 = メソッド名(引数)
		// 引数渡し方 何も渡さない:メソッド名()
		// 		 値を一つ渡す:メソッド名(値)
		// 		 複数渡す:メソッド名(値,値)

	// 	int ans = add(100, 10);
	// 	System.out.println("100 + 10 = " + ans);
	// }
	// public static int add (int x, int y) {
	// 	int ans = x + y;
	// 	return ans;
	// }

	// public static int add (int x, int y) {
	// 	int ans = x + y;
	// 	return ans;
	// }
	// public static void main(String[] args) {
	// 	System.out.println(
	// 		add(add(10, 20), add(30, 40)));
	// }

	// メソッド名が同じでも引数の型が異なるor引数の個数が異なる場合はOK（オーバーロード）
	// public static int add (int x, int y) {
	// 	return  x + y;
	// }
	// public static double add (double x, double y) {
	// 	return  x + y;
	// }
	// public static String add (String x, String y) {
	// 	return  x + y;
	// }

	// public static void main(String[] args) {
	// 	System.out.println(add(10, 20));
	// 	System.out.println(add(3.5, 2.7));
	// 	System.out.println(add("hello", "world"));
	// }

	// public static void printArray (int[] array) {
	// 	for(int element : array) {
	// 		System.out.println(element);
	// 	}
	// }
	// public static void main(String[] args) {
	// 	int[] array = {1, 2, 3};
	// 	printArray(array);
	// }

	// public static void incArray (int[] array) {
	// 	for(int i = 0; i < array.length; i++) {
	// 		array[i]++;
	// 	}
	// }
	// public static void main(String[] args) {
	// 	int[] array = {1, 2, 3};
	// 	incArray(array);
	// 	for(int i : array) {
	// 		System.out.println(i);
	// 	}
	// }

	// 配列名.length=配列数 ｜ 文字列変数名.length()=文字数 *文字列は()がいる
	// public static int[] makeArray (int size) {
	// 	int[] newArray = new int[size]
	// 	for(int i = 0; i < newArray.length; i++) {
	// 		newArray[i] = i;
	// 	}
	// 	return newArray;
	// }
	// public static void main(String[] args) {
	// 	int[] array = makeArray(3);
	// 	for(int i : array) {
	// 		System.out.println(i);
	// 	}
	// }

	// public static void introduceOneself () {
	// 	String name = "suzu";
	// 	int age = 24;
	// 	double heigth = 154.5;
	// 	char sex = '女';
	// 	System.out.println(name + age + "歳" + heigth + "cm" + sex + "です");
	// }
	// public static void main(String[] args) {
	// 	introduceOneself();
	// }

	// public static void email (String title, String address, String text) {
	// 	System.out.println(address + "に以下のメールを送信しました。");
	// 	System.out.println("件名:" + title);
	// 	System.out.println("本文:" + text);
	// }
	// public static void email (String address, String text) {
	// 	System.out.println(address + "に以下のメールを送信しました。");
	// 	System.out.println("件名:無題");
	// 	System.out.println("本文:" + text);
	// }
	// public static void main(String[] args) {
	// 	email("こんにちは", "aaa@aa.com", "勉強中");
	// 	email("aaa@aa.com", "勉強中");
	// }

	public static double calcTriangleArea (double bottom, double heigth) {
		double triangleArea = bottom * heigth / 2;
		return triangleArea;
	}
	public static double calcCircleArea (double radius) {
		double circleArea = radius * radius * 3.14;
		return circleArea;
	}
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.0, 5.0);
		double circleArea = calcCircleArea(5.0);
		System.out.println("三角形の面積" + triangleArea + "平方cm");
		System.out.println("円の面積" + circleArea + "平方cm");
	}
}