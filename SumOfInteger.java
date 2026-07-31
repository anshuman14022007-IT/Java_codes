import java.util.Scanner;
public class SumOfInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number between 0 to 1000");

        int num = sc.nextInt();

        if (num < 0|| num>1000){
          System.out.println("Out of range, try again!!");
        }
        else{
            int sum = 0;
            while (num>0){
                sum = sum + (num%10);
                num = num/10;

            }
            
        System.out.println("The sum of digits is: " + sum);
        }
    sc.close();
    }
}