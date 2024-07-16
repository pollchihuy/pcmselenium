package coid.juaracoding.pcmselenium.core;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.engines.AESLightEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.encoders.Hex;

public class Crypto {
    private static final String defaultKey = "19974a8573aeb1d1a1b868675226a5b08b3a128c900c4accd89ceea1434214e2";
    public static String performEncrypt(String keyText, String plainText) {
        try{
            byte[] key = Hex.decode(keyText.getBytes());
            byte[] ptBytes = plainText.getBytes();
            BufferedBlockCipher cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new AESLightEngine()));
            cipher.init(true, new KeyParameter(key));
            byte[] rv = new byte[cipher.getOutputSize(ptBytes.length)];
            int oLen = cipher.processBytes(ptBytes, 0, ptBytes.length, rv, 0);
            cipher.doFinal(rv, oLen);
            return new String(Hex.encode(rv));
        } catch(Exception e) {
            return "Error";
        }
    }

    public static String performEncrypt(String cryptoText) {
        return performEncrypt(defaultKey, cryptoText);
    }

    public static String performDecrypt(String keyText, String cryptoText) {
        try {
            byte[] key = Hex.decode(keyText.getBytes());
            byte[] cipherText = Hex.decode(cryptoText.getBytes());
            BufferedBlockCipher cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new AESLightEngine()));
            cipher.init(false, new KeyParameter(key));
            byte[] rv = new byte[cipher.getOutputSize(cipherText.length)];
            int oLen = cipher.processBytes(cipherText, 0, cipherText.length, rv, 0);
            cipher.doFinal(rv, oLen);
            return new String(rv).trim();
        } catch(Exception e) {
            return "Error";
        }
    }

    public static String performDecrypt(String cryptoText) {
        return performDecrypt(defaultKey, cryptoText);
    }

    public static void main(String[] args) {

        String strToEncrypt = "123";//put text to encrypt in here
//        String strToEncrypt = "nurlcmfhqyogsvui";//put text to encrypt in here
        String encryptionResult = new Crypto().performEncrypt(strToEncrypt);
        System.out.println("Encryption Result : "+encryptionResult);
        // KEY -> aafd12f438cae52538b479e3199ddec2f06cb58faafd12f6
//        System.out.println("KEY PENTING BANGET !!! "+defaultKey);;
        //ENCRYPT -> 528b01943544a1dcef7a692a0628e46b ->

        //ENCRYPT -> bdcc9507be280e3e5489a5dce01b42ea
        //KEY -> aafd12f438cae52538b479e2089ddec2f06cb58faafd12f6

//        String strToDecrypt = "5eb279dd4ab4b51e4c8a70d8728ddb20437eaaa1dd2321d98de012117e1a45bb23773123ccae83927e47294c3cfc629fe5fcb9d7b96e093cf7cb7423f90bf96b1d80521db74c74029d3eb14b5883fafef9a9b20a0fb6b710de6a63c9b6f4dff5f77d3200a9e636a2a52b1e3ce3f7c2bffccee372b0710980a1ee290055f69d3198e16ba656a85bf4075e0e8c1e32fec8c265f7de996f8958c08d5eb4abbc2fc8677ed6da0b9e3a8fb7d307343e3a96ca234a684732033268bcac20a5b103bd0f16a069e052633c5c8cf3981dd7c19725b00c1e341b966462a687fc7521bcf8c254af4c4504ae5ce8944acbc8ab57911fb3067522f039fb0f5f77958cee3c9cc5b1f052788c30e87a3f8da63988dd9eb95ec259faa22ee3fcbbb092a1dd8b8b0c";//put text to decrypt in here
        String strToDecrypt = "5eb279dd4ab4b51e4c8a70d8728ddb20437eaaa1dd2321d98de012117e1a45bb23773123ccae83927e47294c3cfc629fe5fcb9d7b96e093cf7cb7423f90bf96b52f6b8b2e3196075549aa8174cd004cf133f445aa7b4152f5687a8f993c7846592af4d632c8a812e3c2d9d3834d687d35fd2a5b01cc6d1c2a6c5c537ce8794763be4581074436b138ef7bb9a7680748383fd6d7a8fe83b34f8c2199085affc9538b902c2a493ffb8942404468e83fd6d2ac8fc910cc038be0fdca2742b4dc3381e49fbc0f4f14152bc29176bbd009591105ae73a95bc52012a9f4c69fdd00281314c68340ed4a037daddcd85439a8723c70dcffddd5ceba6c67889251555074dc5f2de140a46d86b805c07a679b523cadddce16acd5527e45aa27f1b4cd702f381e7edb32020b77b25f663cba0b162c6";//put text to decrypt in here
        String decriptionResult = new Crypto().performDecrypt(strToDecrypt);
        System.out.println("Decryption Result : "+decriptionResult);
        System.out.println("Untuk VIVO X5 DEFAULT AJA BELUM DI SET ".length());
        //585107f50fa1e0649bd32da95d5cf41c
        //585107f50fa1e0649bd32da95d5cf41c
        //585107f50fa1e0649bd32da95d5cf41c
    }
}