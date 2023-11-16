package property_config_reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class property_reader {
	
	static FileReader fr;
	public static Properties propReaders() {
		File f = new File ("C:\\Users\\MONESH\\eclipse-workspace\\Cucumber\\src\\main\\java\\Project_Limeroad\\limeroad_properties");
		
		try {
			fr = new FileReader (f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties p = new Properties();
		try {
			p.load(fr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;
		
		
	}

}
