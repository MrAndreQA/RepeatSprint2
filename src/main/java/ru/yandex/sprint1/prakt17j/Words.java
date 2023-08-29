package ru.yandex.sprint1.prakt17j;

public class Words {
    private String[] words;

    public Words(String[] words) {
        this.words = words;
    }

    int getShortestWordLength1() {
        int shortestLength = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < shortestLength) {
                shortestLength = words[i].length();
            }
        }
        return shortestLength;
    }


    int getShortestWordLength() {
        int shortestLength = words.length > 0 ? words[0].length() : Integer.MAX_VALUE;
        for (String word : words) {
           if (word.length() < shortestLength){
               shortestLength = word.length();
           }
        }
        return shortestLength;
    }

}
