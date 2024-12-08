// 下面这段代码是Marvin写的 
public class MaxItem {
    
    public static void main(String[] args) {
        
        //int[] items = {2,3,20,6,1,9,4,15,30};
        float[] items = {2.0f,3.0f,20.0f,6.0f,1.0f,9.0f,4.0f,45.0f,30.0f};

        int index = max(items);

        System.out.printf("max value is %s%n",items[index]);

    }

    static int max(float[] items) {
        int max = 0;    
        for (int i =0; i<items.length; i++){
            float y = items[i];
            if (items[i] > items[max]){
                max = i;
            }
        }  
        return max;
    }

    static int max(int[] items) {
        int max = 0;    
        for (int i =0; i<items.length; i++){
            int y = items[i];
            if (items[i] > items[max]){
                max = i;
            }
        }  
        return max;
    }
} 