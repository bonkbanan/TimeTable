package com.example.timetable.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomForm {
    private String id;
    private String name;
    private Integer capacity;

}
