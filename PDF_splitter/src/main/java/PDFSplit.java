import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PDFSplit {
    public static void main(String[] args) throws IOException {
        File oldFile = new File("E://File Folder/biswaa.pdf");
        PDDocument document = PDDocument.load(oldFile);

        Splitter splitter = new Splitter();
        List<PDDocument> splitPages = splitter.split(document);

        int num = 1;
        for(PDDocument mydoc : splitPages)
        {
            mydoc.save("E://File Folder/Extract/split_0"+num+".pdf");
            num++;
            mydoc.close();
        }
        System.out.println("Split Done");

    }
}
