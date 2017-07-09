/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author Rajasheker
 */
public class Insertionsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };

        printNumbers(input);

        insertionSort(input);
 
       printNumbers(input);
 
        // TODO code application logic here
    }
    private static void printNumbers(int[] input) {

        for (int i = 0; i < input.length; i++) {

            System.out.print(input[i] + ", ");
        }

        System.out.println("\n");
    }

 
    public static void insertionSort(int arr[]) {

        int min;
   
     for(int i = 0;i<arr.length;i++)
        {

            min = i;
     
       for(int j = i + 1;j<arr.length;j++) {

                if(arr[j] < arr[min]) { 
                min = j;
              
}
}
         int temp = arr[i];
   
         arr[i] = arr[min];
    
        arr[min] = temp;
      
 }
         
    
}


    
}
