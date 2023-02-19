package com.example.Project9.entity;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
@Entity
public class User extends TimeEntity {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(unique = true, length = 45)
    private String username;

    @NotNull
    private String password;

    @Column(unique = true, length = 45)
    private String email;


    @Builder
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;

    }

}