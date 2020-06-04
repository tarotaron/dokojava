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
	public void run() {
		System.out.println("撤退した");
	}
	public void attack (Matango m) {
		super.attack(m);
		if(this.flying)
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


public class Matango {
	int hp = 50;
	private char suffix;
	public Matango(char suffix)
	this.suffix = suffix;
	}
	public void attack(Hero h) {
		System.out.println("きのこ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.setHp(h.getHp() -10);
	}

public class PoisonMatago extends Matango {
	private int poison = 5;
	public PoisonMatago(char suffix) {
		super(suffix);
	}
	public void attack(Hero h) {
		super.attack();
		if(poison > 0) {
			System.out.println("さらに毒の胞子をばらまいた");
			int dmg = h.getHp() / 5;
			h.setHp(h.getHp() - dmg);
			System.out.println(dmg + "ポイントのダメージ");
			this.poison--;
		}
	}
}