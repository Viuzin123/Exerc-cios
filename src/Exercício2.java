import java.util.Scanner;
public class Exercício2 {
   public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int num = scan.nextInt();

        int a = 0;
        int b = 0;
        boolean pertence = false;

        if (num == 0){
            pertence = true;
        }

        while(a <= num){
            if (a == num) {
                pertence = true;
                break;
            }
            int next = a + b;
            a = b;
            b = next;
        }

        if(pertence){
            System.out.println("O número pertence");
        }else{
            System.out.println("O número não pertence");

        }
    }
}

