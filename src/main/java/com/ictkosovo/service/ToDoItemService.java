package com.ictkosovo.service;

import com.ictkosovo.model.ToDoData;
import com.ictkosovo.model.ToDoItem;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
public class ToDoItemService implements IToDoItemService{
    @Getter
    private ToDoData data=new ToDoData();

    @Override
    public void addItem(ToDoItem item) {
        data.addItem(item);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public ToDoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(ToDoItem updateItem) {
        data.updateItem(updateItem);
    }


}
