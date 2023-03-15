package com.devash.geo_math;

public class Circle {
    public final Point center;
    public float radius;

	public Circle() {
		this(new Point(), 0);
	}

	public Circle(Circle copyFrom) {
		this(copyFrom.center, copyFrom.radius);
	}

	public Circle(final Point center, float radius) {
		this.center = center;
		this.radius = radius;
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

    public Circle scale(float scaleFactor) {
        return new Circle(center, radius * scaleFactor);
    }
}
