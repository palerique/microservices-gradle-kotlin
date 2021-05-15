/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package br.com.palerique.microservices.app;

import br.com.palerique.microservices.list.LinkedList;

import static br.com.palerique.microservices.utilities.StringUtils.join;
import static br.com.palerique.microservices.utilities.StringUtils.split;
import static br.com.palerique.microservices.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
