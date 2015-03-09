
package multiplos;
import java.util.*;

public class Multiplos {

    public static void main(String[] args) {
 
        Scanner lec=new Scanner(System.in);
        int n,s3=0,s5=0,c=1;
        
        System.out.println("introduce un numero");
        n=lec.nextInt();
        
        while(c<=n){
        if(c%3==0){
        System.out.println("multiplos de 3 "+c);
        s3=s3+c;
        
        
        } 
         if(c%5==0){
        System.out.println("multiplos de 5 "+c);
        s5=s5+c;
        
        }
        
         c++;
        }
        System.out.println("la suma de multiplos de 3 es "+s3);
         System.out.println("la suma de multiplos de 5 es "+s5);
        /*c=1; 
        while(c<=n){
        if(c%5==0){
        System.out.println("multiplos de "+c);
        s5=s5+c;
        c++;
        }
        } */
 
        
    }
    
}
