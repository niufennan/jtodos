package com.niufennan.jtodos.service;

import com.niufennan.jtodos.models.Todo;

import java.util.List;

public interface TodoService {
    void  save(Todo todo);
    List<Todo> getTodoByUserId(int userId);
    List<Todo> getTodoByDefaultGroup(int userId,int year,int month);
    List<Todo> getTodoByCalendarTodoList(int userId,int groupId,int year,int month,int day);

}
