package searchingSorting;

import java.util.HashMap;
import java.util.HashSet;

public class coinStairAraange {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(2));
    }

    public static int arrangeCoins(int n) {
        int output=0;
        HashSet<String> hs= new HashSet<>();
        for(int i=1;i<=n;i++)
        {
            int currentsum=i*(i+1)/2;
            int nextSum=(i+1)*(i+2)/2;
            if(currentsum==n || (currentsum<n && nextSum>n))
            {output=i;
            break;}
        }
        return output;
    }
}
