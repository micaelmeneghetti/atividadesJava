import java.util.Scanner;

class questao4{
    public static void main(String[] args){
        double valor = 0;
        double valor2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de maçãs");
        int num = sc.nextInt();
        if (num >= 12){
            System.out.println("valor: " + num * 0.25);
        }else
            System.out.println("valor: " + num * 0.30);
    }
}