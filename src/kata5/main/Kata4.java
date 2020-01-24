package kata5.main;

import java.util.List;
import kata5.model.Histogram;
import kata5.model.Mail;
import kata5.view.MailHistogramBuilder;
import kata5.view.HistogramDisplay;
import kata5.view.MailListReader;

public class Kata4 { // controlador

    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
