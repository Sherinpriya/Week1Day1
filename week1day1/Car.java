package week1day1;

public class Car {

		public void applyBreak() {
			System.out.println("Applied break");
			
		}
	
		public void soundHorn() {
			System.out.println("Sound horn");
			
		}
	
	public static void main(String[] args) {
		Car obj = new Car();
		obj.applyBreak();
		obj.soundHorn();
	}
	
}
