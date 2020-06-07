例外処理
try{
	通常事項される文
} catch(抽象的な例外クラス 変数) {
	例外発生時に実行される文
}

・複数の例外を変数で条件分けできる
try{
	通常事項される文
}catch(例外クラス 変数) {
	例外発生時に実行される文
}

・後片付け処理のある例外処理
try{
	通常事項される文
}catch(例外クラス 変数) {
	例外発生時に実行される文
}finally {
	例外があってもなくても処理
}

スロー宣言（呼び出しメソッドにエラーが生じた場合に親元がエラーを処理する）
アクセス修飾 戻り値 メソッド名（引数リスト）throws 例外クラス {
	メソッドの処理内容
}
								（Exceptionよりも詳しいエラー）
public static void subsub() throws IOExceotion {
	FileWriter fw = new FileWriter ("data.txt");
}

public class Main15 {
	public static void main(String[] args) {
		String s = null;
		System.out.println(s.length());
	}
}

public class Main() {
	public static void main(String[] args) {
		try{
			String s = null;
		System.out.println(s.length());
		} catch(NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました")
			System.out.println("ーースタックレース（ここから）ーー")
			e.printStackTrace();
			System.out.println("ーースタックレース（ここまで）ーー")
		}
	}
}

public class Main15{
	public static void main(String[] args) {
		try{
			int i = interger.parseInt("三");
		}catch( NumberFormatException e) {
			System.out.println("例外NumberFormatExceptionをcatchしました")
		}
	}
}

import java.io.IOExceotion;
public class Main15 {
	public static void main(String[] args) throws IOExceotion {
		System.out.println("プログラムが起動しました");
		throw new IOExceotion();
	}
}