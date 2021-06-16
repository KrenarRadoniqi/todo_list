package com.ictkosovo.controller;

import com.ictkosovo.model.ToDoData;
import com.ictkosovo.model.ToDoItem;
import com.ictkosovo.service.ToDoItemService;
import com.ictkosovo.util.AttributeNames;
import com.ictkosovo.util.Mappings;
import com.ictkosovo.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class ToDoController {
    private final ToDoItemService toDoItemService;

    public ToDoController(ToDoItemService toDoItemService) {
        this.toDoItemService = toDoItemService;
    }

    @ModelAttribute
    public ToDoData toDoData(){
        return toDoItemService.getData();
    }
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }
    @GetMapping(Mappings.ADD_ITEM)
    public String addItem(@RequestParam(required = false,
            defaultValue = "-1") int id, Model model){
        ToDoItem toDoItem=toDoItemService.getItem(id);
        if(toDoItem==null) {
            toDoItem = new ToDoItem("", "", LocalDate.now());
        }
        model.addAttribute(AttributeNames.TODO_ITEM,toDoItem);
        return ViewNames.ADD_ITEM;

    }
    @PostMapping(Mappings.ADD_ITEM)
    public String processItem(@ModelAttribute(AttributeNames.TODO_ITEM)
                              ToDoItem toDoItem){
        if(toDoItem.getId()==0){
            toDoItemService.addItem(toDoItem);
        }else {
            toDoItemService.updateItem(toDoItem);
        }
        return "redirect:/"+ Mappings.ITEMS;
    }
    @GetMapping(Mappings.DELETE_ITEM)
    public String deleteItem(@RequestParam int id){
      toDoItemService.removeItem(id);
      return "redirect:/" +Mappings.ITEMS;
    }
    @GetMapping(Mappings.VIEW_ITEM)
    public String viewItem(@RequestParam int id, Model model){
        ToDoItem toDoItem=toDoItemService.getItem(id);
        model.addAttribute(AttributeNames.TODO_ITEM,toDoItem);
        return ViewNames.VIEW_ITEM;
    }

}
