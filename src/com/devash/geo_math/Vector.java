package com.devash.geo_math;

public class Vector {
	public float x;
	public float y;
	public float z;

	public Vector() {
		this(0, 0, 0);
	}

	public Vector(Vector copyFrom) {
		this(copyFrom.x, copyFrom.y, copyFrom.z);
	}

	public Vector(float x, float y) {
		this(x, y, 0);
	}

	public Vector(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getX() {
		return x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getY() {
		return y;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public float getZ() {
		return z;
	}

	public float length() {
		return (float) Math.sqrt((x * x) + (y * y) + (z * z));
	}

	public Vector crossProduct(Vector other) {
		float x_ = (y * other.z) - (z * other.y);
		float y_ = (z * other.x) - (x * other.z);
		float z_ = (x * other.y) - (y * other.x);

		return new Vector(x_, y_, z_);
	}

	public float dotProduct(Vector other) {
		return (x * other.x) + (y * other.y) + (z * other.z);
	}

	public Vector fromPoint(Point point) {
		x = point.getX();
		y = point.getY();
		z = point.getZ();

		return this;
	}

	public Vector scale(float scale) {
		x *= scale;
		y *= scale;
		z *= scale;

		return this;
	}
}
