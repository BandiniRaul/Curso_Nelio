package Exercicios_While;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite os pontos no plano cartesiano");
        int x = sc. nextInt();
        int y = sc.nextInt();

        while(x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("Primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            }
            else if (x < 0 && y < 0){
                System.out.println("Terceiro quadrante");
            }
            else {
                System.out.println("Quarto quadrante");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}
