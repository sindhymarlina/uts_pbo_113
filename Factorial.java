//nomor 2

public class Factorial{
    public static void main (String args[]){
    Factorial f = new Factorial();
    System.out.print("8! = ");
    System.out.print(f.HitungFactorial(8));
    }
    public int HitungFactorial(int x){
    if(x==1){
    return 1;
    }
    else {
    return x * HitungFactorial(x-1);
    }
    }
    }
    