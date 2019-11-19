import java.util.Scanner;

class questao3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua senha:");
        String senha =  sc.nextLine();
        if (senha.contains("1234")){
            System.out.println("ACESSO PERMITIDO");
        }else  
            System.out.println("ACESSO NEGADO");
    }
}