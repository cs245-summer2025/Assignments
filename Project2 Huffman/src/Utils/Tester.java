package Utils;

import Decoder.HuffmanDecoder;
import Encoder.HuffmanEncoder;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import java.io.IOException;

class Tester {

    public String read(String filePath){
        TextReader r = new TextReader(filePath);
        StringBuilder res = new StringBuilder();
        while(true){
            int asciiValue = r.readNextChar();
            if(asciiValue < 0){
                break;
            }

            char currentCharacter = (char) asciiValue;
            res.append(currentCharacter);
        }
        return res.toString();
    }

    @Test
    void testConstitution() {
        System.out.println("Testing Constitution");

        String inputFile = "data/constitution.txt";
        String compressedFile = "data/constitution_compressed.txt";
        String uncompressedFile = "data/constitution_recovered.txt";

        // Encode and decode
        HuffmanEncoder.encodeFile(inputFile, compressedFile);
        HuffmanDecoder.decodeFile(compressedFile, uncompressedFile);

        // Check if can recover constitution text
        String original = read("data/constitution.txt");
        String uncompressed = read("data/constitution_recovered.txt");

        assertTrue("Unable to recover original text for constitution", original.equals(uncompressed));
    }

    @Test
    void testLOTF() {
        System.out.println("Testing LOTF");

        String inputFile = "data/lotf.txt";
        String compressedFile = "data/lotf_compressed.txt";
        String uncompressedFile = "data/lotf_recovered.txt";

        // Encode and decode
        HuffmanEncoder.encodeFile(inputFile, compressedFile);
        HuffmanDecoder.decodeFile(compressedFile, uncompressedFile);

        // Check uncompression success rate
        String original = read("data/lotf.txt");
        String uncompressed = read("data/lotf_recovered.txt");
        assertTrue("Unable to recover original text for LOTF", original.equals(uncompressed));

    }

    @Test
    void testWarAndPeace() {
        System.out.println("Testing War and Peace");

        String inputFile = "data/warandpeace.txt";
        String compressedFile = "data/warandpeace_compressed.txt";
        String uncompressedFile = "data/warandpeace_recovered.txt";

        // Encode and decode
        HuffmanEncoder.encodeFile(inputFile, compressedFile);
        HuffmanDecoder.decodeFile(compressedFile, uncompressedFile);

        // Check uncompression success rate
        String original = read("data/warandpeace.txt");
        String uncompressed = read("data/warandpeace_recovered.txt");
        assertTrue("Unable to recover original text for war and peace", original.equals(uncompressed));
    }
}
