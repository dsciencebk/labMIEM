/**
 * Created by tumas on 15.04.2016.
 */
public class LegendreSymbol {
    public static void main(String [] args){
        int a=7;
        int p=7;//simple number > 2
        System.out.println("Legendary symbol is:"+findLegendreSymbol(a,p));
    }
    private static int findLegendreSymbol(int a,int p){
        System.out.println("hh");
        if((a%p)==0){
            System.out.println("kk");
            return 0;
        }else if(vichet(a,p)){
            return 1;
        }else return -1;
    }
    private static boolean vichet(int a,int p) {
        int answer=0;
        System.out.println("mm");
        int[] o = new int[p - 1];
        for (int i = 1; i < p; i++) {
            System.out.println("i="+i);
            o[i-1] = (i*i) % p;
            System.out.println(o[i-1]);
        }
        for (int j = 0; j < p - 2; j++) {
            if (a == o[j]) {
                answer++;
            }
        }
        return answer>0;
    }
}
