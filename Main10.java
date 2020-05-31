// 宣言範囲
// private = 自分自身のクラスのみ
// package private = 自分と同じパッケージに属するクラス
// protected = 自分と同じパッケージに属するか、自分を継承したクラス
// public = 全てのクラス

// getterメソッド=ある特定のフィールド値を単に取り出すだけのメソッド
// public 値を取り出すフィールドの型 getフィールド名() {
// 	戻り値がboolean型の場合のみisXXX()という名前になる
// 	return this.フィールド名;
// }

// setterメソッド=フィールドに値を代入するメソッド
// public void setフィールド名(フィールド型 任意の変数名) {
// 	this.フィールド=任意の変数名;
// }

// privete String name;
// public void setName(String name) {
// 	if(name == nill) {
// 		throw new IllegalAccessException("名前がnullである。処理を中断");
// 	}
// 	if(name.length() <= 1) {
// 		throw new IllegalAccessException("名前が短すぎる");
// 	}
// 	if(name.length() >= 8) {
// 		throw new IllegalAccessException("名前が長すぎる");
// 	}
// }
// throw new IllegalAccessException()=プログラムを強制終了できる

public class Wand{
	private String name;
	private double power;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalAccessException("名前が異常です。")
		}
		this.name = name;
	}
	public double getPower() {
		return this.power;
	}
	public void setPower(double power) {
		this.power = power;
		if(power > 0.5 || power < 100.0) {
			throw new IllegalAccessException("数値がおかしいです")
		}
	}
}

public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public int getHp() {
		return this.hp;
	}
	public void setHp() {
		if(hp < 0) {
			this.hp = 0;
		}else
			{ this.hp = hp;
		}
	}
	public int getMp() {
		return this.mp;
	}
	public void setMp() {
		if(hp > 0) {
			throw new IllegalAccessException("MPが異常です。")
		}
		this.mp = mp;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalAccessException("名前が異常です。")
		}
		this.name = name;
	}
	public Wand getWand() {
		return this.wand;
	}
	public void setWand(Wand wand) {
		if(wand == null) {
			throw new IllegalAccessException("杖がnullです")
		}
		this.wand = wand;
	}

	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}
}