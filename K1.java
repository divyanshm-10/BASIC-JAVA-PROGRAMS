 public class K1{
    public static void main(String [] args){
        for(int i=1;i<=6;i++){
            for(int j=1;j<=4;j++){
                if(j==1
                ||(j==2&&i==3)
                ||(j==3&&(i==2||i==4||i==5))
                ||(j==4&&(i==1||i==6))) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}