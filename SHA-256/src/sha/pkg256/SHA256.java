/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sha.pkg256;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author juanj
 */
public class SHA256 {

    public static String bytesToHex(byte[] bytes) {//transforms the byte digested to an string 
        StringBuffer result = new StringBuffer();
        for (byte byt : bytes) result.append(Integer.toString((byt & 0xff) + 0x100, 16).substring(1));
        return result.toString();
    }
    
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        String text = "abc";//Here comes the text to digest

        md.update(text.getBytes("UTF-8")); // Change this to "UTF-16" if needed
        byte[] digest = md.digest();// here is where the text is digest 
        System.out.println(bytesToHex(digest));
    
    }
    
}
