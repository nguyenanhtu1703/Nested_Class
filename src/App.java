public class App {
	public static void main(String[] args) {
		CarParts carParts = new CarParts();
		System.out.println(CarParts.Wheel.InnerWheel.me);
		A.ok();
	}
}

class CarParts {
	public static int factoryID = 123;
	public class Wheel {
		public static final int factoryInnerID = 5;
		public Wheel() {
			System.out.println("Wheel factory ID: " + AnotherWheel.factoryInnerID2);
			ShowStaticMethodOfEnclosingClass();
		}
		public class InnerWheel {
			public static final int me = 8;
			public InnerWheel() {
				System.out.println("Inner wheel " + factoryID + " " + AnotherWheel.factoryInnerID2);
				ShowStaticMethodOfEnclosingClass();
			}
			public void Ok() {
			}
		}
	}
	
	public class AnotherWheel {
		public static final int factoryInnerID2 = 5;
		public AnotherWheel() {
			System.out.println("Wheel factory ID: " + factoryID);
			ShowStaticMethodOfEnclosingClass();
		}
		public class InnerWheel {
			public static final int me = 8;
			public InnerWheel() {
				System.out.println("Inner wheel " + factoryID + " " + Wheel.factoryInnerID);
				ShowStaticMethodOfEnclosingClass();
			}
			public void Ok() {
			}
		}
	}
	
	public CarParts() {
		System.out.println("Car parts object created!");
	}
	public static void ShowStaticMethodOfEnclosingClass() {
		System.out.println("yes");
	}
}

interface A {
	public static void ok() {
		System.out.println("lol");
	}
	public default void OK() {	
		System.out.println("LOL");
	}
}