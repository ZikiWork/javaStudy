package JavaTcpSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * ∑√Œ URLµƒƒ⁄»›£°
 * 
 * @author Administrator
 *
 */
public class URLContent {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.51cto.com/");
		InputStream is = url.openStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		String s = null;
		while ((s = reader.readLine()) != null) {
			System.out.println(s);
		}
		reader.close();
	}
}
