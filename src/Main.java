import challenges.ArrayOfMultiples;
import challenges.Poll;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

//        Poll poll = new Poll(32, 10);
//
//        System.out.println(poll.tallyVotes());

//        System.out.println(Arrays.toString(ArrayOfMultiples.getArray(5, 10)));


        //Using functional interface since there are no functions in java
        interface Multiples{
            int[] calculate(int num, int length);
        }

        Multiples arr = (int num, int length) -> {
            return IntStream.rangeClosed(1, length).map(number -> number*num).toArray();
        };

        System.out.println(Arrays.toString(arr.calculate(5, 10)));

    }
}