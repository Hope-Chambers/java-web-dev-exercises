package exercises;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arrayOfNum = {1, 1, 2, 3, 5, 8};
        for (int i : arrayOfNum) {
           if (i % 2==1)
                System.out.println(i);
        }
    }
}

//int array length= array.length;
