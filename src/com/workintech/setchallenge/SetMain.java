package com.workintech.setchallenge;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Task p1 = new Task("pr1","des","ann",Priority.LOW,Status.ASSIGNED);
        Task p2 = new Task("pr2","descr","ann",Priority.MED,Status.IN_PROGRESS);
        Task p3 = new Task("pr3","dessdgeg","ann",Priority.HIGH,Status.IN_QUEUE);

        Task p4 = new Task("pr4","des","bob",Priority.LOW,Status.ASSIGNED);
        Task p5 = new Task("pr5","descr","bob",Priority.MED,Status.IN_PROGRESS);
        Task p6 = new Task("pr6","dessdgeg","bob",Priority.HIGH,Status.IN_QUEUE);

        Task p7 = new Task("pr7","des","carol",Priority.LOW,Status.ASSIGNED);
        Task p8 = new Task("pr8","descr","carol",Priority.MED,Status.IN_PROGRESS);
        Task p9 = new Task("pr9","dessdgeg","carol",Priority.HIGH,Status.IN_QUEUE);

        Set<Task> annsTasks = new LinkedHashSet<>();
        annsTasks.add(p1);
        annsTasks.add(p2);
        annsTasks.add(p3);

        Set<Task> bobsTasks = new LinkedHashSet<>();
        bobsTasks.add(p4);
        bobsTasks.add(p5);
        bobsTasks.add(p6);

        Set<Task> carolsTasks = new LinkedHashSet<>();
        carolsTasks.add(p7);
        carolsTasks.add(p8);
        carolsTasks.add(p9);

        TaskData taskList = new TaskData(annsTasks,bobsTasks,carolsTasks);

        System.out.println("*********************************");
        System.out.println((taskList.getTasks("all").toString()));
        System.out.println((taskList.getTasks("ann").toString()));
        System.out.println((taskList.getTasks("bob").toString()));
        System.out.println((taskList.getTasks("carol").toString()));
        System.out.println((taskList.getDifference(annsTasks,bobsTasks).toString()));
        System.out.println((taskList.getIntersect(carolsTasks,annsTasks).toString()));



    }
}
