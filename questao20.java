import java.util.Scanner;

class questao20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor entre 1 e 10 para saber sua tabuada");
        int num = sc.nextInt();
        
        for (int i= 0; i <= 10; i++){
            int tabuada = i * num;
            System.out.println(i + " x " + num + " = " + tabuada);
        }
        
    }
}