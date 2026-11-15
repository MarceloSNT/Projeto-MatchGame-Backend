package com.DevMarcelo.MatchGame.model;

import com.DevMarcelo.MatchGame.model.enums.CourtType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "COURT_TB")
public class CourtModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal price;
    private String state;
    private String city;
    private String neighborhood;
    private CourtType type;
    @ManyToOne
    private OwnerModel ownerModel;
}
