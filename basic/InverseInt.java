import java.util.Scanner;

public class InverseInt {
     private static int  f(int a){
        return a+1;
    }

    static int inverse(int num){
        int inversedNum = 0,digit,res=num,length;
        length = (int) (Math.log10(num) + 1);

        do{
            digit = res % 10;
            res = res / 10;
            inversedNum += digit * (int)Math.pow(10, length-1);
            length--;
        }while(res > 0)     ;

         return inversedNum;
    }
    public static void main(String[] args) {
        System.out.println(inverse(756));
    }
}
