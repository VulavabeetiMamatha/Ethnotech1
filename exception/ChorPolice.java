package exception;

public class ChorPolice {
       static void chor(int amt,boolean isCaught) throws MyException
        {
            if(amt<0)
                throw new ArithmeticException("The theif is innocent");
            if(isCaught)
            {
                throw new MyException("The theif is caught");
            }
        }

        public static void main(String[] args)
        {
            try {
                chor(-562, true);
            }
            catch(ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            catch(MyException e) {
                System.out.println(e.getMessage());
            }

        }
}
