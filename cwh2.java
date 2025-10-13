package practice1;
import java.util.Scanner;
public class cwh2 {
    public static void main(String[] args){
        System.out.println("put in your marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("English subject number");
        int a = sc.nextInt();
        System.out.println("Math subject number");
        int b = sc.nextInt();
        System.out.println("Hindi subject number");
        int c = sc.nextInt();
        System.out.println("Science subject number");
        int d = sc.nextInt();
        System.out.print("total mark of all subject is ");
        int sum = a +b +c +d /100;
        System.out.println(sum);

    }
}
