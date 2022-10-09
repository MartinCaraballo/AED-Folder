/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6_pd3.ibmjavacollectionsexcercises;

import java.util.List;
import javax.swing.MutableComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Martin
 */
public class AbstractListModel implements MutableComboBoxModel {
    
    List list;
    
    public AbstractListModel(List unaLista) {
        list = unaLista;
    }

    @Override
    public void addElement(Object item) {
        list.add(item);
    }

    @Override
    public void removeElement(Object obj) {
        list.remove(obj);
    }

    @Override
    public void insertElementAt(Object item, int index) {
        list.set(index, item);
    }

    @Override
    public void removeElementAt(int index) {
        list.remove(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getSelectedItem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Object getElementAt(int index) {
        return list.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void printElements() {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    
}
