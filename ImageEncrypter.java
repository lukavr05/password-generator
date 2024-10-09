import java.io.IOException;
import java.util.Scanner;

class ImageEncrypter {
    public static void main(String[] args) throws IOException {
        String path = args[0];
               
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to select:\n\n1) Password Creation\n\n2) Password Encryption\n\n3) Password Decryption\n\n");
        
        int choice = scan.nextInt();

        if (choice == 1) {
            System.out.println("Specify desired password length: ");
            int l = scan.nextInt();

            Encrypter encrypter = new Encrypter(path, l);
            String password = encrypter.generateInputSeed();
            System.out.println("Your password is: " + password);

        } else if (choice == 2){
            System.out.println("Enter password to be encrypted: ");
        }  
    
    }
}

