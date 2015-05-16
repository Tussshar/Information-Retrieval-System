/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.irs.admin;

/**
 *
 * @author tusharkale1
 */
public class Admin {
 
    public enum credentials{
        userName("tushar"),
        password("kale");
        
        private String value;
        
        private credentials(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
