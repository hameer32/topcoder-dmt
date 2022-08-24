package com.topcoder.dmt.app.todolist.model

import java.util.*

/**
 * @author [Hameer Singh](mailto:hameer.dhandu70@gmail.com)
 */
data class ToDoListDto (
    var name: String,
    var description: String?,
    var priority: Int,
    var dueDate: Date,
    var completed: Boolean,
    var completionDateDate: Date?
)