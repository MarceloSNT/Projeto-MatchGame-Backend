package com.DevMarcelo.MatchGame.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "GAME_TB")
public class GameModel {
    @Id@GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    private String name;

    private int maxOfPlayers;
    @ManyToMany
    private List<PlayerModel> players;
    @OneToOne
    private HoursSchedule schedule;
}
