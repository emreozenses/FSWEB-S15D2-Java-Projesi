package com.workintech.setchallenge;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskData {

    private Set <Task> annsTasks ;
    private Set <Task> bobsTasks ;
    private Set <Task> carolsTasks ;


    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }

    public Set<Task> getTasks(String name) {
        switch (name) {
            case "ann" -> {
                return annsTasks;
            }
            case "bob" -> {
                return bobsTasks;
            }
            case "carol" -> {
                return carolsTasks;
            }
            case "all" -> {
                return getUnion(annsTasks,bobsTasks,carolsTasks);
            }
        }

        return new HashSet<>();
    }

    public Set<Task> getUnion(Set<Task>... sets){
        Set<Task> allTasks = new LinkedHashSet<>();
        for(Set<Task> set: sets){
            allTasks.addAll(set);
        }
        return allTasks;
    }

    public Set<Task> getIntersect(Set<Task> set1,Set<Task> set2){
        Set<Task> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    public Set<Task> getDifference(Set<Task> set1,Set<Task> set2){
        Set<Task> diffrenceSet = new HashSet<>(set1);
        diffrenceSet.removeAll(set2);
        return diffrenceSet;
    }
}
