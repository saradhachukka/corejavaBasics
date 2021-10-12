package com.basic;
import java.util.Scanner;

public class TestPoint {
	
	public static void main(String[] args) {
	     int x,y;
		 Scanner sc = new Scanner(System.in);
		 System.out.print("enter x value:");
         x = sc.nextInt();
         System.out.print("enter y value");
         y=sc.nextInt();
         
         Point2D pt1 = new Point2D(x, y);
         System.out.print("Enter x cordinate:");
         x= sc.nextInt();
         System.out.print("enter y cordinate");
         y=sc.nextInt();
         pt1.getDetails();
         
         Point2D pt2 = new Point2D(x,y);
         
         System.out.println("");
         
         //to get the point details
         
         System.out.println("1st point"+pt1.getDetails());
         System.out.println("2nd point"+pt2.getDetails());
         
         
         
         //to create point with offset value
         
         Point2D pt3 = pt1.createNewPoint(5,-2);
         System.out.println("3rd point"+pt3.getDetails());
         
         //to check if points are equal or not
         
       if(pt1.isEqual(pt2)) {
    	   System.out.println("Both points are equal");
       }
       else {
    	   System.out.println("p1 and p2 are not equal");
       }
        //To calculate distance b/w points
       System.out.println("distance b/w p1 and p2 is"+pt1.calcDistance(pt2));
         
		     
		     
		     
		
	             
	}

}
