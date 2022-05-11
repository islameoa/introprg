public class FBBEvaluator {
    public static String eval(int input) {
        if (input % 3 == 0 && input % 5 == 0 && input % 7 == 0) {
            return "FizzBuzzBazz";
        } else if (input % 3 == 0 && input % 5 == 0) {
            return "FizzBuzz";
        } else if (input % 3 == 0 && input % 7 == 0) {
            return "FizzBazz";
        } else if (input % 5 == 0 && input % 7 == 0) {
            return "BuzzBazz";
        } else if (input % 3 == 0) {
            return "Fizz";
        } else if (input % 5 == 0) {
            return "Buzz";
        } else if (input % 7 == 0) {
            return "Bazz";
        } else {
            return Integer.toString(input);
        }
    }
}