import java.util.Scanner;

class questao9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digete 3 valores para saber o maior");
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();
        if (valor1 < valor2 && valor2 < valor3){
            System.out.println(""+ valor3); 
        }
        if (valor2 < valor1 && valor1 < valor3){
            System.out.println(""+ valor3 );
        }
        if (valor1 < valor3 && valor3 < valor2){
            System.out.println("" + valor2);
        }
        if (valor2 < valor3 && valor3 < valor1){
            System.out.println("" + valor1);
        }
        if (valor3 < valor1 && valor1 < valor2){
            System.out.println("" + valor2);
        }
        if (valor3 < valor2 && valor2 < valor1){
            System.out.println(""+ valor1);
        }
    }
}