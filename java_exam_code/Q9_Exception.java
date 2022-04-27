
class WrongDivisorType extends Throwable {}

class Except
  {
    public static void main(String args[])
    {
      int Qt = 0;
      int divident = 12;
      int divisor = -12;
      try
        {
          Qt = divident / divisor;
          if(Qt == -1)
          {
            throw new WrongDivisorType();
          }
        }
      catch(WrongDivisorType dv)
        {
          System.out.println("Exception Occured");
        }
      catch(Exception e)
        {}
      finally
        {
          System.out.println(Qt);
        }
    }
  }