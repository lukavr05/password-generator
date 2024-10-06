import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Random;

class Encrypter {
    private String password, inputSeed, imgURL;
    private int passwordLength;

    public Encrypter(String i, int l) {
        imgURL = i;
        passwordLength = l;
        inputSeed = null;
        password = null;
    }

    public Encrypter(String i) {
        imgURL = i;
        passwordLength = 12;
        inputSeed = null;
        password = null;
    }

    public String getPassword() { return password; }
    public String getInputSeed() { return inputSeed; }
    public String getImageURL() { return imgURL; }
    public int getPasswordLength() { return passwordLength; }

    public void setPassword(String p) { password = p; }

    public String generateInputSeed() throws IOException { 
        // code for converting image to encryption seed
        Random r = new Random();

        File img = new File(this.getImageURL());
        byte[] bytes = new byte[(int) img.length()];

        try (InputStream in = new FileInputStream(img)) {
            in.read(bytes);
        } catch (IOException e) {
            System.err.print("Error reading file");
        }

        String imageAsString = Base64.getEncoder().encodeToString(bytes);
        int randomIndex = r.nextInt(0,imageAsString.length()-passwordLength);
        return imageAsString.substring(randomIndex,randomIndex + passwordLength);
    }

    public String encrypt() {
        // code for encrypting the generated password using encryption seed and storing it
    // maybe store the ramndomIndex at the end of the password and encrypt it too so that the program knows where to find it
        return null; 
    }

    public String decrypt() {
        // given input image, decrypt the stored password
        return null;
    }
}
