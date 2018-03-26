 import com.x5.template.Theme;
 import com.x5.template.Chunk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
 import java.io.IOException;
import java.util.Date;

public class tlstest{
	
	String FILEPATH = "SalesReceived";
	String OP_FILEPATH = "SalesReceived.glstd";
	String IN_FILEPATH = "D:/SAP-input/sales.csv";
	
public static void main(String args[]) {
tlstest tls= new tlstest();

try {
	tls.readSalesFile() ;
	tls.writeTemplatedFile();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

public void readSalesFile() throws IOException

{
	BufferedReader br = null;
	FileReader fr = null;

	try {

		//br = new BufferedReader(new FileReader(FILENAME));
		fr = new FileReader(IN_FILEPATH);
		br = new BufferedReader(fr);

		String sCurrentLine;

		while ((sCurrentLine = br.readLine()) != null) {
			System.out.println(sCurrentLine);
		}

	} catch (IOException e) {

		e.printStackTrace();

	} finally {

		try {

			if (br != null)
				br.close();

			if (fr != null)
				fr.close();

		} catch (IOException ex) {

			ex.printStackTrace();

		}

	}	
}
 public void writeTemplatedFile() throws IOException
 {
     Theme theme = new Theme();
     Chunk chunk = theme.makeChunk(FILEPATH,"tmpl");

     // replace static values below with user input
     chunk.set("date", new Date().getTime());
     chunk.set("orderId", "1234jskdhkjhdkjhd");         
     chunk.set("B_ACC", "KMOL");
     chunk.set("H_ACC", "KM1024OL");
     

     String outfilePath = OP_FILEPATH;
     File file = new File(outfilePath);
     FileWriter out = new FileWriter(file);

     chunk.render( out );
chunk.render(out);

System.out.println(chunk.toString());
     out.flush();
     out.close();
 }}