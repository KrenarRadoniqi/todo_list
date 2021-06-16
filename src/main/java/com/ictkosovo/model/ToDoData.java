package com.ictkosovo.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ToDoData {
    private static int idValue=1;
    private List<ToDoItem> items =new ArrayList<>();

    public List<ToDoItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public ToDoData() {
        addItem(new ToDoItem("first","first details",
                LocalDate.now()));
        addItem(new ToDoItem("second","second details",
                LocalDate.now()));
        addItem(new ToDoItem("three","third details",
                LocalDate.now()));
        addItem(new ToDoItem("four","fourth details",
                LocalDate.now()));
        addItem(new ToDoItem("five","fifth details",
                LocalDate.now()));
    }

    public void addItem(@NonNull ToDoItem item){
/*        if(item==null){
            throw new NullPointerException();
        }*/
        item.setId(idValue);
        items.add(item);
        idValue++;

    }
    public void removeItem(int id){
        ListIterator<ToDoItem> iterator=items.listIterator();
        while(iterator.hasNext()){
            ToDoItem item=iterator.next();
            if(item.getId()==id){
                iterator.remove();
                break;
            }
        }
    }
    public ToDoItem getItem(int id){
        for(ToDoItem item: items){
            if(item.getId()==id){
                return item;
            }
        }
        return null;
    }
    public void updateItem(@NonNull ToDoItem updateItem){
        ListIterator<ToDoItem> iterator
                =items.listIterator();
        while(iterator.hasNext()){
            ToDoItem item=iterator.next();
            if(item.equals(updateItem)){
                iterator.set(updateItem);
                break;
            }
        }
    }
}
