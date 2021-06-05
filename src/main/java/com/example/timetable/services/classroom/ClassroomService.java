package com.example.timetable.services.classroom;

import com.example.timetable.model.Classroom;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClassroomService {
    private List<Classroom> classrooms;

    @PostConstruct
    void init(){
         classrooms = new ArrayList<>(
                Arrays.asList(
                        new Classroom("1", "SportZall", 200),
                        new Classroom("2", "Kabinet Shiziki", 32),
                        new Classroom("3", "Labaratory", 50),
                        new Classroom("4", "Dvor", 9999),
                        new Classroom("5", "TUALET", 3),
                        new Classroom("6", "Mmelogy", 666)
                )
        );
    }
    public List<Classroom> getAll(){
        return classrooms;
    }

    private List<Classroom> classrooms2=classrooms;

    public List<Classroom> reNew(){
        return classrooms2;
    }

    public void delete(String id) {
        classrooms = classrooms.stream().filter(room->!room.getId().equals(id))
                .collect(Collectors.toList());
    }
}
