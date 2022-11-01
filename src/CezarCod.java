import Alphabet.Alphabet;
import Coding.CodingMessage;
import DeCoding.BruteForce;
import DeCoding.DeCodeMessage;
import HandlingFile.FileHandling;

import java.io.IOException;

public class CezarCod {
    private static String fileName = "message.txt";

    public static void main(String[] args) throws IOException {

        String contents = new FileHandling().readUsingFiles(fileName);

        String codeMessage = new CodingMessage().codingIncodeMessage(contents, 9);

        String bruteForce = new BruteForce().bruteForce(codeMessage);

        String deCodeMessage = new DeCodeMessage().getDeCodeMessage(codeMessage, 9);

    }
}
