package com.devash.geo_math;

public class Ray {
	public final Point start;
	public final Vector direction;

	public Ray() {
		this(new Point(), new Vector());
	}

	public Ray(Ray copyFrom) {
		this(copyFrom.start, copyFrom.direction);
	}

	public Ray(final Point start, final Vector direction) {
		this.start = start;
		this.direction = direction;
	}

	public Point getStart() {
		return start;
	}

	public Vector getDirection() {
		return direction;
	}
}
