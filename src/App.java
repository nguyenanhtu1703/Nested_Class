public class App {
	public static void main(String[] args) {
		CarParts carParts = new CarParts();
		CarParts.Wheel wheel = new CarParts.Wheel();
		CarParts.Wheel.InnerWheel InnerWheel = wheel.new InnerWheel();
	}
}

class CarParts {
	public static int factoryID = 123;
	public static class Wheel {
		public static int factoryInnerID = 5;
		public Wheel() {
			System.out.println("Wheel factory ID: " + factoryID);
			ShowStaticMethodOfEnclosingClass();
		}
		public class InnerWheel {
			public InnerWheel() {
				System.out.println("Inner wheel " + factoryID + " " + factoryInnerID);
				ShowStaticMethodOfEnclosingClass();
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
