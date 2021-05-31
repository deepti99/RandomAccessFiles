import java.io.*;

public class RandomAccessFileDemo2 {
   public static void main(String[] args) {
   
      try {
         // create a new RandomAccessFile with filename test
         RandomAccessFile raf = new RandomAccessFile("samplefile", "rw");

         // write something in the file
         raf.writeUTF("Hello World");

         // set the file pointer at 0 position
         raf.seek(0);

         // read byte
         System.out.println("" + raf.readByte());

         // set the file pointer at 0 position
         raf.seek(0);

         // write 0 at the start
         raf.write(0);

         // read byte
         System.out.println("" + raf.readByte());
      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}

