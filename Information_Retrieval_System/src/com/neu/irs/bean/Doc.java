/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.irs.bean;

/**
 *
 * @author tusharkale1
 */
public class Doc {
    
    private static int count = 1;

    private int id;
    private String name;
    private int wordCount;
    private int documentWordCount = 0;

    public Doc() {
        id = count++;
        name = "";
        wordCount = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public int getDocumentWordCount() {
        return documentWordCount;
    }

    public void setDocumentWordCount(int documentWordCount) {
        this.documentWordCount = documentWordCount;
    }

    

}
