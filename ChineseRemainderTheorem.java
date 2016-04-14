import java.math.BigInteger;

/**
 * Created by tumas on 14.04.2016.
 */
public class KitaiskayaObOstatkax {



    public static void main(String[] args){
        int k=3;
        int[] m ={3,5,7};//new int[k];//k штук, целые взаимно простые
        int[] a ={2,3,2};//new int[k];//k штук
        int x=0;
        int i=0;
        int M=1;
        int b;
        int c;
        //Для начал обозначим M=sum(m1,m2...mj)
        for(int j=0;j<k;j++){
            M*=m[j];
        }
        System.out.println(M);
        while(i<k){
            b=M/m[i];
            System.out.println("b="+b);
            c=invmod(b,m[i]);
            System.out.println("c="+c);
            x=x+(a[i]*b*c)%M;
            System.out.println("x="+x);
            i=i+1;
            System.out.println("i="+i);
        }System.out.println(x);
        System.out.println("x="+x%M+"(mod "+105+")");

    }
    public static int invmod(int a, int mod)
    {
        return BigInteger.valueOf(a).modInverse(BigInteger.valueOf(mod)).intValue();
    }

}
