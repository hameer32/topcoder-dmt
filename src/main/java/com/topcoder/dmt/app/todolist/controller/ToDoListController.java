package com.topcoder.dmt.app.todolist.controller;

import com.topcoder.dmt.app.todolist.model.ToDoListDto;
import com.topcoder.dmt.app.todolist.model.ToDoListModel;
import com.topcoder.dmt.app.todolist.service.ToDoListService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author <a href="mailto:hameer.dhandu70@gmail.com">Hameer Singh</a>
 */
@RestController
@RequestMapping("/")
public class ToDoListController {
    ToDoListService service;

    @GetMapping("todo")
    Flux<ToDoListModel> getTodo() {
        return service.getToDoList();
    }

    @GetMapping("todo/{id}")
    Mono<ToDoListModel> getTodo(@PathVariable("id") String id) {
        return service.getToDoList(id);
    }

    @PostMapping("todo")
    Mono<ToDoListModel> createToDoList(@RequestBody ToDoListDto toDoListDto) {
        return service.createToDoList(toDoListDto);
    }

    @PutMapping("todo/{id}")
    Mono<ToDoListModel> createToDoList(@PathVariable("id") String id, @RequestBody ToDoListDto toDoListDto) {
        return service.updateToDoList(id, toDoListDto);
    }

    @DeleteMapping("todo/{id}")
    Mono<Void> deleteToDoList(@PathVariable("id") String id) {
        return service.deleteToDoList(id);
    }
}
