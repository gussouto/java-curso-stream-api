package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
//        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);
    }
}
