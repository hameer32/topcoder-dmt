package com.topcoder.dmt.app.todolist.service;

import com.topcoder.dmt.app.todolist.model.ToDoListDto;
import com.topcoder.dmt.app.todolist.model.ToDoListModel;
import com.topcoder.dmt.app.todolist.repo.ToDoListRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author <a href="mailto:hameer.dhandu70@gmail.com">Hameer Singh</a>
 */
@Service
public class ToDoListServiceImpl implements ToDoListService {
    private final ToDoListRepository repository;
    private final ToDoListMapper mapper;

    public ToDoListServiceImpl(ToDoListRepository repository, ToDoListMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Mono<ToDoListModel> getToDoList(String id) {
        return repository.findById(id);
    }

    @Override
    public Flux<ToDoListModel> getToDoList() {
        return repository.findAll();
    }

    @Override
    public Mono<ToDoListModel> createToDoList(ToDoListDto toDoListDto) {
        return repository.save(mapper.dtoToEntity(toDoListDto));
    }

    @Override
    public Mono<ToDoListModel> updateToDoList(String id, ToDoListDto toDoListDto) {
        return repository.findById(id)
                .flatMap(model -> {
                    ToDoListModel listModel = mapper.dtoToEntity(toDoListDto);
                    return Mono.just(listModel).map(model1 -> {
                        model1.setId(model.getId());
                        return model1;
                    });
                })
                .flatMap(repository::save);
    }

    @Override
    public Mono<Void> deleteToDoList(String id) {
        return repository.deleteById(id);
    }
}
