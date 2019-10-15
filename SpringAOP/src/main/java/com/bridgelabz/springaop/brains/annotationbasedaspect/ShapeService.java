/******************************************************************************
 *  Purpose: Program is written for where all object of classes are hold
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   15-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.springaop.brains.annotationbasedaspect;

public class ShapeService {
	
	private Circle annocircle;
	private Triangle annotriangle;
	@Loggable
	public Circle getAnnocircle() {
		System.out.println("Circle getter");
		return annocircle;
	}
	public void setAnnocircle(Circle annocircle) {
		this.annocircle = annocircle;
	}
	public Triangle getAnnotriangle() {
		System.out.println("Triagle getter");
		return annotriangle;
	}
	public void setAnnotriangle(Triangle annotriangle) {
		this.annotriangle = annotriangle;
	}


}
