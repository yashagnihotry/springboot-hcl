package com.digital.hcl.word.service;

import com.digital.hcl.word.model.Word;
import com.digital.hcl.word.repo.WordRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Service
public class WordService {

    private final WordRepository wordRepository;

    public WordService(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    public List<String> findWords(String characters) {
        return wordRepository.findAll()
                .stream()
                .map(Word::getWord)
                .filter(word -> isContainedIn(word, characters))
                .collect(Collectors.toList());
    }

    private boolean isContainedIn(String word, String character) {
    	String characters = character.replaceAll("^characters=", "");
        for (char c : word.toCharArray()) {
            if (characters.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

}
