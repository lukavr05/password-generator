import java.io.IOException;
import java.util.Scanner;

class ImageEncrypter {
    public static void main(String[] args) throws IOException {
        String path = args[0];
        Encrypter encrypter = new Encrypter(path);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to select:\n\n1) Password Creation\n\n2) Password Encryption\n\n3) Password Decryption\n\n");
        
        int choice = scan.nextInt();
        scan.close();

        if (choice == 1) {
            String password = encrypter.generateInputSeed();
            System.out.println("Your password is: " + password);
        } else if (choice == 2){
            System.out.println("Enter password to be encrypted: ");
        }  
    
    }

