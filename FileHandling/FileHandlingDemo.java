package FileHandling;
import java.io.*;
public class FileHandlingDemo {
    //main
    public static void main(String[] args) {
        String line;
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("FileHandling\\myFile.txt"));
            line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }          
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(reader != null){
                    reader.close();
                }
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
        
    }
    
}
