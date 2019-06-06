
public class PopcornMaker {

	public static void main(String[] args) {
	Popcorn cool = new Popcorn("pasta");
	Microwave pizza = new Microwave();
     pizza.putInMicrowave(cool);
     pizza.setTime(2);
   pizza.startMicrowave();
    //cool.eat();
     
	}
	}


