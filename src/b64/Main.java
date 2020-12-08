package b64;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Main {
	public static void main(String[] args) throws InterruptedException {
		String in1;
		Scanner input = new Scanner(System.in);
		while (true) {
			
			System.out.println("Welcome to base64 translator\nby Gav06");
			System.out.println("Enter 1 to ENCODE to base64\nEnter 2 to DECODE from base64");
			
			System.out.print("> ");
			in1 = input.nextLine();
			System.out.println("\n");
			
			if (in1.equalsIgnoreCase("1")) {
				System.out.println("Please enter a string to encode: ");
				
				System.out.print("> ");
				in1 = input.nextLine();
				System.out.println("\n");
				System.out.println("Encoded string: \n" + b64utils.encode(in1));
				Thread.sleep(1);
				System.out.println("looping....");
				Thread.sleep(1);
			} else if (in1.equalsIgnoreCase("2")) {
				System.out.println("Please enter a string to decode: ");
				
				System.out.print("> ");
				in1 = input.nextLine();
				System.out.println("\n");
				System.out.println("Decoded string: \n" + b64utils.decode(in1));
				Thread.sleep(1);
				System.out.println("\n\nlooping....\n\n");
				Thread.sleep(1);
			}
		}
	}
}
