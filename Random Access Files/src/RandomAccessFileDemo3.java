import java.io.*;

public class RandomAccessFileDemo3 {
   public static void main(String[] args) {

      try {
         char c = 'H';
         
         // create a new RandomAccessFile with filename test
         RandomAccessFile raf = new RandomAccessFile("samplefile", "rw");

         // write something in the file
         raf.writeChar('C');

         // set the file pointer at 0 position
         raf.seek(0);

         // read char
         System.out.println("" + raf.readChar());

         // set the file pointer at 0 position
         raf.seek(0);

         // write a char at the start
         raf.writeChar(c);

         // set the file pointer at 0 position
         raf.seek(0);

         // read char
         System.out.println("" + raf.readChar());
      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}