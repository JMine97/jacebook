package com.jeongmin.jacebook.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column
    private String name;

    @Column
    private String photo;

    @Builder
    public User(String email, String password, String name, String photo){
        this.email = email;
        this.password = password;
        this.name = name;
        this.photo = photo;
    }
}
