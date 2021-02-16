package com.example.Neo_Finance.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;

@Data
@AllArgsConstructor
@Embeddable
@JsonIgnoreProperties( ignoreUnknown = true )
@JsonDeserialize(as = Accounts.class)
@Entity
public class Accounts {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String sanction_amount;
    private String lender;
    private String current_balance;
    private String date_opened;
    private String type;
    private String account_no;
    private String amount_overdue;
    private String date_reported;

    public Accounts() {}

}
