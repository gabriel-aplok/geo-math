package com.devash.geo_math;

public class Point {
    public float x;
    public float y;
    public float z;

	public Point() {
		this(0, 0, 0);
	}

	public Point(Point copyFrom) {
		this(copyFrom.x, copyFrom.y, copyFrom.z);
	}

    public Point(float x, float y) {
        this(x, y, 0);
    }

    public Point(float x, float y, float z) {
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

    public Point translate(Vector v) {
        x += v.getX();
        y += v.getY();
        z += v.getZ();
        return this;
    }

    public Point translateX(float delta) {
        x += delta;
        return this;
    }

    public Point translateY(float delta) {
        y += delta;
        return this;
    }

    public Point translateZ(float delta) {
        z += delta;
        return this;
    }
}
