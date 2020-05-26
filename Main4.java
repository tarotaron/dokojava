public class Main4 {
	public static void main (String[] args) {
		// 配列 要素の型[] 配列名 = {値}
		// int[] score = {20, 30, 40, 50}

		// 拡張for文 for(要素の型 変数名:配列名)
		// scoreに入っている値がvalueに一つずつ格納される
		// for(int value : score)

		// 多次元配列 要素の型[][] 配列名 = {{1行目},{2行目}}
		// int[][] score = {{20, 30, 40, 50},{20, 30, 40, 50}}

		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];

		int[] moneyList = {121902, 8302, 55100};
		for(int i = 0; i < moneyList.length; i++){
			System.out.println(moneyList[i]);
		}
		for(int volue : moneyList) {
			System.out.println(volue);
		}

		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for(int volue : numbers) {
			if(volue == input) {
				System.out.println("あたり");
			}
		}
	}
}