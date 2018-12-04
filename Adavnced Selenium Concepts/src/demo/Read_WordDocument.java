package demo;

import java.io.FileInputStream;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
   
public class Read_WordDocument {

public static void main (String[] args) throws Exception{	
	
	
try {
	
	
	XWPFDocument docx=new XWPFDocument(new FileInputStream("D:\\Abstract.doc.docx"));
	
	XWPFWordExtractor we=new XWPFWordExtractor(docx);
	System.out.println(we.getText());
	
  }catch(Exception e) {
	System.out.println(e);
	
	
	
}
}
}