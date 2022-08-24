package com.topcoder.dmt.app.todolist.service;

import com.topcoder.dmt.app.todolist.model.ToDoListDto;
import com.topcoder.dmt.app.todolist.model.ToDoListModel;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author <a href="mailto:hameer.dhandu70@gmail.com">Hameer Singh</a>
 */
public interface ToDoListService {
    Flux<ToDoListModel> getToDoList(String id);

    Flux<ToDoListModel> getToDoList();

    Mono<ToDoListModel> createToDoList(ToDoListDto toDoListDto);

    Mono<ToDoListModel> updateToDoList(String id, ToDoListDto toDoListDto);

    Mono<Void> deleteToDoList(String id);
}
