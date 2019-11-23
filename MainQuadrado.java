import java.util.Scanner;

class MainQuadrado{
    public static void main(String[] args){
        Quadrado q = new Quadrado();
        Scanner sc = new Scanner(System.in);
        double lado = sc.nextDouble();
        q.lado = lado;
        System.out.println(q.calculaAreaQuadrado());
    }
}