import java.util.Scanner;

public class Test1021{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        double z=sc.nextDouble();
        
        double a=z/100;
        double b=z%100;
        double c=b/50;
        double d=b%50;
        double e=d/20;
        double f=d%20;
        double g=f/10;
        double h=f%10;
        double i=h/5;
        double j=h%5;
        double k=j/2;
        double l=j%2;
        
        double m=l/1.00;
        double n=l%1.00;
        double o=n/0.50;
        double p=n%0.50;
        double q=p/0.25;
        double r=p%0.25;
        double s=r/0.10;
        double t=r%0.10;
        double u=t/0.05;
        double v=t%0.05;
        double w=v/0.01;
        
        System.out.println("NOTAS:");
        System.out.println((int)a+" nota(s) de R$ 100.00");
        System.out.println((int)c+" nota(s) de R$ 50.00");
        System.out.println((int)e+" nota(s) de R$ 20.00");
        System.out.println((int)g+" nota(s) de R$ 10.00");
        System.out.println((int)i+" nota(s) de R$ 5.00");
        System.out.println((int)k+" nota(s) de R$ 2.00");
        
        System.out.println("MOEDAS:");
        System.out.println((int)m+" moeda(s) de R$ 1.00");
        System.out.println((int)o+" moeda(s) de R$ 0.50");
        System.out.println((int)q+" moeda(s) de R$ 0.25");
        System.out.println((int)s+" moeda(s) de R$ 0.10");
        System.out.println((int)u+" moeda(s) de R$ 0.05");
        System.out.println((int)w+" moeda(s) de R$ 0.01");
        
    }
}
