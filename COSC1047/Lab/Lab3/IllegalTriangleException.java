package Lab3;

public class IllegalTriangleException extends Exception {
    IllegalTriangleException() {
        System.out.println("IllegalTriangleException: The triangle cannot be created.");
    }

    IllegalTriangleException(String str) {
        System.out.println(str);
    }
}
