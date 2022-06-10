package com.example.MobileService.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true)
@Entity
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "first_name", nullable = false, length = 120)
    private String firstName;

    @Basic
    @Column(name = "middle_name", length = 120)
    private String middleName;

    @Basic
    @Column(name = "last_name", length = 120)
    private String lastName;

    @Basic
    @Column(name = "email", length = 254)
    private String email;

    @Basic
    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;
    
}
