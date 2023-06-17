package com.example.demo.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
@NoArgsConstructor
@Data
@Getter
@Setter
@AllArgsConstructor
@Table (name = "users")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column (name = "ROLE")
    private String roles;

}
