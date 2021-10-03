package client;

import pieces.WorldLanguages;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        WorldLanguages lang = new WorldLanguages();
        System.out.println("Successfully added French: " + lang.addLanguage("French"));
        System.out.println("Successfully added French: " + lang.addLanguage("French"));
    }

}
