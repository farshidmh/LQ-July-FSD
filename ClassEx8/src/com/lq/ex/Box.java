package com.lq.ex;

public class Box {

	private double width;
	private double height;
	private double length;

	public Box(double w, double h, double l) {

		setWidth(w > 0 ? w : 1);

		setLength(l > 0 ? l : 1);

		setHeight(h > 0 ? h : 1);

	}

	public Box(double side) {
		this(side, side, side);
	}

	public double getVolume() {

		double volume = getWidth() * getHeight() * getLength();

		return volume;

	}

	public double getSurfaceArea() {

		double surface = (getWidth() + getHeight() + getLength()) * 2;

		return surface;

	}

	public void printBox() {
		if (getWidth() == 0 || getHeight() == 0 || getLength() == 0) {
			System.out.println("Invalid Properties");
		} else {

			System.out.println("Length=" + getLength());
			System.out.println("Width=" + getWidth());
			System.out.println("Height=" + getHeight());
			System.out.println("Volume=" + getVolume());
			System.out.println("Surface Area=" + getSurfaceArea());
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width <= 0) {
			System.out.printf("Width (%s) must be a positive number", width);
			return;
		}
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height <= 0) {
			System.out.printf("Height (%s) must be a positive number", height);
			return;
		}
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if (length <= 0) {
			System.out.printf("Length (%s) must be a positive number", length);
			return;
		}
		this.length = length;
	}

}
