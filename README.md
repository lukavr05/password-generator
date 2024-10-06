This project involves using images to create a "seed" by converting the image into bytecode and from that into Unicode characters

Encrypter is an object that contains all the methods for the operations performed on the image provided

        generateInputSeed -> takes the image from the path specified and a passwordLength to generate a "seed" that can be used as a password itself, or to encrypt a password using an algorithm

        encrypt -> takes a given password and encrypts it using the seed as an encryption key

        decrypt -> takes an encrypted password and decrypts it using the given seed

ImageEncrypter allows for a CLI interface to encrypt and decrypt and generate passwords

I am planning to add a feature to store all the passwords generated in order to be able to use aliases for the passwords
