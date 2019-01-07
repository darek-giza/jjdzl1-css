package com.infoshare.academy.iostream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileIO {

    //Methods for import and export files

    //1. Read file, return as StringBuilder text
    public static StringBuilder readFile(Path path) {
        StringBuilder text = new StringBuilder();
        String line;
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            while ((line = reader.readLine()) != null) {
                text.append(line)
                        .append("\n");
            }
            int last = text.lastIndexOf("\n");
            if (last >= 0) {
                text.delete(last, text.length());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje @" + e);
        } catch (IOException e) {
            System.out.println("Błąd we/wy @" + e);
        }
        return text;
    }

    //2. Read specified 'n' line from file
    public static String readLine(Path path, Integer n) {
        String line = "";
        try {
            line = Files.readAllLines(path).get(n - 1);
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje @" + e);
        } catch (IOException e) {
            System.out.println("Błąd we/wy @" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Zły numer linii @" + e);
        }
        return line;
    }

    public static void writeLine(Path path, String newLine) {
        try {
            FileWriter writer = new FileWriter(path.toString(), true);
            writer.write(newLine + "\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Błąd we/wy @" + e);
        }

    }
}
