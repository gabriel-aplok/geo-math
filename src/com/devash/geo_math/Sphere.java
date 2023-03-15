package com.devash.geo_math;

public class Sphere {
	public final Point center;
	public float radius;

	public Sphere() {
		this(new Point(), 0);
	}

	public Sphere(Sphere copyFrom) {
		this(copyFrom.center, copyFrom.radius);
	}

	public Sphere(final Point center, float radius) {
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

	public float getVolume() {
		return (float) (4 / 3 * Math.PI * Math.pow(radius, 3));
	}
}
