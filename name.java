import java.util.Scanner;

public class name {
    
        String name;
        int age;
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("How old are you?");
        age = sc.nextInt();
    System.out.println("Hello, " + name);
        System.out.println("you are " + age);
        }
        
        
        
    }
    

