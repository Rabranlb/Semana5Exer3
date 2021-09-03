public class semana5exer3{
    public static void main(String args[]){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                if(1%2==0){
                    System.out.print(i*j + " ");
                }
                else if(i%2!=0){
                  System.out.print(i*j + "  ");
                }


            }   System.out.print("\n");
        }
    }
}