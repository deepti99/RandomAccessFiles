
import java.io.*;

public class RandomAccessFileDemo1 {
   public static void main(String[] args) {
   
      try {
         // create a new RandomAccessFile with filename test
         RandomAccessFile raf = new RandomAccessFile("samplefile", "rw");

         // write something in the file
         raf.writeUTF("Enjoy Java");

         // set the file pointer at 0 position
         raf.seek(0);

         // read and print the contents of the file
         System.out.println("" + raf.readUTF());

         // print the length of the file
         System.out.println("" + raf.length());

         // write something more in the file
         raf.writeUTF("This is an example");

         // print the length of the file
         System.out.println("" + raf.length());
      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}