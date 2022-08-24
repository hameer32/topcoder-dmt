package com.topcoder.dmt.app.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


/**
 * @author [Hameer Singh](mailto:hameer.dhandu70@gmail.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class ToDoListModel {
    @Id
    String id;
    String name;
    String description;
    int priority;
    Date dueDate;
    boolean completed;
    Date completionDateDate;
}