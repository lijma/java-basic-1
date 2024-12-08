// 下面这段代码是Marvin写的 
public class Ladder {
    

    /**
     * 
     * * 
     * * *
     * * * *
    */

    // public static void main(String[] args) {
    //       int x = 1;
    //       while (x <= 10){
    //         int y = 1;
    //         while (y <= x){
    //             System.out.printf("*");
    //             y++;
    //         }
    //         System.out.printf("\n");
    //         x++;
    //       }
    // }


    public static void main(String[] args) {
          for (int x= 1; x <= 10; x++){
            for (int y = 1;y <= x; y++){
                System.out.printf("*");  
            }
            System.out.printf("\n"); 
          }
    }
} 