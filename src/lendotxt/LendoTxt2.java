/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lendotxt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Daiane
 */
public class LendoTxt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        List<String> palavras = Files.readAllLines(Paths.get("src/br-sem-acentos.txt"));
        Predicate<String> p1 = p -> p.startsWith("a");
        Predicate<String> p2 = p -> p.length() < 5;
        
        palavras.stream()
                //.filter(p1)
                //.filter(p2)
                
                //.max(Comparator.comparingInt(String::length))
                //.ifPresent(System.out::println);
        
                //.forEach(System.out::println());
                .collect(Collectors.groupingBy(s -> s.substring(0,1)))
                .forEach((k, y) -> System.out.println(k + " -> " + y));
    
           
    }   
}