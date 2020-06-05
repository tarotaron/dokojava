instanceof 演算子(変数を型名の箱に代入可能ならばtrueが返る)
if(c instanceof SuperHero) {
	SuperHero h = (SuperHero) c;
	h.fly();
}

public final class A extends Y {
	public void a() {
		System.out.println("Aa");
	}
	public void b() {
		System.out.println("Ab");
	}
	public void c() {
		System.out.println("Ac");
	}
}

public class B extends Y {
	public void a() {
		System.out.println("Ba");
	}
	public void b() {
		System.out.println("Bb");
	}
	public void c() {
		System.out.println("Bc");
	}
}

public interface X {
	void a();
}
public abstract class Y implements X {
	public abstract void a();
	public abstract void b();
}

public class Main{
	public static void main(String[] args) {
		Y[] array = new Y[2];
		array[0] = new A();
		array[1] = new B();
		for(Y y : array) {
			y.b();
		}
	}
}