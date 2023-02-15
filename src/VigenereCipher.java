
public class VigenereCipher {
        private String key;
        private final String alphabet;

// Constructor
    public VigenereCipher(String key) {
            this.key = key.toLowerCase();
            alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }

// Encode method
    public String getKey(){
        return(key);
    }
    public void setKey(String k){
        key = k;
    }
    public String getAlphabet() {
        return(alphabet);
    }
        public String encode(String message) {
            StringBuilder encodedMessage = new StringBuilder();
            int a;
            int j;
            for (a = 0, j = 0; a < message.length(); a++) {
                char c = message.charAt(a);
                if (alphabet.indexOf(c) == -1){
                    encodedMessage.append(message.charAt(a));
                    j = ++j % key.length();
                    continue;
                }
                if (Character.isLetter(c)) {
                    encodedMessage.append((char) ((c + key.charAt(j) - 2 * 'a') % 26 + 'a'));
                    j = ++j % key.length();
                } else {
                    encodedMessage.append(c);
                }
            }
            return encodedMessage.toString().toLowerCase();
        }

// Decode method
        public String decode(String message) {
            int i;
            int j;
            String decodedMessage = "";
            for (i = 0, j = 0; i < message.length(); i++) {
                char c = message.charAt(i);
                if (alphabet.indexOf(c) == -1){
                    decodedMessage += message.charAt(i);
                    j = ++j % key.length();
                    continue;
                }
                if (Character.isLetter(c)) {
                    decodedMessage += (char) ((c - key.charAt(j) + 26) % 26 + 'a');
                    j = ++j % key.length();
                } else {
                    decodedMessage += c;
                }
            }
            return decodedMessage.toLowerCase();
        }
}
