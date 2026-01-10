public class Webkul1 {
    public static void main(String[] args) {
        for(int i = 1; i<=9;i++){
            for(int j = 1; j<=6;j++){
                if(((j==1&&(i<=3||i>=7))||(i==3&&(j<=3)||i==7&&(j<=3))||((j==3&&(i>=3&&i<=7)))||(i==5&&(j>=3)))){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
                }
               
    }
}
