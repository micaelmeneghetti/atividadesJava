import java.util.Scanner;

class questao17{
    public static void main(String[] args){
        double result = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o valor da base");
        int base = sc.nextInt();
        System.out.println("Digite o expoente");
        int expoente = sc.nextInt();
        for (int i= 1; i <= expoente; i++){
            result = base;
            result = result * base;
        }
        System.out.println(result);
    
    }
}