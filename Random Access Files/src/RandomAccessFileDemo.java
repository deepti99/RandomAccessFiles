
import java.io.*;

public class RandomAccessFileDemo {
   public static void main(String[] args) {

      try {
         // create a new RandomAccessFile with filename test
         RandomAccessFile raf = new RandomAccessFile("samplefile", "rw");

         // write something in the file
         raf.writeUTF("Hello World");

         // set the file pointer at 0 position
         raf.seek(0);

         // read and print the contents of the file
         System.out.println("" + raf.readUTF());

         // close the strea and release resources
         System.out.println("Closing Stream...");
         raf.close();
         System.out.println("Stream Closed.");
      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}