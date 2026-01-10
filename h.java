// // // // star pattern
// // // // //  public class h {
// // // // //     public static void main(String[] args) {
// // // // //         for(int i=1;i<=5;i++){
// // // // //             for(int j=1;j<=i;j++){
// // // // //                 System.out.print("*");
// // // // //             }
// // // // //             System.out.println();
// // // // //         }
// // // // //     }
// // // // // }
// // // // reverse star pattern
// // // // // class h {
// // // // //     public static void main(String[] args) {
// // // // //         for (int i = 1; i <= 5; i++) {
// // // // //             for (int j = 5; j >= i; j--) {
// // // // //                 System.out.print("*");
// // // // //             }
// // // // //             System.out.println();
// // // // //         }
// // // // //     }

// // // // starpatternforntandreverse
// // // // public class h {
// // // //     public static void main(String[] args) {
// // // //         for (int i = 1; i <= 5; i++) {
// // // //             for (int j = 1; j <= i; j++) {
// // // //                 System.out.print("*");
// // // //             }
// // // //             System.out.println();
// // // //         }

// // // //         for (int i = 1; i <= 5; i++) {
// // // //             for (int j = 4; j >= i; j--) {
// // // //                 System.out.print("*");
// // // //             }
// // // //             System.out.println();
// // // //         }
// // // //     }
// // // // }{
// // // //         for(int i=1;i<=5;i++){
// // // //             for(int j=5;j>=i;j--){
// // // //                 System.out.print(" ");
// // // //             }
// // // //             for(int k=1;k<=i;k++){
// // // //                 System.out.print("*");
// // // //             }
// // // //             System.out.println();
// // // //         }
// // // //     }
// // // // }
// // // public class h {
// // //     public static void main(String[] args) {
// // //         for(int i=1;i<=5;i++){
// // //             for(int j=1;j<=i;j++){
// // //                 System.out.print(" ");
// // //             }
// // //             for(int k=5;k>=i;k--){
// // //                 System.out.print("*");
// // //             }
// // //             System.out.println();
// // //         }
// // //     }
// // // }
// // public class h {
// //     public static void main(String[] args) {
// //         for(int i=1;i<=5;i++){
// //             for(int j=4;j>=i;j--){
// //                 System.out.print(" ");
// //             }
// //             for(int k=1;k<=i;k++){
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //         for(int i =1;i<=5;i++){
// //             for(int j=1;j<=i;j++){
// //                 System.out.print(" ");
// //             }
// //             for(int k=4;k>=i;k--){
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }
// // first trick
// // public class h{
// //     public static void main(String [] args){
// //         for(int i=1;i<=4;i++){
// //             for(int j=4;j>=i;j--){
// //                 System.out.print(" ");
// //             }
// //             for(int k=1; k<=i;k++){
// //                 System.out.print(" *");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }
// // second trick
// // public class h{
// //     public static void main(String [] args){
// //         for(int i=1;i<=4;i++){
// //             for(int j=4;j>=i;j--){
// //             if(j>i){
// //                 System.out.print(" ");
// //             }else{
// //                 System.out.print(" *");
// //             }
// //         }error in this code
// //             System.out.println();
// //         }
// //     }
// // }
// // First tricks
// // public class h{
// //     public static void main(String [] args){
// //         for(int i=1;i<=4;i++){
// //             for(int j=4;j>=i;j--){
// //                 System.out.print(" ");
// //         }
// //         for(int k=1;k<=i;k++){
// //             System.out.print("*");
// //         }
// //         for(int l=2;l<=i;l++){
// //             System.out.print("*");
// //         }
// //         System.out.println();
// //     }
// // }
// // }
// // full pyramid
// // Second trick
// // public class h {
// //     public static void main(String [] args){
// //         for(int i=1;i<=4;i++){
// //             for(int j=4;j>=i;j--){
// //                 System.out.print(" ");
// //         }
// //         for(int k=1;k<(i*2);k++)
// //         {
// //             System.out.print("*");

// //         }
// //         System.out.println();
// //     }
// //   }
// // }
// // Double star  prints every lines printthis cpde for even lines
// // public class h {
// //     public static void main(String [] args){
// //         for(int i=1;i<=4;i++){
// //             for(int j=4;j>=i;j--){
// //                 System.out.print(" ");
// //         }
// //         for(int k=1;k<=(i*2);k++)
// //         {
// //             System.out.print("*");

// //         }
// //         System.out.println();
// //     }
// //   }
// // }
// // public class h {
// //     public static void main(String [] args){
// //         for(int i=1;i<=4;i++){
// //             for(int j=4;j>=i;j--){
// //                 System.out.print(" ");
// //         }
// //         for(int k=1;k<=(i*2);k++)
// //         {
// //             if(k==1 || k==(i*2) || i==4){
// //                 System.out.print("*");
// //             }else{
// //                 System.out.print(" ");
// //             }

// //         }
// //         System.out.println();
// //     }
// //   }
// // }
// // public class h {
// //     public static void main(String [] args){
// //         for(int i= 1; i<=4;i++){
// //             for(int j=1; j<=i;j++){
// //                 System.out.print(" ");
// //             }
// //             for(int k=4; k>=i;k--){
// //                 System.out.print("*");
// //             }
// //             for(int l=3; l>=i; l--){
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //     }
// // } 
// // reverse full pyramid odd numbers- first trick

// public class h {
//     public static void main(String [] args){
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=9;k>(i*2);k--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// reverse full pyramid odd numbers- second trick