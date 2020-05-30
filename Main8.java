import java.util.*;

public class Main8 {
	public static void main(String[] args) {

	}
}

public class Cleric {
	String name;
	int hp = 50;
	fainal int MAX_HP = 50;
	int mp = 10:;
	fainal int MAX_MP = 10;

	public void selfAid() {
		System.out.println("セルフエイドを唱えた！");
		this.hp = this.MAX_HP;
		this.mp -= 5;
		System.out.println("HPがMAXまで回復した！");
	}

	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った");
		// 回復 = 0〜2までのランダム整数+引数の秒数
		int recover = new Radom().newInt(3) + sec;
		// 実際に回復 = Math.minで小さい方を取得(最大MPから今のMPを引いた数 or 回復値)
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		this.mp = recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
}
