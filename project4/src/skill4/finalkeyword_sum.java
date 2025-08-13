package skill4;

class FinalKeywordDemo {
 private final int id;
 public FinalKeywordDemo(int id) {
     this.id = id;
 }
 public final void displayId() {
     System.out.println("ID: " + id);
 }
}

public class finalkeyword_sum {
 public static void main(String[] args) {
   
     FinalKeywordDemo obj = new FinalKeywordDemo(101);
     obj.displayId();
     final StringBuilder sb = new StringBuilder("Hello");
     sb.append(" World");
     System.out.println("Modified StringBuilder content: " + sb);
 }
}