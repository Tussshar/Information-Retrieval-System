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
public class Document {
    
    private static int count = 0;
    private int documentId;
    private String documentName;
    private int numberOfWords = 0;
    private String path;
       
    public Document(String name, String path){
        count++;
        documentId = count;
        documentName = name;
        this.path = path;
    }

    public String getDocumentName() {
        return documentName;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }
    
    @Override
    public String toString() {
        return documentName;
    }
    
    

}
