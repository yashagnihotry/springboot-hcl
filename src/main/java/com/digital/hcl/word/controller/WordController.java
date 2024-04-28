package com.digital.hcl.word.controller;

import com.digital.hcl.word.service.WordService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordController {

    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @PostMapping("/find-words")
    public List<String> findWords(@RequestBody String characters) {
        return wordService.findWords(characters);
    }
}
