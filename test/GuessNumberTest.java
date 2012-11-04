import guessNumber.GuessNumber;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GuessNumberTest {

    @Test
    public void should_return_4a0b_given_all_digits_is_correct(){
        GuessNumber guessNumber = new GuessNumber("1234");
        String result = guessNumber.validate("1234");
        assertEquals("4a0b", result);
    }

    @Test
    public void should_return_3a0b_given_partial_digits_are_correct(){
        GuessNumber guessNumber = new GuessNumber("1234");
        String result = guessNumber.validate("1235");
        assertEquals("3a0b", result);
    }

    @Test
    public void should_return_2a0b_given_two_digits_are_correct(){
        GuessNumber guessNumber = new GuessNumber("1234");
        String result = guessNumber.validate("1256");
        assertEquals("2a0b",result);
    }

    @Test
    public void should_return_2a0b_given_two_digits_are_correct_and_one_number_place_is_right(){
        GuessNumber guessNumber = new GuessNumber("1234");
        String result = guessNumber.validate("1246");
        assertEquals("2a1b",result);
    }

    @Test
    public void should_return_2a0b_given_two_digits_are_correct_and_two_number_place_is_right(){
        GuessNumber guessNumber = new GuessNumber("1234");
        String result = guessNumber.validate("1243");
        assertEquals("2a2b",result);
    }

    @Test
    public void validate_length_of_input(){
        String input = "1234";
        GuessNumber guessNumber = new GuessNumber(input);
        String len = guessNumber.validate_len("1234");
        assertEquals("4",len);
    }

    @Test
    public  void validate_repeat_number_of_input(){
        String input = "1234";
        GuessNumber guessNumber = new GuessNumber(input);
        String res = guessNumber.validate_repeat("2557");
        assertEquals("yes",res);
    }

    @Test
    public void validate_number_of_input(){
        String input = "1234";
        GuessNumber guessNumber = new GuessNumber(input);
        String res = guessNumber.validate_number("1234");
        assertEquals("yes",res);
    }
}
