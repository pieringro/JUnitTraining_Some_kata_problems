package com.pierprogramm.training.junit.codewars.sumdigitsconsecutivepower;


import java.util.ArrayList;
import java.util.List;

/*
Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!

The number 89 is the first integer with more than one digit that fulfills the property partially introduced in the title of this kata.
What's the use of saying "Eureka"? Because this sum gives the same number.

In effect: 89 = 8^1 + 9^2

The next number in having this property is 135.

See this property again: 135 = 1^1 + 3^2 + 5^3

We need a function to collect these numbers, that may receive two integers a, b that defines the range [a, b] (inclusive)
and outputs a list of the sorted numbers in the range that fulfills the property described above.

Let's see some cases:

sum_dig_pow(1, 10) == [1, 2, 3, 4, 5, 6, 7, 8, 9]

sum_dig_pow(1, 100) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]

If there are no numbers of this kind in the range [a, b] the function should output an empty list.

sum_dig_pow(90, 100) == []

Enjoy it!!

* */
public class SumDigitsPower {

    public static List<Long> sumDigitsPow(long first, long last) {
        List<Long> outputList = new ArrayList<>();
        List<Long> allRange = getAllNumberInRange(first, last);
        for (Long n : allRange) {
            if (checkIfNumberIsEureka(n)) {
                outputList.add(n);
            }
        }
        return outputList;
    }

    private static List<Long> getAllNumberInRange(long first, long last){
        List<Long> allRange = new ArrayList<>();
        for (long i = first; i < last; i++) {
            allRange.add(i);
        }
        return allRange;
    }

    private static boolean checkIfNumberIsEureka(Long eurekaNumber) {
        boolean result = false;
        String number = String.valueOf(eurekaNumber);
        char[] allNumberDigits = number.toCharArray();
        int sumMultDigits = 0;
        for (int i = 0; i < allNumberDigits.length; i++) {
            int matchingInt = Character.getNumericValue(allNumberDigits[i]);
            sumMultDigits += Math.pow(matchingInt, i + 1);
        }
        result = (sumMultDigits == eurekaNumber);
        return result;
    }

}
