
abstract class Vehicle 
{
	abstract void start();

}
 class car extends Vehicle
{
	void start()
	{
		System.out.println("car start with key");
	}
}
 class Scooter extends Vehicle
 {
	 void start()
	 {
		 System.out.println("scooter start with kick");
	 }
	 public static void main(String[] args) {
		
		 car s=new car();
		 s.start();
		 Scooter s1=new Scooter();
		 s1.start();
	}
 }
