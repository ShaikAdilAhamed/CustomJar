package in.corejava;



class Animalss{
	void sound(){
		System.out.println("Animal Sound method");
	}
}

class Dogss extends Animalss{
	void sound() {
		System.out.println("Dog Sound method");
	}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		Dogss dog=new Dogss();
		dog.sound();

	}

}


