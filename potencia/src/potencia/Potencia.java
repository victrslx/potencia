package potencia;

import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double n1, a;
        int i;
        System.out.print("Digite um número para a potencia: ");
        n1 = entrada.nextInt();
        i = 1;
        while(i<=15){
        a = Math.pow(n1,i);
        System.out.println(a);
        i = i+1;
        }
    }
    
}
