package guessNumber;

public class GuessNumber {

    private String randomNumber;

    public GuessNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String validate(String userInput) {
        //parse input and randomNumber to int[]
        //compare and find "a"s
        //return result
//        int[] random = new int[this.randomNumber.length()] ;
//        for (int i = 0; i < this.randomNumber.length(); i++) {
//            random[i] = this.randomNumber.charAt(i);
//        }
//
//        int[] user = new int[userInput.length()];
//        for (int i = 0; i < userInput.length(); i++){
//            user[i] = userInput.charAt(i);
//        }
        char[] random = randomNumber.toCharArray();
        char[] user = userInput.toCharArray();

        int a = 0;
        int b = 0;
        for (int i = 0; i < random.length; i++){
            if (random[i] == user[i])
                a++;
            else
                if (randomNumber.contains(userInput.substring(i,i+1)))
                    b++;
        }

        return  String.format("%da%db",a,b);
    }

    public String validate_len(String s) {
        return  String.valueOf(s.trim().length());
      //  return "0";
    }

    public String validate_repeat(String s) {
        int[] times = new int[10];
        for (int i = 0; i < 10; i++)
            times[i] = 0;
        char[] inputs = s.toCharArray();
        for (char x : inputs){
             times[x-48]++;
        }
        for (int i = 0; i < 10; i++)
            if (times[i]>1)
                return "yes";
        return "no";
    }

    public String validate_number(String s) {
        char[] schar = s.toCharArray();
        for (char c : schar){
            if (!('0'<c&&c<'9'))
                return "no";
        }
        return "yes";
    }
}
