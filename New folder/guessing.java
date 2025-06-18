// This program is a simple guessing game.
class guessing {
    public static void main(String[] args)
    throws java.io.IOException {
      char ch, answer = 'k';
      System.out .println("I am thinking of a letter between a and z.");
        System.out.println("Try to guess it: ");
        ch = (char) System.in.read();
      if (ch == answer) {
          System.out.println("** Right **");}
          else{
            System.out.println("...Sorry, you're wrong.");
          }
}}

