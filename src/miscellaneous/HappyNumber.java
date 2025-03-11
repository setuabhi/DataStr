package miscellaneous;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
isHappy(1);
    }

    public static boolean isHappy(int n) {
        boolean output=false;
        HashSet<Integer> hashSet= new HashSet<>();
        if(n==1)
        {
            output=true;
        }
        while(n!=1)
        { int sum=0;
            if(!hashSet.add(n))
            {
                break;
            }
            do {
                int lastNumber= n%10;
                sum+=lastNumber*lastNumber;
                n=n/10;
            }
            while(n>0);
            if(sum==n || sum==1)
            {
                output=true;

            }
            n=sum;
        }
        return output;
    }
}
