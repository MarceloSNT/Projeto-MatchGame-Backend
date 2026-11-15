package com.DevMarcelo.MatchGame.model;

import com.DevMarcelo.MatchGame.model.enums.AvailabilityHour;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "HOURS_SCHEDULE_TB")
public class HoursSchedule {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private CourtModel courtModel;

    private LocalDate date;

    private LocalTime startTime;

    private AvailabilityHour availabilityHour;
    @ManyToOne
    private WeeklyAvailability weeklyAvailability;
}
