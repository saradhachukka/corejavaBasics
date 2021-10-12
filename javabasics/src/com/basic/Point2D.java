package com.basic;
import java.lang.Math;



public class Point2D {
	private int x,  y;
	
	public Point2D(int x, int y) {
		 this.x = x;
		 this.y = y;
	}
	public String getDetails() {
		return  "Point (" +x+ ","+y+")";
	}
	public boolean isEqual(Point2D pt) {
		 if(this.x ==pt.x && this.y == pt.y) {
			 return true;
		 }
		 else {
			 return false;
		 }
	}
   public Point2D createNewPoint(int xoff, int yoff) {
	   return new Point2D(this.x+xoff, this.y+yoff);
  }
   public double calcDistance(Point2D pt) {
	   return Math.sqrt(Math.pow(pt.x-this.x,2)+Math.sqrt(Math.pow(pt.y-this.x, 2)));
   }
}
