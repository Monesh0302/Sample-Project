package property_config_reader;

public class Config_reader {
	
	private String browser = property_reader.propReaders().getProperty("browser");

	public String getBrowser() {
		return browser;
	}

	private String url = property_reader.propReaders().getProperty("url");	

	public String getUrl() {
		return url;
	}

}
