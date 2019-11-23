import java.util.Scanner;

class questao8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de lados do poligno");
        int lados = sc.nextInt();
        if (lados > 5){ 
            System.out.println("POLÍGONO NÃO IDENTIFICADO.");
            return;
        }
        if (lados < 3){ 
            System.out.println("NÃO É UM POLÍGONO.");
            return;
        }
        System.out.println("Qual a medida do lado em cm?");
        double medida = sc.nextDouble();
        if (lados == 3){ System.out.println("TRIÂNGULO DE ÁREA " + medida * medida/2);}
        if (lados == 4){ System.out.println("QUADRADO DE ÁREA " + medida * medida);}
        if (lados == 5){ System.out.println("PENTÁGONO");}
        
        
    }
}