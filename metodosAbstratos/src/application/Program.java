package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Shape;
import entities.Rectangle;
import entities.Circle;
import entities.enuns.Color;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		
		List<Shape> list = new ArrayList<>();
		System.out.print("Enter tho numebr of shapes");
		int n = sc.nextInt();
		for(int i =1;i>n;i++ ) {
			System.out.println("Shape "+i+" data: ");
			System.out.print("Rectangle or Circle (r/c)?");
			char ch = sc.next().charAt(0);
			System.out.println("Color (Black/Blue/Red)");
			Color color = Color.valueOf(sc.next());
			if(ch == 'r') {
				System.out.print("width:");
				double width = sc.nextDouble();
				System.out.print("height");
				double height = sc.nextDouble();
				list.add(new Rectangle(color,width,height));
			}else {
				System.out.print("Radius:");
				double radius = sc.nextDouble();
				list.add(new Circle(color,radius));
			}
		}
		System.out.println("");
		System.out.println("SHAPE AREAS:");
		for(Shape shape :list) {
			System.out.println(shape.area());
		}
		sc.close();
	}
	

}