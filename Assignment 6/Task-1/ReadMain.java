import java.io.*;
import java.util.NoSuchElementException;

public class ReadMain {
    public static void main (String[] args){
        File f = new File(args[0]);
        int counter = 0 ;
        try{
            System.out.println("Write the number of characters to be printed from the file: ");
            int num = Integer.parseInt(System.console().readLine());
            int skippedlines = Integer.parseInt(args[1]);
            BufferedReader br = new BufferedReader(new FileReader(f));
            int val;
            

            while((val = br.read()) != -1){
                System.out.println((char) val);
                counter++;
                if(counter == num/2) {
                    System.out.println();
                    br.skip(skippedlines);
                }
                else if (counter == num )break;
            }
            
        br.close();
        }catch (FileNotFoundException e) {
            System.out.println("unable to access file" + args[0]);
    }catch (IOException e) {
        System.out.println("IO Error!");

    }catch (NoSuchElementException e){
        System.out.println("No Element found!");
    }
}
}
