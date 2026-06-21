package LogicalStatements;

import java.util.Scanner;

public class Nakuri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = Sc.nextLine();
		System.out.println("Enter your age");
		int age = Sc.nextInt();

		if (age > 20) {
			System.out.println("Your eligible");

			System.out.println("Enter your mail id");
			Sc.nextLine();
			String mail = Sc.nextLine();
			if (mail.contains("@")) {
				System.out.println("Valid mail");

				System.out.println("enter mobile number");
				double number = Sc.nextDouble();
				if (number >= 10) {
					System.out.println("Enter otp");
					int otp = Sc.nextInt();

					if (otp >= 4) {
						System.out.println("valid");

						System.out.println("ENter your highest education");
						Sc.nextLine();
						String edu = Sc.nextLine();
						if (edu.equalsIgnoreCase("B.tech") || edu.equalsIgnoreCase("Degree")) {
							System.out.println("Good");
							
							System.out.println("Enter your percentage");
							double per = Sc.nextDouble();
							if (per >= 60.0) {
								System.out.println("Good marks");
							} else {
								System.out.println("Poor marks");
							}
						} else {
							System.out.println("Not connect");
						}
					} else {
						System.out.println("In valid");
					}
				} else {
					System.out.println("In valid number");
				}
			} else {
				System.out.println("in valid");
			}

		} else {
			System.out.println("not eligible");
		}

	}
}
