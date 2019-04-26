/**
 *
 * @author Steve
 */
public class ArrayPrinter {

    
    public static void main(String[] args) {
        int numbers[] = new int[10];
        int min = 2;
        int max = 20;
        
        for (int i = 0; i < numbers.length; i = i + 1){
        numbers[i] = (int) ((max - min) * Math.random() + 1) + min;
        }
        System.out.print("The Entire Array: ");
        for(int i = 0; i < numbers.length; i = i + 1){
        System.out.println(numbers[i] + " ");
        }
        System.out.print("The Elements at even indices: ");
        for(int i = 0; i < numbers.length; i = i + 2){
        System.out.println(numbers[i] + " ");
        }
        System.out.print("Even Elements: ");
        for(int i = 0; i < numbers.length; i++){
        if(numbers[i] % 2 == 0)
            System.out.println(numbers[i] + " ");
        }
        System.out.print("The array reversed is: ");
        for (int i = numbers.length - 1; i >= 0; i--){
        System.out.println(numbers[i] + " ");
        }
        System.out.println("The First Element is: " + numbers[0]);
        System.out.print("The Last Element of the Array is: " + numbers[numbers.length - 1]);
        }
    }
    

