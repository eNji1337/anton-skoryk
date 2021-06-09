package Task7;

public class Task1 {
     public static void exchange(int[] intArray){
            int i = intArray[0];
            int j = intArray[1];
            intArray[1] = i;
            intArray[0] = j;
        }
        public static void main(String[] args) {
            int [] intArray= new int [] {4, 5};
            int i= intArray[0];
            int j= intArray[1];
            System.out.println(i + " " + j);
            exchange(intArray);
            System.out.println(intArray[0] + " " + intArray[1]);
        }
    }
