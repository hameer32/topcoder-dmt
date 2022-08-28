package com.topcoder.dmt.app.todolist.service;

import com.topcoder.dmt.app.todolist.model.ToDoListDto;
import com.topcoder.dmt.app.todolist.model.ToDoListModel;
import org.mapstruct.Mapper;

/**
 * @author <a href="mailto:hameer.dhandu70@gmail.com">Hameer Singh</a>
 */

@Mapper
public interface ToDoListMapper {
    ToDoListDto entityToDto(ToDoListModel model);

    ToDoListModel dtoToEntity(ToDoListDto model);
}
