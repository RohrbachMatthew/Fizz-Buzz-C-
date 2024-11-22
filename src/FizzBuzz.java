public class FizzBuzz {
    public static void main(String[] args){

        int i = 0;

        for(i=1; i<101; i++){
            if (i%3==0 && i%5==0){  // If num is dividable by 3 and 5
                System.out.println("Fizz Buzz");
            }else if(i%3==0){  // If num is dividable by 3
                System.out.println("Fizz");
            } else if (i%5==0) {  // If num is dividable by 5
                System.out.println("Buzz");

            }else{
                System.out.println(i);  // Print out number if not dividable by 5 or 3
            }
        }
    }
}
