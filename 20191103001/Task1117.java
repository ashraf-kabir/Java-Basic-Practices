import java.util.Scanner;

public class Task1117{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double p=0.0;
        double q=0.0;
        
        for (int i=1; ; i++){
            
            double x=sc.nextDouble();
            
            if (x<0.0 && x>10.0){
                //System.out.println("nota invalida");
            } else if (x>=0 && x<=10){
                p=x;
                break;
            }
            System.out.println("nota invalida");
        }
        
        for (int j=1; ; j++){
            
            double y=sc.nextDouble();
            
            if (y<0.0 && y>10.0){
                //
                System.out.println("nota invalida");
            } else if (y>=0 && y<=10){
                q=y;
                break;
            }
            System.out.println("nota invalida");
        }
        
        double media=(p+q)/2.0;
        
        System.out.println("media = "+media);
    }
}
