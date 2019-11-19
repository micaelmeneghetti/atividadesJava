import java.util.Scanner;

class questao2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = sc.nextInt();
        if (idade >= 15){ //no proximo ano terá 16
            System.out.println("Pode votar em 2020");
        }else
            System.out.println("Não pode votar em 2020");
    }
}