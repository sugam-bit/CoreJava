package typecasting;

public class type {

	public static void main(String[] args) {
		String name = "chitra";
		System.out.println("Hello " + name);
		// variable display
		
		int newInt =3;
		double newChar = newInt;
		System.out.println(newChar);
		System.out.println(newInt);
		//widening typecasting
		
		double d =6.39;
		int i = (int)d;
		System.out.println(d);
		System.out.println(i);
		//narrowing typecasting
		
		float f = 11.4f;
		int z= (int)f;
		System.out.println(f);
		System.out.println(z);
		
		int x=010;
		int w=07;
		System.out.println(x);
		System.out.println(w);
		
		

	}

}
