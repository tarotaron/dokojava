public class Hero {
	String name = "ミナト";
	int hp = 100;

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("５ポイントのダメージを与えた");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
}

// 継承定義
// class クラス名 extends 元となるクラス名 {親クラスとの差}

public class SuperHero extends Hero {
	private boolean flying;

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}
親クラスに定義してあるが、再定義で書き換える事ができる
	public coid run() {
		System.out.println("撤退した");
	}
}

public class Main11 {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.run();
		SuperHero sh = new SuperHero();
		sh.run();
	}
}