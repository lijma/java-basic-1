// 下面这段代码是Marvin写的 
public class MyTable {
    
    public static void main(String[] args) {
          
       int[][] myTable = {
            {1, 2, 3, 4}, 
            {5, 6, 7, 8},
            {9, 7, 6, 5},
       };

       for (int x = 0; x < 3; x++){
          for (int y = 0; y < 4; y++ ){
             System.out.print(myTable[x][y]);
          }  
          System.out.print("\n");
       }
    }
} 