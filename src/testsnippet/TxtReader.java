/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testsnippet;

/**
 *
 * @author ja004302
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TxtReader {
    final static Charset ENCODING = StandardCharsets.UTF_8;
    
    List<String> readLines(String fileName) throws IOException{
        Path path = Paths.get(fileName);
        return Files.readAllLines(path, null);
    }
}
