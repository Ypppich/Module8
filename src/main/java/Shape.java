public abstract class Shape {
    private String color;
    private double area;
    public abstract String getName();
    public abstract double areaCalculation();

    public String getColor() {
        return color;
    }

    public Shape(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double areaCalculation() {
        return radius * radius * Math.PI;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String getName() {
        return "Square";
    }
    @Override
    public double areaCalculation() {
        return side * side;
    }
}

class Triangle extends Shape {
    private double sideA, sideB, sideC;


    public Triangle(double sideA, double sideB, double sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double areaCalculation() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p *(p - sideA) * (p - sideB) * (p - sideC));
    }
}

class Trapezium extends Shape {
    private double side1;
    private double side2;
    private double height;

    public Trapezium(double side1, double side2, double height, String color) {
        super(color);
        this.side1 = side1;
        this.side2= side2;
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getName() {
        return "Trapezium";
    }
    @Override
    public double areaCalculation() {
        return ((side1 + side2) / 2) * height;
    }
}

class Parallelogram extends Shape {
    private double firstSide;
    private double secondSide;

    public Parallelogram (double firstSide, double secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public String getName() {
        return "Parallelogram";
    }

    @Override
    public double areaCalculation() {
        return firstSide * secondSide;
    }
}

class ShapeNamePrinter {
    public void printShapeName(Shape shape) {
        System.out.println("Shape name: " + shape.getName());
    }
}


class ShapeNamePrinterTest {
    public static void main(String[] args) {
        ShapeNamePrinter sn = new ShapeNamePrinter();
        Circle circle = new Circle(5, "red");
        Square square = new Square(5.5, "blue");
        Triangle triangle = new Triangle(3, 8,4, "orange");
        Trapezium trapezium = new Trapezium(1, 6, 4, "white");
        Parallelogram parallelogram = new Parallelogram(9, 6, "black");
        sn.printShapeName(circle);
        sn.printShapeName(square);
        sn.printShapeName(trapezium);
        sn.printShapeName(triangle);
        sn.printShapeName(parallelogram);
    }
}