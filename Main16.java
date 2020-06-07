import java.io.*;
public class Main16{
	public static void main(String[] args) throws Exception {
		String filename = "c:¥¥test.txt";//ファイル名セット
		FileReader fr = new FileReader(filename);//ファイルを開く
		char c1 = (char)fr.read();//最初の一文字を読む
		char c2 = (char)fr.read();//次の一文字を読む
		fr.close()	;//閉じる

		fw.write('そ');
		fw.write('れ');
		fw.close()	;
	}
}