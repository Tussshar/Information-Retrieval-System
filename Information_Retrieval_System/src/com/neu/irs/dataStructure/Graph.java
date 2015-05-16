/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.irs.dataStructure;

import java.util.ArrayList;

/**
 *
 * @author tusharkale1
 */
public class Graph {

    private int size;
    private ArrayList<Node> vertices;

    public Graph() {
        size = 0;
        vertices = new ArrayList<>();
    }

    public class Node {

        public String value;
        public ArrayList<Node> nextVertices;
        public ArrayList<Integer> documentIdList;

        public Node(String value) {
            this.value = value;
            nextVertices = new ArrayList<>();
            documentIdList = new ArrayList<>();
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public ArrayList<Node> getNextVertices() {
            return nextVertices;
        }

        public ArrayList<Integer> getDocumentIdList() {
            return documentIdList;
        }
    }

    public Node addVertex(String data, int documentId) {

        Node node = null;

        try {
            node = new Node(data);
            node.getDocumentIdList().add(documentId);
            vertices.add(node);
            size++;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return node;
        }
    }

    public void addEdge(Node fromVertex, Node toVertex) {

        try {
            fromVertex.nextVertices.add(toVertex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
