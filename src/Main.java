import java.io.*;


public class Main{
    public static void main (String[])args;




       String file_name = "input. txt ";
    File f = new File (file_name);


     try {
       // if(f.createNewFile()) {

           System.out.println("file is successfully created ");
        }else{
            System.out.println("File already exist");

      //  }

      //  FileWriter fw = new FileWriter(f);
      // FileWriter fw = new FileWriter(f,true);

       // fw.write("this is appended content/n");
        //fw.write("we are gen-z nation!");
     //   fw.close();
     //   fw.write("we are gen-z nation!");


   FileReader fr =new FileReader(f) ;

   int val;
   while ((val=fr.read()) !=-1 ){
        try {
            val =  fr.read()
        } catch (IOException ex ) {
            throw new RuntimeException(ex);
        }
        System.out.println((char)val);

        try {
            val =  fr.read()
        } catch (IOException ex ) {
            throw new RuntimeException(ex);
        }
        System.out.println((char)val);

        try {
            val =  fr.read()
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println((char)val);
} catch (IOException ex) {
    System.out.println("I0 Exception happens");
    }
}





