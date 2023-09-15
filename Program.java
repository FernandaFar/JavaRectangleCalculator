package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle Rectangle = new Rectangle();
		System.out.println("Enter Rectangle Width and height: ");
		Rectangle.width = sc.nextDouble();
		Rectangle.height = sc.nextDouble();
				
		System.out.printf("area = %.2f %n" , Rectangle.area());
		System.out.printf("Perimeter = %.2f %n" , Rectangle.perimeter());
		System.out.printf("diagonal = %.2f %n" , Rectangle.diagonal());
		
		sc.close();
	}
}
