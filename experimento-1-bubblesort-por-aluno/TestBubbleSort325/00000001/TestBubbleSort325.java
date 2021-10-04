import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestBubbleSort325 {
    @Test(timeout = 4000)
    public void test() throws Throwable {
        public class BubbleSort325 {

   private int arr[];

   public BubbleSort325(int array[]) {
       arr = array;
       arr = Ordena();  
   }

   public int[] Ordena() {
       int aux;
       for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                     aux = arr[j+1];
                    arr[j+1] =  arr[j];
                    arr[j] = aux;
                   
                }
    }
     return arr;
   }
}
    }
}