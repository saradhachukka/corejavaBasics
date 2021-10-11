package com.basic;
public class Point2D {

	 private int X,Y;
	 public  Point2D(int x, int y){
 	    X = x;
 	    Y = y;
   }
	 public String getDetails() {
		 return "Point("+X+","+Y+")";
	 }
	 public void Details() {
		 System.out.println("x and y c0-ords " + X+ " "+Y);
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     Point2D p1 = new Point2D(10,20);
     
	}

}
