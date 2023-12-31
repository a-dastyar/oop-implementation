package ir.fanapcamps.triangle;

class Triangle {

    private static final double precision = 0.000001d;
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if (side1 == 0 || side2 == 0 || side3 == 0) {
            throw new TriangleException();
        }
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            throw new TriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    boolean isEquilateral() {
        return Math.abs(side1 - side2) < precision && Math.abs(side1 - side3) < precision;
    }

    boolean isIsosceles() {
        return Math.abs(side1 - side2) < precision || Math.abs(side1 - side3) < precision || Math.abs(side2 - side3) < precision;
    }

    boolean isScalene() {
        return !isEquilateral() && !isIsosceles();
    }

}
