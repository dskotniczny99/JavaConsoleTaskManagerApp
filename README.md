# Task Manager App

Task Manager App is a simple Java console application for managing tasks. It allows users to add tasks, remove tasks, display all tasks, and save tasks to a file.

## Features

- Add a new task with title, content, and priority.
- Remove a task by choosing its index.
- Display all tasks.
- Save tasks to a file for future use.

## Usage

1. **Add Task:**
    - Choose option 1 from the menu.
    - Enter the title, content, and priority when prompted.

2. **Remove Task:**
    - Choose option 2 from the menu.
    - Select the task to remove by entering its index.

3. **Show Tasks:**
    - Choose option 3 from the menu.
    - All tasks will be displayed.

4. **Save Tasks:**
    - Choose option 4 from the menu.
    - Tasks will be saved to a file.

5. **Exit:**
    - Choose option 0 to exit the program.

## Requirements

- Java 17 or later.

## How to Run

1. Clone the repository:

   git clone https://github.com/dskotniczny99/JavaConsoleTaskManagerApp.git

# Expansion for Saving Tasks in a Database

The "JavaConsoleTaskManagerApp" application can be expanded to support saving tasks in a database, bringing several benefits such as data persistence, better organization.

## Potential Development Directions:

### 1. Database Integration

Adding a database access layer enables the permanent storage of task information. It's possible to use a relational database such as MySQL, PostgreSQL, or SQLite.

### 2. Entities and Relationships

Defining the data structure in the database by creating appropriate entities, relationships between them, and also indexes. For example, creating a `Task` table and related entities.

### 3. Implementation of DAO Layer

Creating a Data Access Object (DAO) layer to handle operations like saving, reading, updating, and deleting data from the database.

### 4. Additional Features

Enriching the application with additional features such as sorting, filtering, and searching tasks using the capabilities offered by the database.

...

