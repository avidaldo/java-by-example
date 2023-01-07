//https://javarevisited.blogspot.com/2012/12/inner-class-and-nested-static-class-in-java-difference.html#ixzz5iFYFKZxM

package p02_basic_syntax.innerClass;

public class InnerClassTest {

    public static void main(String args[]) {
      
        class Local {  // creating local inner class inside method
            public void name() {
                System.out.println("Example of Local class in Java");
            }
        }
      
        Local local = new Local();
        local.name(); //calling method from local inner class
      
        //Creating anonymous inner class in java for implementing thread
        Thread anonymous = new Thread(){
            @Override
            public void run(){
                System.out.println("Anonymous class example in java");
            }
        };
        anonymous.start();
      
        //example of creating instance of inner class
        InnerClassTest test = new InnerClassTest();
        Inner inner = test.new Inner();
        inner.name(); //calling method of inner class

    }
  
    /*
     * Creating Inner class in Java
     */
    private class Inner{
        public void name(){
            System.out.println("Inner class example in java");
        }
    }
}

/*
Output:
Example of Local class in Java
Inner class example in java
Anonymous class example in java
*/