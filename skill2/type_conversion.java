package skill2;
public class type_conversion {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // Implicit conversion (int to double)
        System.out.println("int to double: " + b);

        double x = 9.7;
        int y = (int) x; // Explicit conversion (double to int)
        System.out.println("double to int: " + y);
    }
}


