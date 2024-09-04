public class Exercício4 {
    public static void main(String[] args){

        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53;

        double SOMA = SP+RJ+MG+ES+Outros;
        System.out.println(SOMA);
       System.out.println("SP = " +(SP/SOMA) * 100);
        System.out.println("RJ = " +(RJ/SOMA) * 100);
        System.out.println("MG = " +(MG/SOMA) * 100);
        System.out.println("ES = " +(ES/SOMA) * 100);
        System.out.println("Outros = " +(Outros/SOMA) * 100);
    }
}
