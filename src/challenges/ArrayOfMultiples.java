package challenges;

public  class ArrayOfMultiples {

    public static int[] getArray(int num, int length){
        int[] array = new int[length];

        for (int i = 1; i <= length; i++){
            array[i-1] = num*i;
        }

        return array;

    }

}
