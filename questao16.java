class questao16{
    public static void main(String[] args){
        for (int t = 0; t < 1000; t++){
            double anacleto = 0.2*t + 1.50;
            double felisberto = 0.3*t + 1.10;
            //System.out.println("anacleto" + anacleto);
            //System.out.println("felisberto" + felisberto);
            if (anacleto == felisberto){
                System.out.println(t + " ANOS");
                break;
            }
        }
    
    }
}