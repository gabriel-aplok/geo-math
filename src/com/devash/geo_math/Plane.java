package com.devash.geo_math;

public class Plane {
	public final Point reference;
	public final Vector normal;

	public Plane() {
		this(new Point(), new Vector());
	}

	public Plane(Plane copyFrom) {
		this(copyFrom.reference, copyFrom.normal);
	}

	public Plane(final Point reference, final Vector normal) {
		this.reference = reference;
		this.normal = normal;
	}

	public Point getReference() {
		return reference;
	}

	public Vector getNormal() {
		return normal;
	}
}
