import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rem;
		System.out.print("Enter the no: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		while(num>0) {
			rem = num%10;
			System.out.print(rem);
			num = num/10;
			scan.close();
			
		}

	}

}
