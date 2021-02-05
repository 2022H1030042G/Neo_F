package com.example.Neo_Finance.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Embeddable
@JsonDeserialize(as = Datax.class)
@JsonIgnoreProperties( ignoreUnknown = true )
@Entity
public class Datax {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Embedded
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Accounts> accounts;

    private String address;
    private int credit_score;
    private String email;
    private String mobile;
    private String name;
    private String pan;
    private int total_number_of_accounts;

    public Datax() {}

}