
import java.util.Scanner;
public class Secret
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What's the password?");
        String input = sc.nextLine();
        if(input.equals("dragon")){
            System.out.println("Correct! My secret is: 1_am_a_c001_9uy");
        }else{
            System.out.println("Incorrect! Not gonna tell u my secret...");
        }
    }
}
