package methodoverloading;

import java.util.Scanner;

class Types{
	void A(short a,short b) {
		System.out.println("additi0n of values= "+(a+b));

	}
	void A(int x,int y) {
		System.out.println("sum of the value= "+(x+y));
	}
}
public class typesofparameters {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Types obj = new Types();
	System.out.println("enter the values");
	obj.A(sc.nextShort(),sc.nextShort());
	System.out.println("enter the numbers");
	obj.A(sc.nextInt(),sc.nextInt());
	

	}

}
