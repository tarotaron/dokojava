// package calcapp.main;
// 		// package文 (親子関係、階級関係はない＊ネストしない)
// 		// package 所属させたいパッケージ名;(コードの先頭に記述)
// import calcapp.logics.CalcLogic;//(クラス名指定)
// import calcapp.logics.*;//(packege内の全てのクラス指定)
// 		// import文
// 		// import パッケージ名.クラス名;
// public class Main6 {
// 	public static void main(String[] args) {
// 		int a = 10; int b = 2;
// 		int total = calcapp.logics.CalcLogic.tasu(a,b);
// 		int delta = calcapp.logics.CalcLogic.hiku(a,b);
// 		System.out.println("足したら" + total + "、引いたら" + delta);
// 	}
// }

import comment.Zenhan;
public class Main6 {
	public static void main(String[] args) throws Exception {
		Zenhan.doWarusa();
		Zenhan.doTogame();
		comment.Kouhan.callDeae();
		comment.Kouhan.showMondokoro();
	}
}