// 下面这段代码是Marvin写的 
public class MyHelloWorld {
    
    public static void main(String[] args) {

        int age = 100;
        String name = "Marvin";
        float salary = 10.01f;
        char letter = 'a';
        boolean happy = true;

        int week = 6;
        int month = 10;

        // System.out.printf("Hello, %s%n", age);
        // System.out.printf("Hello, %s%n", name);
        // System.out.printf("Hello, %s%n", salary);
        // System.out.printf("Hello, %s%n", letter);
        // System.out.printf("Hello, %s%n", happy);
        
        System.out.printf("Hello, %s%n", week);
        System.out.printf("Hello, %s%n", ++week);
        System.out.printf("Hello, %s%n", --month);

    }
} 