//
//
//
//
//    public class test {
//        test() {
//        }
//
//
//
//            VigenereCipher vc = new VigenereCipher("lemon");
//
//                    String encodedMessage = vc.encode("attackatdawn");
//
//                    System.out.println(encodedMessage); // lxfopvefrnhr
//
//            String decodedMessage = vc.decode("lxfopvefrnhr");
//
//                    System.out.println(decodedMessage); // attackatdawn
//
//
//            String anotherEncodedMessage = vc.encode("attack!atdawn");
//
//                    System.out.println(anotherEncodedMessage); // lxfopv!mhqlaz
//
//            String anotherDecodedMessage = vc.decode("lxfopv!mhqlaz");
//
//                    System.out.println(anotherDecodedMessage); // attack!atdawn
//
//            // Work with lowercase letters. That is, convert the key to lowercase when it is initialized, and the encoded or decoded message should only display lowercase letters.
//
//            String aFurtherEncodedMessage = vc.encode("attackAtdaWn");
//
//                    System.out.println(aFurtherEncodedMessage); // lxfopvefrnhr
//        }
//    }