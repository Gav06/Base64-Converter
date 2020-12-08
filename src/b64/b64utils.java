package b64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class b64utils {
	public static String encode(String input) {
		
		return Base64.getEncoder().encodeToString(stringtobytearray(input));
	}
	
	public static String decode(String input) {
		byte[] byteString = stringtobytearray(input);
		byte[] byteString2 = Base64.getDecoder().decode(byteString);
		return byteArrayToString(byteString2);
	}
	
	public static byte[] stringtobytearray(String input) {
		byte[] byteArray = input.getBytes();
		return byteArray;
	}
	
	public static String byteArrayToString(byte[] arr) {
		String s = new String(arr, StandardCharsets.UTF_8);
		return s;
	}
}
