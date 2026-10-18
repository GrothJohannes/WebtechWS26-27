package de.htwberlin.webtech.WebtechWS26_27;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class TaskController {

    @GetMapping(path = "/tasks")
    public ResponseEntity<List<Task>> getTasks() {
        List<Task> tasks = List.of(
                new Task(1L, "Webtech M1", "Spring App mit GET-Route pushen", LocalDate.of(2026, 10, 18), false),
                new Task(2L, "Einkaufen", "Milch, Brot, Eier", LocalDate.of(2026, 10, 20), false),
                new Task(3L, "Sport", "30 Minuten joggen", LocalDate.of(2026, 10, 19), true)
        );
        return ResponseEntity.ok(tasks);
    }
}
