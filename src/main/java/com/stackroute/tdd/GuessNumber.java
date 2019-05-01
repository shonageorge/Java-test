package com.stackroute.tdd;

public class GuessNumber {

    public String numberGuess(int targetNumber, int guessedNumber) {

        do {
            if (targetNumber >= 1 && targetNumber <= 100) {
                if (guessedNumber > targetNumber)                                            //guessed number greater than original number
                    return "Number guessed is more than original number";
                else if (guessedNumber < targetNumber)                                       //guessed number less than original number
                    return "Number guessed is less than original number";
                else
                    return "Number guessed matches the original number";                     //guessed number matches original number
            }
        } while (guessedNumber < targetNumber || guessedNumber > targetNumber);              // loop ends if guessed number is same as target number
             return "string";
    }

}
