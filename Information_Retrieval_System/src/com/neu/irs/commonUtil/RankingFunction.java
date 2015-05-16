/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.irs.commonUtil;

/**
 *
 * @author tusharkale1
 */
public class RankingFunction {

    //bm25 formula
    public static Double getRank(Integer totalDocumentCount, Integer termFreqInQuery, Integer wordCountInDocument, Integer noOfDocumentsContainingWord,
            Integer totalWordsInDocument, Double averageDocumentLength) {

        Double k1 = 1.2;
        Double k2 = 100.0;
        Double b = 0.75;

        return ((Math.log((totalDocumentCount + 0.5) / (noOfDocumentsContainingWord + 0.5))) * ((wordCountInDocument + (k1 * wordCountInDocument)) / (wordCountInDocument + (k1 * ((1 - b) + (b * totalWordsInDocument / averageDocumentLength)))))
                * ((termFreqInQuery + (k2 * termFreqInQuery) / (termFreqInQuery + k2))));

    }
}
