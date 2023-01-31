
import java.util.Scanner;

 
public class doviz {
      public static void main(String args[]){
         Scanner scanner = new Scanner(System.in);
         double Euro = 0;
         double toplam = 0;        
         System.out.println("(euro 0.8961= 1 ABD Doları)Euro :");
         Euro =scanner.nextDouble();
         toplam =(Euro/0.8961);
        
          System.out.println(Euro+". Euro  = Dolar : "+toplam);
    
   }
}
