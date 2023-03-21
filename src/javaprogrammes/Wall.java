package javaprogrammes;

public class Wall {

    // instance variables
    double width;
    double height;

    // No args constructor
    public Wall() {
    }

    // two args constructor
    public Wall(double w, double h) {

        if (w < 0) {
            this.width = 0;
        } else {
            this.width = w;
        }

        if (h < 0) {
            this.height = 0;
        } else {
            this.height = h;
        }
    }

    // with return type no parameter method
    public double getWidth() {
        return width;
    }

    // with return type no parameter method
    public double getHeight() {
        return height;
    }

    // no return type with parameter method
    public void setWidth(double w) {
        if (w < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // no return type with parameter method
    public void setHeight(double h) {
        if (h < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // with return type no parameter
    public double getArea() {
        double area = width * height;
        return area;
    }

    // driver method
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
}
