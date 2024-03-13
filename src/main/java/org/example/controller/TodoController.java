package org.example.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.model.TodoEntity;
import org.example.model.TodoResponse;
import org.example.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@CrossOrigin
@AllArgsConstructor
@RestController
public class TodoController {
    private final TodoService todoService;

    @PostMapping
    public ResponseEntity<TodoResponse> create(){
        System.out.println("create");
        return null;
    }

    @GetMapping("{id}")
    public ResponseEntity<TodoResponse> readOne(){
        System.out.println("read one");
        return null;
    }

    @GetMapping
    public ResponseEntity<TodoResponse> readAll(){
        System.out.println("read all");
        return null;
    }

    @PatchMapping("{id}")
    public ResponseEntity<TodoResponse>update() {
        System.out.println("update one");
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteOne() {
        System.out.println("delete one");
        return null;
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAll() {
        System.out.println("delete all");
        return null;
    }
}
