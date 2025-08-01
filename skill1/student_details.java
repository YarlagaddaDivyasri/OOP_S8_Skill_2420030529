package skill1;

public class student_details {
    public static void main(String[] args) {
        long rollNumber = 2420030529L;         
        String name = "Divya Sri";              
        float marks = 87.5f;                   
        char gender = 'F';                      
        boolean isPass = true;               
        System.out.println("------------ STUDENT SUMMARY SLIP ------------");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
        System.out.println("Gender      : " + gender);
        System.out.println("Status      : " + (isPass ? "Pass" : "Fail"));
        System.out.println("----------------------------------------------");
    }
}