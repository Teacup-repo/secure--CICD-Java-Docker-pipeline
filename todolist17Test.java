import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the TodoList class.
 */
public class todolist17Test {
    private TodoList todoList;

    @BeforeEach
    void setUp() {
        todoList = new TodoList();
    }

    @Test
    void testAddTask_Success() {
        assertTrue(todoList.addTask("Buy groceries"));
        assertEquals(1, todoList.getTasks().size());
        assertEquals("Buy groceries", todoList.getTasks().get(0));
    }

    @Test
    void testAddTask_Fail_EmptyString() {
        assertFalse(todoList.addTask(""));
        assertFalse(todoList.addTask("   "));
        assertEquals(0, todoList.getTasks().size());
    }

    @Test
    void testAddTask_Fail_Null() {
        assertFalse(todoList.addTask(null));
        assertEquals(0, todoList.getTasks().size());
    }

    @Test
    void testRemoveTask_Success() {
        todoList.addTask("Task 1");
        assertTrue(todoList.removeTask(0));
        assertEquals(0, todoList.getTasks().size());
    }

    @Test
    void testRemoveTask_Fail_InvalidIndex() {
        todoList.addTask("Task 1");
        assertFalse(todoList.removeTask(5));
        assertFalse(todoList.removeTask(-1));
        assertEquals(1, todoList.getTasks().size());
    }

    @Test
    void testGetTasks() {
        todoList.addTask("Task 1");
        todoList.addTask("Task 2");
        List<String> tasks = todoList.getTasks();
        assertEquals(2, tasks.size());
        assertEquals("Task 1", tasks.get(0));
        assertEquals("Task 2", tasks.get(1));
    }
}

