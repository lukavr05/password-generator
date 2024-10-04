import java.io.IOException;

class ImageEncrypter {
    public static void main(String[] args) throws IOException {
        String path = args[0];
        Encrypter en = new Encrypter(path);
        System.out.print(en.generateInputSeed());
    }
}