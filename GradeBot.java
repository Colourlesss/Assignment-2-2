import java.util.Scanner;

public class GradeBot
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What was your test out of?");
        double limit = sc.nextDouble();
        System.out.print("What did you get?");
        double score = sc.nextDouble();
        int percent = (int)(score/limit * 100);
        if(score > 100 || score < 0 || limit <=0){
            System.out.println("Invalid input detected");
        }else if(percent<=49 && percent>=0){
            System.out.println("You got an F...");
        }else if(percent<=59){
            System.out.println("You got an C-");
        }else if(percent<=66){
            System.out.println("You got a C");
        }else if(percent<=72){
            System.out.println("You got a C+");
        }else if(percent<=85){
            System.out.println("You got a B");
        }else if(percent<=100){
            System.out.println("You got an A");
        }
    }
}
