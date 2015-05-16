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
public class FileData {
    
    private static int count = 0;
    private int documentId;
    private String documentName;
    
    public FileData(String name){
        count++;
        documentId = count;
        documentName = name;
    }
}
