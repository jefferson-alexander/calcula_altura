
package vetor_calculo_altura;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
                     
        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i=0; i<n; i++){
            vect[i] = sc.nextDouble();
        }
        
        double soma = 0.0;
        for(int i=0; i<n; i++){
            soma += vect[i];
        }
        double avg = soma / n;
                
        System.out.printf("Altura média é: %.2f%n", avg);
        
        sc.close();        
    }

}
