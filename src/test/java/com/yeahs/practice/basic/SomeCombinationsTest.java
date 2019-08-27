package com.yeahs.practice.basic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SomeCombinationsTest {
    @Test
    public void getAllLetterCombinations() {
        SomeCombinations combination = new SomeCombinations();
        combination.printList(combination.letterCombinations("23"));
        combination.printList(combination.letterCombinations("9"));
        combination.printList(combination.letterCombinations(""));
        combination.printList(combination.letterCombinations("0"));
        combination.printList(combination.letterCombinations("1"));
        combination.printList(combination.letterCombinations("11"));
        combination.printList(combination.letterCombinations("20"));
        combination.printList(combination.letterCombinations("21"));
    }

}
