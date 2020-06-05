public class Character {
	String name;
	int hp;

	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	public void attack(Matongo m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に？ポイントのダメージを与えた！");
		m.hp -= ??;
	}
}

詳細未定義メソッド(空メソッドなのかまだ確定していないメソッドなのか判別する為に用いる)
			アブストリクト(抽象的、曖昧)
アクセス修飾子 abstract 戻り値 メソッド名(引数リスト);

一つでも抽象メソッドを含むクラス宣言(未完成はnewしてはならない)
アクセス修飾子 abstract class クラス名{}

抽象メソッドattack()を持つCharacterクラスを宣言
public abstract class Character {
	String name;
	int hp;

	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	public abstract void attack(Matongo m) {
	}
}
特に抽象度が高い抽象クラス
インターフェースの宣言(全てのメソッドは抽象メソッド、フィールドを一つも持たないが定数は持つ事ができる)
アクセス修飾子 interface インターフェース名{
	public interface Creature {
		public abstract void run();
	}
}
public interface CleanService {
	Shirt washShirt(Shirt s);
	Towl washTowl(Towl c);
	Coat washCoat(Coat c);
}

public class KyotoCleanShop{
	インタフェースを継承する場合はimplementsを用いる(複数の親インターフェースによる多重継承ができる)
	implements CleaningService {
		private String ownerName;
		private String address;
		private String phone;

		public Shirt washShirt(Shirt s) {
			return s
		}
		public Towl washTowl(Towl c){

		}
		public Coat washCoat(Coat c){

		}
	}
}

public abstract class Asset {
	private String name;
	private int price;

	public Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	public int price() {
		return this.price;
	}
}

public abstract class TangibleAsset extends Asset implements Thing{
	// private String name;
	// private int price;
	private String color;
	private double weight;

	public TangibleAsset(String name, int price,  String color) {
		super(name,price);
		// this.name = name;
		// this.price = price;
		this.color = color;
	}
	// public String getName() {
	// 	return this.name;
	// }
	// public int price() {
	// 	return this.price;
	// }
	public String color() {
		return this.color;
	}
	public double getWeight() {
		return this.weight;
	}
	public void setWeight(double weight){
		this.weight = weight
	}
}

public class Book extends TangibleAsset {
	private String isbn;
	public Book(String name, int price, String color, String isin);
	super(name, price, color);
	this.isbn = isbn;
}
	public String isin() {
		return this.String isin;
	}
public class Computer extends TangibleAsset {
	private String makerName;
	public Book(String name, int price, String color, String makerName);
	super(name, price, color);
	this.makerName = imakerName;
}
	public String makerName() {
		return this.String makerName;
	}

public interface Thing{
	double getWeight();
	void setWeight(double weight);
}
