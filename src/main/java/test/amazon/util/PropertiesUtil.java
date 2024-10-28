package test.amazon.util;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;

import test.amazon.frameworkconstants.ConstantFile;

public final class PropertiesUtil {
	private PropertiesUtil() {

	}

	private static Properties property = new Properties();
	private static final HashMap<Object, Object> MAPCONST = new HashMap<>();

	static {
		/*
		 * created static block which will execute before the class members will get the
		 * values use only when you need to use these objects beacause these will be
		 * live here in whole life
		 * 
		 */
		// + ConstantFile.getPropertyFilePath() ** Need to append this path below with user.dir
		FileInputStream fileIO;
		try {
			fileIO = new FileInputStream(System.getProperty("user.dir"));
			property.load(fileIO);
			for (Object key : property.keySet()) {
				MAPCONST.put(key, property.get(key));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	// This is normal method to retrieve the value from the 
	/*
	 * public static String getValue1(String key) throws Exception {
	 * 
	 * // Here is a problem with code we are making connection with property
	 * property file each time when we need a value from the key what if we need //
	 * to access the value from the properties file thousand times then we have to
	 * do this process thousand times?
	 * 
	 * String value = property.getProperty(key);
	 * 
	 * if(Objects.isNull(value)) { // added a new exception to find the key name if
	 * value is null due to incorrect key
	 * 
	 * }
	 * 
	 * return value; }
	 */

	public static String getValue(String key) throws Exception {
		if (Objects.isNull(MAPCONST.containsValue(key)) || Objects.isNull(key)) {
			throw new Exception(
					"Key name: " + key + " is not found please check the value in the config.properties file");
		}
		return (String) MAPCONST.get(key);
	}

}
