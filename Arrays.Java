import java.util.Arrays;

class Main {
    public static void main(String[] args) {
    
        // Integer Array 
        int[] arr = {1,2,5,7,8,9,4,6,3};
        int arrlength = arr.length;  // arrlength is for get the length of the Array
        System.out.println("Before the Sorting:" + Arrays.toString(arr));
        System.out.println(" Index of given Array  :" + arr[3]);
        Arrays.sort(arr); // Sorting array into a order 
        System.out.println("After the Sorting:" + Arrays.toString(arr));
        int thirdlargest = arr[arrlength-3]; 
        System.out.println("3rd Largest Number in the array:" + thirdlargest);
        String str = "Welcome to the Eliyaz World"; // String Variable 
        
        char[] ch = str.toCharArray(); //Converting the string to char Array
        
        System.out.println(Arrays.toString(ch)); //to print the char arryay 

    }
}
