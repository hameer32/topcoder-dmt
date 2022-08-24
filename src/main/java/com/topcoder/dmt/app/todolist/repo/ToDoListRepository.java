package com.topcoder.dmt.app.todolist.repo;

import com.topcoder.dmt.app.todolist.model.ToDoListModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author <a href="mailto:hameer.dhandu70@gmail.com">Hameer Singh</a>
 */
public interface ToDoListRepository extends ReactiveMongoRepository<ToDoListModel, String> {
}
