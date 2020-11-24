package tech.technote.delmore.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tuser")
public class TUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "t_username", nullable = false, unique = true)
    private String username;

    @Column
    private String password;
}
