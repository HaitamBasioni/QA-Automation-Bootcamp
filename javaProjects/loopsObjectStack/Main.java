// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int [] arr={2,10,30,79,20};
        int divided=10;
         PrintDividedFor(arr,divided);
         PrintDividedForeach(arr,divided);
        PrintDividedWhile(arr,divided);

        }
    public static  void PrintDividedFor(int []arr, int divided) {
        System.out.println("for loop");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divided == 0)
                System.out.println(arr[i]);
        }
        System.out.println(" ******************");
    }
        public static  void PrintDividedForeach(int []arr, int divided){
            System.out.println("foreach loop");
            for (int num:arr) {
                if(num%divided==0)
                    System.out.println(num);
            }
            System.out.println(" ******************");
    }
    public static  void PrintDividedWhile(int []arr, int divided) {
        System.out.println("while loop");
        int index=0;
        while (index< arr.length){
            if (arr[index]%divided==0)
                System.out.println(arr[index]);
            index++;
        }
        System.out.println(" ******************");

        }




}
