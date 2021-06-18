package com.knowledge.java8;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        Task task1 = new Task("Read Version Control with Git book", "Title1", "READING", LocalDate.of(2015, Month.JULY,1)).addTag("git").addTag("reading").addTag("books");

        Task task2 = new Task("Read Java 8 Lambdas book", "Title2", "READING", LocalDate.of(2015, Month.JULY, 2)).addTag("java8").addTag("reading").addTag("books");

        Task task3 = new Task("Write a mobile application to store my tasks", "Title3", "CODING", LocalDate.of(2015, Month.JULY, 3)).addTag("coding").addTag("mobile");

        Task task4 = new Task("Write a blog on Java 8 Streams", "Title4", "WRITING", LocalDate.of(2015, Month.JULY, 4)).addTag("blogging").addTag("writing").addTag("streams");

        Task task5 = new Task("Read Domain Driven Design book", "Title5", "READING", LocalDate.of(2015, Month.JULY, 5)).addTag("ddd").addTag("books").addTag("reading");

        List<Task> tasks = Arrays.asList(task1, task2, task3, task4, task5);


        long count = tasks.stream().filter(task -> task.getId().startsWith("Read")).count();

        long bCount = tasks.stream().filter(task -> task.getId() != "Write a blog on Java 8 Streams").count();

        System.out.println("Count is - "+ count);
        System.out.println("bCount is - "+ bCount);

        System.out.println(tasks.parallelStream().findFirst());

        List readingTasks = tasks.stream()
                .filter(task -> task.getType() == "READING")
                .sorted(Comparator.comparing(Task::getCreatedOn))
                .map(Task::getTitle)
                .collect(Collectors.toList());

        System.out.println(readingTasks);


        List top2ReadingTasks = tasks.stream()
                .filter(task -> task.getType() == "READING")
                .sorted(Comparator.comparing(Task::getCreatedOn))
                .map(Task::getTitle)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(top2ReadingTasks);

        System.out.println(tasks.stream().filter(task -> task.getType() == "READING").count());

        System.out.println("tags = "+tasks.stream().flatMap( task -> task.getTags().stream()).distinct().collect(Collectors.toList()));

    }

}
class Task {
    private final String id;
    private final String title;
    private final String type;
    private final LocalDate createdOn;
    private boolean done = false;
    private Set tags = new HashSet();
    private LocalDate dueOn;

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", createdOn=" + createdOn +
                ", done=" + done +
                ", tags=" + tags +
                ", dueOn=" + dueOn +
                '}';
    }

    public Task(String id, String title, String type, LocalDate createdOn) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.createdOn = createdOn;
        return;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Set getTags() {
        return tags;
    }

    public void setTag(Set tags) {
        this.tags = tags;
    }
    public Task addTag(String tag){
        tags.add(tag);
        return this;
    }

    public LocalDate getDueOn() {
        return dueOn;
    }

    public void setDueOn(LocalDate dueOn) {
        this.dueOn = dueOn;
    }
}
