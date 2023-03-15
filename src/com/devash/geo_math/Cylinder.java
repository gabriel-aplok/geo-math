package com.devash.geo_math;

public class Cylinder {
	public final Point center;
	public float radius;
	public float height;

	public Cylinder() {
		this(new Point(), 0, 0);
	}

	public Cylinder(Cylinder copyFrom) {
		this(copyFrom.center, copyFrom.radius, copyFrom.height);
	}

	public Cylinder(final Point center, float radius, float height) {
		this.center = center;
		this.radius = radius;
		this.height = height;
	}

	public Point getCenter() {
		return center;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getHeight() {
		return height;
	}
}
