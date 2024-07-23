package com.boot.board_240718.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
//@Data
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 크기가 2에서 30 사이여야 합니다
    private long id;
    private String name;

    @ManyToMany(mappedBy = "roles")
//    Set<Student> likes;
    List<User> users;
}
