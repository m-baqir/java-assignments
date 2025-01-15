package Assignment1;

public class MyRectangle2D {
    double x, y, width, height;

    MyRectangle2D() {
        this.x = 0.0;
        this.y = 0.0;
        this.width = 1.0;
        this.height = 1.0;
    }

    MyRectangle2D(double x, double y, double width, double height) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public void setX() {
        this.x = x;
    }

    public void setY() {
        this.y = y;
    }

    public void setWidth() {
        this.width = width;
    }

    public void setHeight() {
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(double width, double height) {
        return width * height;
    }

    public double getPerimeter(double width, double height) {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        if (x >= 0 && x <= width && y <= height && y >= 0)
            return true;
        else
            return false;
    }

    public boolean contains(MyRectangle2D r) {
        if (r.x >= this.x && r.y >= this.y && r.x + r.width <= this.x + this.width
                && r.y + r.height <= this.y + this.height)
            return true;
        else
            return false;
    }

    public boolean overlaps(MyRectangle2D r) {
        return ((r.getX() + (r.getWidth() / 2)) > ((this.x - (this.width) / 2)) &&
                (r.getX() - (r.getWidth() / 2)) < ((this.x + (this.width) / 2))) ||
                ((r.getY() + (r.getHeight() / 2)) > ((this.y - (this.height) / 2)) &&
                        (r.getY() - (r.getHeight() / 2)) < ((this.y + (this.height) / 2)));
    }
}
