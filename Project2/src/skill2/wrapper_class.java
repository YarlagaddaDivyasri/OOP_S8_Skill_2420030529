package skill2;
public class wrapper_class {
    public static void main(String[] args) {
        int a = 10;
        char ch = 'A';
        double d = 5.67;
        boolean flag = true;
        Integer aObj = Integer.valueOf(a);    
        Character chObj = Character.valueOf(ch); 
        Double dObj = Double.valueOf(d);      
        Boolean flagObj = Boolean.valueOf(flag);  
        Integer x = 20;  
        Double y = 12.34;
        int a2 = aObj.intValue();
        char ch2 = chObj.charValue();
        double d2 = dObj.doubleValue();
        boolean flag2 = flagObj.booleanValue();
        int x2 = x;
        double y2 = y;
        System.out.println("Original int: " + a + ", Wrapper Integer: " + aObj);
        System.out.println("Original char: " + ch + ", Wrapper Character: " + chObj);
        System.out.println("Original double: " + d + ", Wrapper Double: " + dObj);
        System.out.println("Original boolean: " + flag + ", Wrapper Boolean: " + flagObj);
        System.out.println("Autoboxed Integer x: " + x + ", Auto-unboxed x2: " + x2);
        System.out.println("Autoboxed Double y: " + y + ", Auto-unboxed y2: " + y2);
    }
}

