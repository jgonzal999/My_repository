package typecasting;

public class DemoTest {

	public static void main(String[] args) {
		// int family
		//long phonenumber=8765678765; //da error pq ese numero es por defecto de otro tipo
		long phonenumber = 8765678765l;
		byte a =10;
		short b=a; //implicit type casting
		System.out.println("a " + a);
		System.out.println("b " + b);
		
		short c =129;//para d 127 ok pero 129 da -127 pq no llega
		//byte d=c error
		byte d = (byte)c;//expilit type casting
		System.out.println("c " + c);
		System.out.println("d " + d);
		// int to float or double
		
		int m=10;
		float n=m; //implicit
		System.out.println("c " + c);
		System.out.println("d " + d);
		// float o=10;
		// float o=10.0; //error pq 10.0 se considera double por defecto
		float o=(float)10.0;//explicit
		float p=10.0f;//es igual que la anterior
		int q=(int)o;
		System.out.println("o " + o);
		System.out.println("p " + p);
		System.out.println("q " + q);
		

	}

}
