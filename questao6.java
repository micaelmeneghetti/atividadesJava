import java.util.Scanner;
import java.lang.Math;

class questao6{
    public static void main(String[] args){
        int sexo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();
        System.out.println("Sexo:");
        sexo = sc.nextInt();
        double altura1 = 72.7 * altura - 58;
        double altura2 = 62.1 * altura - 44.7;
        int aInt = (int)altura1;
        int bInt = (int)altura2;
        if (sexo == 1){ System.out.println("Peso ideal: " + aInt);}
        if (sexo == 2){ System.out.println("Peso ideal: " + bInt);}
        while (sexo != 1 && sexo != 2){
            System.out.println("Sexo invalido!");
            System.out.println("Digite seu sexo novamente 1 MASCULINO/2 FEMININO:");
            sexo = sc.nextInt();
            altura1 = 72.7 * altura - 58;
            altura2 = 62.1 * altura - 44.7;
            aInt = (int)altura1;
            bInt = (int)altura2;
            if (sexo == 1){ System.out.println("Peso ideal: " + aInt);}
            if (sexo == 2){ System.out.println("Peso ideal: " + bInt);}
        }

    }
}