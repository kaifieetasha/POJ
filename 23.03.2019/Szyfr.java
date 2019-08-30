//Autorzy: Iwona Rymanowska (nr indeksu 19330) oraz Jakub Janduła (nr indeksu 6343)
package szyfr;

public class Szyfr {
//koduje tylko litery i to tylko z jezyka angielskiego
	//szyfrowanie
	public static String encrypt(String plainText, int przesuniecie) {
		if(przesuniecie>26){
			przesuniecie = przesuniecie%26;
		}
		else if(przesuniecie<0) {
		przesuniecie = (przesuniecie%26)+26;
		}
	
		String cipherText = "";
		int lenght = plainText.length();
		for(int i = 0; i<lenght; i++ ) {
			char ch = plainText.charAt(i);
			if(Character.isLetter(ch)) {
				if(Character.isLowerCase(ch)) {
					char c =  (char)(ch+przesuniecie);
					if(c>'z'){
						cipherText += (char)(ch - (26-przesuniecie));
					}
					else {
						cipherText += c;
					}
				}
				else if(Character.isUpperCase(ch)) {
					char c =  (char)(ch+przesuniecie);
					if(c>'Z'){
						cipherText += (char)(ch - (26-przesuniecie));
					}
					else {
						cipherText += c;
					}
				}
			}
			else{
				cipherText += ch;
			}
		}
		return cipherText;
	}
	
	
	
	//deszyfrowanie
	
	public static String decrypt(String plainText, int przesuniecie) {
		if(przesuniecie>26){
			przesuniecie = przesuniecie%26;
		}
		else if(przesuniecie<0) {
		przesuniecie = (przesuniecie%26)+26;
		}
	
		String cipherText = "";
		int lenght = plainText.length();
		for(int i = 0; i<lenght; i++ ) {
			char ch = plainText.charAt(i);
			if(Character.isLetter(ch)) {
				if(Character.isLowerCase(ch)) {
					char c =  (char)(ch-przesuniecie);
					if(c<'a'){
						cipherText += (char)(ch + (26-przesuniecie));
					}
					else {
						cipherText += c;
					}
				}
				else if(Character.isUpperCase(ch)) {
					char c =  (char)(ch-przesuniecie);
					if(c<'A'){
						cipherText += (char)(ch + (26-przesuniecie));
					}
					else {
						cipherText += c;
					}
				}
			}
			else{
				cipherText += ch;
			}
		}
		return cipherText;
	}
	
	
	public static void main(String[] args) {
		String text = "Iwona Rymanowska";
		String cipher = encrypt(text, 7);
		System.out.println(cipher);
		String decrypted = decrypt(cipher, 7);
		System.out.println(decrypted);
	}

}
