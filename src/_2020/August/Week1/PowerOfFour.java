package _2020.August.Week1;

public class PowerOfFour {

    public static void main(String[] args) {
        long startTime  = System.nanoTime();
        System.out.println(isPowerOfFour( 1048576 ));
        long finishTime  = System.nanoTime();
        System.out.println(finishTime-startTime);


        long startTime1  = System.nanoTime();
        System.out.println(isPowerOfFour1( 1048576 ));
        long finishTime1  = System.nanoTime();
        System.out.println(finishTime1-startTime1);
    }

    public static boolean isPowerOfFour(int num) {
        if(num == 0)
            return false;
        while(num >= 4 && num%4 == 0)
            num/=4;
        return num == 1;
    }


    public static boolean isPowerOfFour1(int num) {

        if( ((num-1)&num)!=0)
            return false;


        if((num&1431655765)!=0)
            return true;
        else
            return false;
    }
}
