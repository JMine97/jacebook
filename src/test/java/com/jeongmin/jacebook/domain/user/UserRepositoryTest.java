package com.jeongmin.jacebook.domain.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class) //JUnit Spring과 함께 실행
@SpringBootTest //springboot 통합 테스트
public class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    @DisplayName("회원등록")
    void 회원_등록(){
        repository.save(User.builder()
                .email("aa@aa.com")
                .password("aa")
                .name("aa")
                .photo("aa").build());

        List<User> userList = repository.findAll();
        User user = userList.get(0);

        assertThat(user.getEmail()).isEqualTo("aa@aa.com");
    }
}
