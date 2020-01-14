package piwords;
public class PiGenerator {
        public static int[] computePiInHex(int precision) {
        // TODO: Implement (Problem b)
    	if(precision<0) {
    		return null;
    	}
    	int [] intlist = new int[precision];
    	for(int i=0;i<precision;i++) {
    		int newdigit = piDigit(i+1);
    		intlist[i] = newdigit;	
    	}
    	return intlist;
    }
        public static int piDigit(int n) {
            if (n < 0) return -1;

            n -= 1;
            double x = 4 * piTerm(1, n) - 2 * piTerm(4, n) -
                       piTerm(5, n) - piTerm(6, n);
            x = x - Math.floor(x);

            return (int)(x * 16);
        }
    private static double piTerm(int j, int n) {
        // Calculate the left sum
        double s = 0;
        for (int k = 0; k <= n; ++k) {
            int r = 8 * k + j;
            s += powerMod(16, n-k, r) / (double) r;
            s = s - Math.floor(s);
        }
        
        // Calculate the right sum
        double t = 0;
        int k = n+1;
        // Keep iterating until t converges (stops changing)
        while (true) {
            int r = 8 * k + j;
            double newt = t + Math.pow(16, n-k) / r;
            if (t == newt) {
                break;
            } else {
                t = newt;
            }
            ++k;
        }
        
        return s+t;
    }
        public static int powerMod(int a, int b, int m) {
        // TODO: Implement (Problem a)
    	if(a<0 && b<0 && m<=0) {
    		return -1;
    	}
    	return (int) Math.pow(a, b)%m;
    }

}
