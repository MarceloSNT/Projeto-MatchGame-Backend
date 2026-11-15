package com.DevMarcelo.MatchGame.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "WEEKLY_AVAILABILITY_TB")
public class WeeklyAvailability {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private CourtModel courtModel;

    private DayOfWeek dayOfWeek;

    private LocalTime startTime;

    private LocalTime endTime;

    private int slotDurationMinutes;
}
