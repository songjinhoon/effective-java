package com.example.effectivejava.chapter01.item05.sample2;

import com.example.effectivejava.chapter01.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellChecker2Test {

    @Test
    void isValid() {
        /* 목킹 테스트도 편리해짐 */
        SpellChecker2 spellChecker2 = new SpellChecker2(new DefaultDictionary());
    }

}