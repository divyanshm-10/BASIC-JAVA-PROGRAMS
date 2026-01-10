import java.util.Scanner;
public class Webkul11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        int row = n*3;
        int col = n*2;

        for(int i=1 ; i<=row ; i++){
            for(int j=1; j<=col ; j++){
                if((j==1 &&(i<=n || i>=n*2+1))||(i==n&&(j<=n))||(i==(n*2+1)&&(j<=n))||(j==n&&(i>=n&&i<=(n*2+1)))){
                    System.out.print("*");
                }
                else if (i==((row/2)+1)&& j>n){
                    System.out.print("e");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        
    }
}
