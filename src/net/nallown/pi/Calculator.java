package net.nallown.pi;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * @auther Nasir
 */
public class Calculator {
    private final BigInteger two = BigInteger.valueOf(2);
    private final BigInteger three = BigInteger.valueOf(3);
    private final BigInteger four = BigInteger.valueOf(4);
    private final BigInteger seven = BigInteger.valueOf(7);

    private BigInteger q = BigInteger.ONE;
    private BigInteger r = BigInteger.ZERO;
    private BigInteger t = BigInteger.ONE;
    private BigInteger k = BigInteger.ONE;
    private BigInteger n = BigInteger.valueOf(3);
    private BigInteger l = BigInteger.valueOf(3);
    private PrintWriter out;
    private int dc = 0;

    public void start() {
        BigInteger nn, nr;

        try {
            out = new PrintWriter(System.getProperty("user.home") + "/out.pi");

            while(true) {
                if(four.multiply(q).add(r).subtract(t).compareTo(n.multiply(t)) == -1){
                    out.print(n);
                    if (dc == 0)
                        out.print(".");
                    dc++;
                    out.flush();
                    System.out.println(dc + ", Decimals Computed");

                    nr = BigInteger.TEN.multiply(r.subtract(n.multiply(t)));
                    n = BigInteger.TEN.multiply(three.multiply(q).add(r)).divide(t).subtract(BigInteger.TEN.multiply(n));
                    q = q.multiply(BigInteger.TEN);
                    r = nr;
                } else {
                    nr = two.multiply(q).add(r).multiply(l);
                    nn = q.multiply((seven.multiply(k))).add(two).add(r.multiply(l)).divide(t.multiply(l));
                    q = q.multiply(k);
                    t = t.multiply(l);
                    l = l.add(two);
                    k = k.add(BigInteger.ONE);
                    n = nn;
                    r = nr;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }
    }

}
