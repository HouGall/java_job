package offer;

//实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。
//
public class offer16 {
    public static double myPow(double x, int n) {
        boolean flag = false;
        if(n<0){
            flag = true;
            n = Math.abs(n);
        }
        double res = 1;
        while (n!=0){
            if((n&1)==1){
                res*=x;
            }
            n>>>=1;
            x*=x;
        }
        if (flag){
            return 1/res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(myPow(-2,-3));
    }
}
