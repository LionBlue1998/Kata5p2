package kata5.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata5.model.Mail;

public class MailListReader {
    
    public static List<Mail> read (String fileName){
        List<Mail> list = new ArrayList<>();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            IteratorReader iteratorReader = new IteratorReader(reader);
            
            for (String line : iteratorReader) 
                if(Mail.isMail(line))
                    list.add(new Mail(line));
            
        }catch(FileNotFoundException exception){
            System.out.println("ERROR MailLisReader::read (FileNotFoundException)" + exception.getLocalizedMessage());
        }catch(IOException exception){
            System.out.println("ERROR MailLisReader::read (IOException)" + exception.getLocalizedMessage());
        }
        return list;
    }
}
