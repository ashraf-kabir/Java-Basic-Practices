import java.util.Scanner;

public class CP5T1 {
    public static void main(String [] args){
        
        Scanner sc= new Scanner (System.in);
        
        int num[] = new int[3];
        int sum=0;
        
        for (int a=0; a<num.length; a++){
            System.out.println("Enter number:");
            num[a] = sc.nextInt();
        }
        
        for (int a=0; a<num.length; a++){
            sum+=num[a];
            System.out.println("You have entered " + num[a]);
            System.out.println("Total is "+sum);
        }
        
    }
}
