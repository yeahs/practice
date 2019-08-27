package com.yeahs.practice.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SomeCombinations {
    /**
     * author: yeahs
     * description: Given an integer array containing digits from [0, 9], the task is to print all possible letter
     * combinations that the numbers could represent.
     * @param digits: 获取到的数字
     * @return: 返回组合好的列表
     */
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;
        result.add("");
        //字符放在数组对应的位置上，下标即对应数字
        String[] lettersArr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //遍历输入的数字
        for (char digit : digits.toCharArray()) {
            String letters = lettersArr[digit - '0'];
            result = combine(letters, result);
        }
        return result;
    }
    // 根据字母进行组合
    private List<String> combine(String letters, List<String> list){
        List<String> result = new ArrayList<>();
        for (String str : list) {
            for (char letter : letters.toCharArray()) {
                result.add(str + letter);
            }
        }
        return result;
    }

    /**
     * author: yeahs
     * description: 打印列表里的元素
     * @param list: 要打印的列表
     */
    public void printList(List<String> list){
        Iterator<String> strIterator = list.iterator();
        while (strIterator.hasNext()) {
            String str = strIterator.next();
            System.out.print(str);
            System.out.print("  ");
        }
        System.out.println();
    }
}
