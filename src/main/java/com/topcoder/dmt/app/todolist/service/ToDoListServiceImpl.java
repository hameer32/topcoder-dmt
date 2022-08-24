package com.topcoder.dmt.app.todolist.service;

import com.topcoder.dmt.app.todolist.model.ToDoListDto;
import com.topcoder.dmt.app.todolist.model.ToDoListModel;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author <a href="mailto:hameer.dhandu70@gmail.com">Hameer Singh</a>
 */
@Service
public class ToDoListServiceImpl implements ToDoListService{
    @Override
    public Flux<ToDoListModel> getToDoList(String id) {
        return null;
    }

    @Override
    public Flux<ToDoListModel> getToDoList() {
        return null;
    }

    @Override
    public Mono<ToDoListModel> createToDoList(ToDoListDto toDoListDto) {
        return null;
    }

    @Override
    public Mono<ToDoListModel> updateToDoList(String id, ToDoListDto toDoListDto) {
        return null;
    }

    @Override
    public Mono<Void> deleteToDoList(String id) {
        return null;
    }
}
