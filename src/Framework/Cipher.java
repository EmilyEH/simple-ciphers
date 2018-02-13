/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

/**
 *
 * @author garzio
 */
public abstract class Cipher {
    public abstract String encrypt(String message, String key);
    public abstract String decrypt(String message, String key);
}
