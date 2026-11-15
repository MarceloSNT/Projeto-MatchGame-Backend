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
@Table(name = "USER_PLAYER_TB")
public class PlayerModel {
    @Id@GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;
    private String cpf;
    private int age;
    private String name;
    private String email;
    private String password;
    private String state;
    private String city;
    private String neighborhood;
}
