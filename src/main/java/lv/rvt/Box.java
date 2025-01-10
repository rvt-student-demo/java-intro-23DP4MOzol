package lv.rvt;

public class Box {

    private final double width;
    private final double height;
    private final double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    public double length() {
        return length;
    }

    public double height() {
        return height;
    }

    public double width() {
        return width;
    }

    public Box biggerBox() {
        return new Box(1.25 * this.width, 1.25 * this.height, 1.25 * this.length);
    }

    public Box smallerBox() {
        return new Box(0.75 * this.width, 0.75 * this.height, 0.75 * this.length);
    }

    public boolean nests(Box outsideBox) {
        return this.width < outsideBox.width && this.height < outsideBox.height && this.length < outsideBox.length;
    }

    private double faceArea() {
        return width * height;
    }

    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return height * length;
    }
}

class BoxTester {

    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);

        System.out.println("Area: " + box.area() + " Volume: " + box.volume());

        System.out.println("Length: " + box.length());
        System.out.println("Height: " + box.height());
        System.out.println("Width: " + box.width());

        Box biggerBox = box.biggerBox();
        System.out.println("Bigger Box - Width: " + biggerBox.width() + " Height: " + biggerBox.height() + " Length: " + biggerBox.length());

        Box smallerBox = box.smallerBox();
        System.out.println("Smaller Box - Width: " + smallerBox.width() + " Height: " + smallerBox.height() + " Length: " + smallerBox.length());

        System.out.println("Does the smaller box nest in the original box? " + smallerBox.nests(box));
        System.out.println("Does the original box nest in the bigger box? " + box.nests(biggerBox));
    }
}
