abstract class Animal{
	String name;
	abstract String sound(); //all classes that implement Animal must have a sound method
}
class Cat extends Animal{
	public Cat(){
		this.name = "Tomy";
	}
	public String sound(){
		return "Meow! (This is abstraction Example)";
	}
}
public class AbstructionExample{
	public static void main (String args[]){
		Cat cat = new Cat();
		System.out.println("Sound of cat is "+cat.sound());
	}
}