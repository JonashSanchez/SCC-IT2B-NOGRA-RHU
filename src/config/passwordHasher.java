/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 *
 * @author Hazel Nogra
 */
public class passwordHasher {
    
   
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
    MessageDigest md = MessageDigest.getInstance("SHA-512"); // Change to SHA-512
    byte[] hashBytes = md.digest(password.getBytes(StandardCharsets.UTF_8)); // Ensure UTF-8 encoding
    StringBuilder hexString = new StringBuilder();
    for (byte b : hashBytes) {
        hexString.append(String.format("%02x", b)); // Convert to hex string
    }
    return hexString.toString(); // SHA-512 will return 128 characters
}
    
}
