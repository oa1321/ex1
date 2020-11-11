package Ex1;

import java.util.Scanner;

public class Ex1 {
	public static int gcd(int n1, int n2) {
		if (n2 == 0)
			return n1;
		return gcd(n2, n1%n2);
	}
	
	public static int get_max_prime2(int max) {
		for (int i = 2 ; i <= max; i++ ) {
			if(max%i == 0 ) {
				if(max/i > 1) {
					return get_max_prime2(max/i);
				}
				else {
					return i ;
				}
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		//Receiving 2 natural numbers by input or args
		//printing the great common prime divider of these two numbers
		
		//TODO Auto-generated method stub
				Scanner inputy = new Scanner(System.in);
				int a;
				int b;
				if (args.length > 0) {
					a = Integer.parseInt(args[0]);
					b = Integer.parseInt(args[1]);
							
				}
				else {
					System.out.print("Enter the first number: ");
					a = inputy.nextInt();
					System.out.print("Enter the second number: ");
					b = inputy.nextInt();							
				}	
				System.out.println("Max prime common divider: ");
				System.out.println(get_max_prime2(gcd(a,b)));	
				inputy.close();
	}
}
