package Week2;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double width, depth, height, area, volume;
		Scanner input = new Scanner(System.in);
		
		System.out.print("직육면체 밑면의 가로를 입력하시오: ");
		width = input.nextDouble();
		
		System.out.print("직육면체 밑면의 세로를 입력하시오: ");
		depth = input.nextDouble();
		
		System.out.print("직육면체의 높이를 입력하시오: ");
		height = input.nextDouble();
		
		area = 2 * (width * depth + depth * height + height * width);
		volume = width * depth * height;
		
		System.out.println("직육면체의 표면적은 " + area + "\n직육면체의 부피는 " + volume);
		
		input.close();
	}
}
