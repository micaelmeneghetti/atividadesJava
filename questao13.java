import java.util.Scanner;

class questao13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int soma = 0;
        for (int i= 1; i <= num; i++){
            soma = soma + i;
        }
        System.out.println(soma);
    }
}