import java.util.Scanner;

class questao1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int var1 = sc.nextInt();
        int var2 =  sc.nextInt();
        if (var1 > var2){
            System.out.println(var1 + " é maior que " + var2);
        }else
            System.out.println(var2 + " é maior que " + var1);
    }
}