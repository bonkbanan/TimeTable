package com.example.timetable.services.classroom;

import com.example.timetable.model.Classroom;
import com.example.timetable.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ClassroomService {
    private List<Classroom> classrooms;

    @Autowired
    ClassroomRepository repository;

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
         //repository.saveAll(classrooms);

    }
    public List<Classroom> getAll(){
        return repository.findAll();
    }

    public void reNew(){
        repository.saveAll(classrooms);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public void create(Classroom classroom) {
        repository.save(classroom);
    }

    public Classroom get(String id) {
        return repository.findById(id).get();
    }

    public void update(Classroom classroom) {
        repository.save(classroom);
    }
}
