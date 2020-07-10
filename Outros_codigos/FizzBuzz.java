public class FizzBuzz {
    public static void main (String[] args) {
        int i = 1;
        while (i <= 20) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            } else if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println("fizz");
            }
            i++;
        }
    }
}