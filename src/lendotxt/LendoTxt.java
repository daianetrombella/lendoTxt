/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lendotxt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Daiane
 */
public class LendoTxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        List<String> palavras = Files.readAllLines(Paths.get("src/br-sem-acentos.txt"));
        //palavras.stream().filter(s -> s.equals(new StringBuilder().reverse().toString()).forEach(System.out::println);
        palavras.stream()
                .filter(s -> s.length() > 5)
                .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
                .forEach(System.out::println);
        //String s = "arara";
        //System.out.println(s.equals(new StringBuilder(s).reverse().toString()));
    }
    
}
