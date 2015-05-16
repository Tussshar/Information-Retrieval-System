/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.irs.dataStructure;

/**
 *
 * @author Vineet
 */
public class HashTable {

    public String[] index;

    public HashTable(int size) {
        index = new String[size * 2];
    }

    public void insert(String word) {
        index[universalHash(word)] = word;
        
    }

    private int hashCode(String word) {

        int hashcode = word.hashCode() % index.length;
        if (hashcode < 0) {
            hashcode = hashcode * -1;
        }
        return hashcode;

    }

    private int universalHash(String word) {

        int hashcode = 0;
        int i = 0;

        while (true) {
            hashcode = (hashCode(word) + i) % index.length;
            i++;

            if (index[hashcode] == null) {
                break;
            }

        }

        return hashcode;

    }

}
