package com.example.effectivejava.chapter01.item05.sample2;

import com.example.effectivejava.chapter01.item05.IDictionary;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SpellChecker2 {

    private final IDictionary dictionary;

    public boolean isValid() {
        // spellChecker code
        this.dictionary.isValid();
        return true;
    }

}
