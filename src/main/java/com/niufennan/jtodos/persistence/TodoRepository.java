package com.niufennan.jtodos.persistence;

import com.niufennan.jtodos.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo,Integer> {
    public List<Todo> getTodoByUserId(int userId);
}
