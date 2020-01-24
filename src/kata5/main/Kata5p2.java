package kata5.main;

import java.util.ArrayList;
import java.util.List;
import kata5.model.Histogram;
import kata5.model.Mail;
import kata5.view.MailHistogramBuilder;
import kata5.view.HistogramDisplay;
import kata5.view.MailListReader;
import kata5.view.MailListReaderBD;

public class Kata5p2 { // controlador

    public static void main(String[] args) {
        String fileName = "email.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        ArrayList<String> mails = MailListReaderBD.read(fileName);
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
