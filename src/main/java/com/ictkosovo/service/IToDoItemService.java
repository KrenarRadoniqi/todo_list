package com.ictkosovo.service;

import com.ictkosovo.model.ToDoData;
import com.ictkosovo.model.ToDoItem;

public interface IToDoItemService {
    void addItem(ToDoItem item);
    void removeItem(int id);
    ToDoItem getItem(int id);
    void updateItem(ToDoItem updateItem);
    ToDoData getData();
}
