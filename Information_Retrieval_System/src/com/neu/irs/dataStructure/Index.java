/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.irs.dataStructure;

import com.neu.irs.bean.Doc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Vineet
 */
public final class Index {

    public HashMap<String, HashMap<Integer, Integer>> table;
    private static ArrayList<Doc> documentList = new ArrayList<>();

    public Index() {
        table = new HashMap<>();
    }

    public String getRandomString() {
        
        Random random = new Random();
        Object[] values = table.keySet().toArray();
        String randomWord = (String) values[random.nextInt(values.length)];
        return randomWord;
        
    }

}
