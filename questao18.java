import java.text.DecimalFormat;

class questao18{
    public static void main(String[] args){
        DecimalFormat df =  new DecimalFormat("0.00");
        double c = 0;
        for (int i= 50; i <= 150; i++){
            c = 0.5555 * (i - 32);
            System.out.println(i + " Fahrenheit = " + df.format(c)  + " centígrados");
        }
    
    }
}