package com.devash.geo_math;

public final class GeoMath {
	private GeoMath() {}

	public static Vector vectorBetween(final Point from, final Point to) {
		return new Vector(
			to.x - from.x,
			to.y - from.y,
			to.z - from.z
		);
	}

	public static float distanceBetween(final Point point, final Ray ray) {
		final Vector p1ToPoint = vectorBetween(ray.start, point);
		final Vector p2ToPoint = vectorBetween(ray.start.translate(ray.direction), point);
		final float areaOfTriangleTimeTwo = p1ToPoint.crossProduct(p2ToPoint).length();
		final float lengthOfBase = ray.direction.length();

		return areaOfTriangleTimeTwo / lengthOfBase;
	}

	public static boolean intersects(final Sphere sphere, final Ray ray) {
		return distanceBetween(sphere.center, ray) < sphere.radius;
	}

	public static Point intersectionPoint(final Ray ray, final Plane plane) {
		final Vector rayToPlaneVector = vectorBetween(ray.start, plane.reference);
		final float scaleFactor = rayToPlaneVector.dotProduct(plane.normal) / ray.direction.dotProduct(plane.normal);

		return ray.start.translate(ray.direction.scale(scaleFactor));
	}
}
