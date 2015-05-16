/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.irs.dataStructure;

import java.util.HashMap;

/**
 *
 * @author tusharkale1
 */
public class InvertedIndex {
    
    private HashMap<String, Graph.Node> indexTable;
    
    public InvertedIndex(){
        indexTable = new HashMap<>();
    }

    public HashMap<String, Graph.Node> getIndexTable() {
        return indexTable;
    }

    public void setIndexTable(HashMap<String, Graph.Node> indexTable) {
        this.indexTable = indexTable;
    }
}
