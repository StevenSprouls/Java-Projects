package commonarrayalgorithmsapp;



import java.util.Collections;


public class CommonArrayAlgorithms {
    public String arrayToString(int testArray[]) {
        String arrayToString = "";
        if (testArray.length > 1)
        {
            for(int i = 0; i < testArray.length; i++)
            {
                arrayToString += Integer.toString(testArray[i])+ "|";
            }
        }
        
        else{
        return Integer.toString(testArray[0]);
        }
    return arrayToString;
    }
    public int arraySum(int testArray[]) {
        int sum = 0;
        for (int i = 0; i < testArray.length; i++)
        {
        sum = sum + testArray[i];
        }
    return sum;
    }
    
        public int arrayAvg(int testArray[]) {
        
            int avg = 0;
            for (int i = 0; i < testArray.length; i++)
                
            {
                avg = avg + testArray[i];
            }   
        return avg / testArray.length;
        }
        
        
        public int arrayMax(int testArray[]) {
            int max = 0;
            for (int i = 0; i < testArray.length; i++)
                if (testArray[i] > max)
                {
                max = testArray[i];
                }
                else
                {
                max = max;
                }
            return max;
        }
        public int arraySearch(int testArray[], int number) {
            int place = 0;
          for (int i = 0; i < testArray.length; i++)
          {
              if ( number == testArray[i])
              {
                place = i;
                break;
              }    
              else
              {
                place = -1;
              }
          }
         return place;   
        }
        public boolean arraySwap(int testArray[], int num1, int num2)
        {
            boolean answer = true;
            
            if(num1 < testArray.length && num2 < testArray.length)
            {
                int hold1 = testArray[num1];
                int hold2 = testArray[num2];
                testArray[num1] = hold2;
                testArray[num2] = hold1;
                
                answer = true;
            }
            else if (num1 > testArray.length || num2 > testArray.length)
            {
                answer = false;
            }
        
            return answer;
        }
        public int[] arrayGrowDouble(int testArray[])
        {
                int newArray[] = new int[testArray.length*2]; 
                
                for(int i = 0; i < testArray.length; i = i +1)
                {
                    newArray[i] = testArray[i];

                }
            return newArray;    
        }

}     
