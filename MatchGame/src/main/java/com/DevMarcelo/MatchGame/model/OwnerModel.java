package com.DevMarcelo.MatchGame.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USER_OWNER_TB")
public class OwnerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    private String name;
    private String cnpj;
    private String email;
    private String password;
    private String state;
    private String city;
    private String neighborhood;
}
