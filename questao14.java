import java.util.Scanner;

class questao14{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
		int valor[] = new int[20];
        int maior = 0;
        int menor = 0; 
		
		for(int i = 0; i < valor.length; i++){
			valor[i] = sc.nextInt();
			if(valor[i] > maior){ 
				maior = valor[i];
			}
		}
		for (int j = 0; j < valor.length; j++) {
			if(valor[j] < menor){
				menor = valor[j];
			}
		}
		System.out.println("Maior  "+ maior);
        System.out.println("Menor  "+ menor);
    }
}