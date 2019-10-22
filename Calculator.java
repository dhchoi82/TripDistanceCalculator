import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] kms = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		int input = 0, init = 100000000, end = 0;
		
		for(int i = 0; input >= 0 && i < kms.length; i++) {
			System.out.print("Mileage: ");
			input = scan.nextInt();
			kms[i] = input;
		}
		
		Arrays.sort(kms);
		
		for(int i = 0; i < kms.length - 1; i++) {
			if(kms[i] < 0) {
				continue;
			} else {
				System.out.println("From " + kms[i] + " To " + kms[i+1] + " : " + (kms[i+1] - kms[i]));
				
				if(kms[i] < init) {init = kms[i];}
				if(kms[i+1] > end) {end = kms[i+1];}
			}
		}
		
		System.out.println("Total: From " + init + " To " + end + " : " + (end - init));

	}

}
