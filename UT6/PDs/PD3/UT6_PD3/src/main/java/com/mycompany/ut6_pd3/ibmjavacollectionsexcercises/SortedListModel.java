/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6_pd3.ibmjavacollectionsexcercises;

import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.AbstractListModel;

/**
 *
 * @author Martin
 */
public class SortedListModel extends AbstractListModel {

    SortedSet sortedSet;
    
    public SortedListModel() {
        sortedSet = new TreeSet();
    }
    
    @Override
    public int getSize() {
        return sortedSet.size();
    }

    @Override
    public Object getElementAt(int index) {
        return sortedSet.toArray()[index];
    }
    
    public void add(Object element) {
        sortedSet.add(element);
    }
    
    public void addAll(Collection<Object> elements) {
        sortedSet.addAll(elements);
    }
    
    public void clear() {
        sortedSet.clear();
    }
    
    public boolean contains(Object element) {
        return sortedSet.contains(element);
    }
    
    public Object firstElement() {
        return sortedSet.first();
    }
    
    public Iterator iterator() {
        return sortedSet.iterator();
    }
    
    public Object lastElement() {
        return sortedSet.last();
    }
    
    public boolean remove(Object element) {
        return sortedSet.remove(element);
    }
    
    public void printAction() {
        sortedSet.forEach((object) -> System.out.println(object));
    }
    
}
