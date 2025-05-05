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

        // Array methods to play with type of Arrays data.
        // int[] array = {1,2,5,6,7,3,4}; || char[] c_array = {e,l,i,y,a,z}; 
        // 1. asList(array), 2. equals(array), 3. hashCode(array), 4. Sort(array), 5. toString(array), 6. toString(c_array), 7. toCharArray()
        // some other methods, * fill(), * copiedArray(), * copyOfRange(), etc,.

        System.out.println( "String conert as char Array:  " + Arrays.toString(ch)); //to print the char arryay 
        List<String> Strch = Arrays.asList(str);  // line 17: converting String to list array
        System.out.println("String array conert as List:  " + Strch); //to print the String list arryay 
        
        char[] arr1 = {'e', 'l', 'i', 'y', 'a', 'z'};
        char[] arr2 = {'e', 'l', 'i', 'y', 'a', 'z'};
        char[] arr3 = {'e', 'l', 'i', 'y', 'a', 's'};
        System.out.println("Equal method returns:   " + Arrays.equals(arr1,arr2)); // if equals the return true
        System.out.println("Equal method returns:   " + Arrays.equals(arr1,arr3));//if not equals the return false
        String string = new String(arr1); // Converting char array as String.
        System.out.println("char array conert as string:  " + string); //to print the String  


    }
}
