import java.util.Random;
import java.math.BigInteger;

public class RSA
{
  BigInteger n, d, e;
  public void GenerateKeys(int bitLength)
  {
    Random rand = new Random();
    e = new BigInteger(bitLength, 100, rand);
    BigInteger p = new BigInteger(bitLength, 100, rand);
    BigInteger q = new BigInteger(bitLength, 100, rand);
    //BigInteger tot = BigInteger.valueOf(780);
    BigInteger one = BigInteger.valueOf(1);
    BigInteger zero = BigInteger.valueOf(0);
    n = p.multiply(q);

    BigInteger p1 = p.subtract(one);
    BigInteger q1 = q.subtract(one);
    BigInteger n = p.multiply(q);
    BigInteger gcd_value = p1.gcd(q1);
    BigInteger tot = p1.multiply(q1).divide(gcd_value);
    while(e.compareTo(one) < 1 || e.compareTo(tot) > -1 || e.gcd(tot).compareTo(one) != 0)
    {
      e = new BigInteger(bitLength, 100, rand);
    }
    d = e.modInverse(tot);





  }

  public BigInteger Encrypt(BigInteger num)
  {
    if(n == null || e == null)
    {
      return null;
    }
    else
    {
      return num.modPow(e, n);
    }

  }

  public BigInteger Decrypt(BigInteger num)
  {
    if(n == null || d == null)
    {
      return null;
    }
    else
    {
      return num.modPow(d, n);
    }
  }

}
