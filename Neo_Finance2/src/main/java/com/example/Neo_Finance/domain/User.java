package com.example.Neo_Finance.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
@JsonDeserialize(as = User.class)
@JsonIgnoreProperties( ignoreUnknown = true )
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Embedded
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Datax> data;

    public User() {}
}