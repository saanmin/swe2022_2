package kr.co.saanmin;

import java.util.ArrayList;

public class App {
    private ArrayList<TodoList> appTodoList;
    private String appName;

    public App(String userName){
        this.appName = userName;
        appTodoList = new ArrayList<TodoList>();
    }

    public void removeTodoList(TodoList list1){
        appTodoList.remove(list1);
    }

    public void addTodoList(TodoList list1){
        appTodoList.add(list1);
    }
    public void getTodoList(){
        for ( TodoList a : this.appTodoList){
            String b = a.getListname();
            System.out.println(b);
        }
    }

    public void viewTodoList(){
        for (TodoList a : this.appTodoList){
            int sizeOfTodoList = a.getTodoTasks().size();
            String result = String.format("- %s %d",a.getListname(),sizeOfTodoList);
            System.out.println(result);
        }
    }


}
