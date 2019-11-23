import java.util.Scanner;

class questao10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as medidas dos lados em cm?");
        double medida1 = sc.nextDouble();
        double medida2 = sc.nextDouble();
        double medida3 = sc.nextDouble();
        if (medida1 == medida2 && medida1 == medida3){
            System.out.println("Triângulo Equilátero: possui os 3 lados iguais.");
            return;
        }
        if (medida1 == medida2 || medida1 == medida3 || medida2 == medida3){
            System.out.println("Triângulo Isóscele: possui 2 lados iguais.");
        }else  
            System.out.println("Triângulo Escaleno: possui 3 lados diferentes.");
    }
}