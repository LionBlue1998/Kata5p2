package kata5.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MailListReaderBD {
    public static ArrayList<String> read (String fileName){
       ArrayList<String> list = new ArrayList<>();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File("email.txt")));     
            IteratorReader iteratorReader = new IteratorReader(reader);
            
            for(String line : iteratorReader)
                if(line.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$") == true)
                    list.add(line);
        }catch(IOException e){
            System.out.println("error" + e.getMessage());
        }
        
        return list; 
    }
}
