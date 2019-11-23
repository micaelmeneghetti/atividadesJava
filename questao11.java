import java.util.Scanner;

class questao11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os ângulos");
        int angulo1 = sc.nextInt();
        int angulo2 = sc.nextInt();
        int angulo3 = sc.nextInt();
        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90){
            System.out.println("Triângulo Retângulo: possui um ângulo reto.");
            return;
        }
        if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90){
            System.out.println("Triângulo Obtusângulo: possui um ângulo obtuso.");
            return;
        }
        if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90){
            System.out.println("Triângulo Acutângulo: possui três ângulos agudos.");
            return;
        }
    }
}