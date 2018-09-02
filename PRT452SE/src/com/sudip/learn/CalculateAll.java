package com.sudip.learn;

import java.util.Scanner;

public class CalculateAll implements Slope, Distance, Equation {

	@Override
	public String equation(float x1, float y1, float slope) {
		// TODO Auto-generated method stub
		float output = y1 - (slope*x1);
		String res= "y -"+slope+"x =" +output;
		return res;
	}

	@Override
	public float distance(float x1, float y1, float x2, float y2) {
		// TODO Auto-generated method stub
		float res = (float) Math.sqrt((x2 - x1)*(x2 - x1)+ (y2 - y1)*(y2 - y1));
		return res;
	}

	@Override
	public float slope(float x1, float y1, float x2, float y2) {
		// TODO Auto-generated method stub
		float res= (y2 - y1)/(x2 - x1);
		return res;
	}
	
	public static void main(String[] args){
		float x1, x2, y1, y2;
		float dist;
		float slope;
		String equation;
		
		final CalculateAll test;
		test= new CalculateAll();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x1 for point 1: ");
		x1 = scan.nextFloat();
		System.out.println("Enter y1 for point 1: ");
		y1 = scan.nextFloat();
		System.out.println("Enter x2 for point 2: ");
		x2 = scan.nextFloat();
		System.out.println("Enter y2 for point 2: ");
		y2 = scan.nextFloat();
		
		slope = test.slope(x1, y1, x2, y2);
		dist = test.distance(x1, y1, x2, y2);
		equation = test.equation(x1, y1, slope);
		
		System.out.println("The distance between two points is: "+dist+".");
		System.out.println("The gradient between two points is: "+slope+".");
		System.out.println("The equation of line between two points is: "+equation+".");
	}


	}
