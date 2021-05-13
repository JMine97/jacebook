package com.jeongmin.jacebook.domain.post;

import com.jeongmin.jacebook.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long user_id;

    @Column
    private String content_text;

    @Column
    private String content_photo;

    @Builder
    public Post(Long user_id, String content_text, String content_photo){
        this.user_id = user_id;
        this.content_text = content_text;
        this.content_photo = content_photo;
    }

}
