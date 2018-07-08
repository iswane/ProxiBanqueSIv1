/**
 * 
 */
package sn.objis.proxibanquesi.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author OBJIS #10000codeurs
 *
 */
public class CryptagePasswd {
	private static StringBuilder stringBuilder = null;

	public static String chiffrage(String chaineChiffrer) {

		try {

			stringBuilder = new StringBuilder();

			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

			byte[] hachage = messageDigest.digest(chaineChiffrer.getBytes("UTF-8"));

			for (int i = 0; i < hachage.length; i++) {
				stringBuilder.append(Integer.toString((hachage[i] & 0xff) + 0x100, 16).substring(1));
			}
		} catch (NoSuchAlgorithmException e) {
			Logger.getLogger(CryptagePasswd.class.getName(), null).log(Level.SEVERE, null, e);
		} catch (UnsupportedEncodingException e) {
			Logger.getLogger(CryptagePasswd.class.getName(), null).log(Level.SEVERE, null, e);
		}

		return stringBuilder.toString();
	}
}
