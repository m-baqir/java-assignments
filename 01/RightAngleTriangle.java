/**
 * @author Mohammad Baqir
 * @version 1.0
 */
public class RightAngleTriangle {
    private double base = 0, height = 0;

    // default constructor
    RightAngleTriangle() {
        this.base = 1.1;
        this.height = 1.1;
    }

    // constructor with parameters
    RightAngleTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // base setter
    public void setBase(double base) {
        this.base = base;
    }

    // height setter
    public void setHeight(double height) {
        this.height = height;
    }

    // base getter
    public double getBase() {
        return this.base;
    }

    // height getter
    public double getHeight() {
        return this.height;
    }

    // height and base setter
    public void setBaseAndHeight(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // to string method
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }

    // equals method
    public boolean equals(RightAngleTriangle x) {
        if (base == x.base || height == x.height) {
            System.out.println("These two triangles are equivalent");
            return true;
        }
        System.out.println("These two triangles are not equivalent");
        return false;
    }
}
