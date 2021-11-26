package Activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		//Initialize an array with 6 number: [10, 77, 10, 54, -11, 10]
		int[] num = {10, 77, 10, 54, -11, 10};
		System.out.println("Numbers in the array are: " + Arrays.toString(num));
		
		//Set constants
        int needNum = 10;
        int Sum = 30;

        //Print result
        System.out.println("Result: " + result(num, needNum, Sum));
    }

    public static boolean result(int[] numbers, int needNum, int Sum) {
        int temp_sum = 0;
        //Loop through array
        for (int number : numbers) {
            //If value is 10
            if (number == needNum) {
                //Add them
                temp_sum += needNum;
            }

            //Sum should not be more than 30
            if (temp_sum > Sum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == Sum;
    }
}