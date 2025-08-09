package skill2;
public class operators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a > b: " + (a > b));
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        int c = a;
        c += b;
        System.out.println("c after c += b: " + c);
        int d = 3;
        System.out.println("d++ = " + (d++));
        System.out.println("Now d = " + d);
    }
}
