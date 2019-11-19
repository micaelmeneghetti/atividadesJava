import java.util.Scanner;

class questao6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura:");
        float altura = sc.nextFloat();
        System.out.println("Sexo:");
        int sexo = sc.nextInt();
        if (sexo == 1){
            System.out.println("Peso ideal: " + (72.7 * altura - 58));
        }
    }
}