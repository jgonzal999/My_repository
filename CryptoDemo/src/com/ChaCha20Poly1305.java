package com;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

public class ChaCha20Poly1305 {
	private static final String ENCRYPT_ALGO = "ChaCha20-Poly1305";
	private static final int NOCE_LEN=12;
	public byte[] encrypt (byte[] pText, SecretKey key) throws Exception{
		return encrypt(pText, key, getNonce());
	}
	private Object getNonce() {
		return null;
	}
	public byte[] encrypt (byte[] pText, SecretKey key, byte[] nonce) throws Exception{
		
		return encrypt(pText, key, getNonce());
	}
}
