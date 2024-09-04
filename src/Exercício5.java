import java.util.Scanner;
public class Exercício5 {
    public static void main(String[] args){
        String n1 = "Escreva um programa que inverta os caracteres de um string.";
        String inversa = "";

        for(int i = n1.length()-1; i>=0; i--){

            inversa = inversa + n1.charAt(i);
        }
        System.out.println("Escreva um programa que inverta os caracteres de um string.");
        System.out.println(inversa);
    }
}
