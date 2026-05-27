import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Generator gen=new Generator();
        System.out.println("=== Interview Question Generator ===");
        System.out.println("1. Common Repeated Java Questions");
        System.out.println("2. Common Repeated OOPS Questions");
        System.out.println("3. Easy Level (Mixed)");
        System.out.println("4. Medium Level (Mixed)");
        System.out.println("5. Hard Level (Mixed)");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        gen.generate(choice);
        sc.close();
    }
}
