package com.Management.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountHolder {
    @Id
    int id;
    String name;
    int  AccountNumber;
    long Account_Amount;

}
