package com.fitness.activityservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;
import org.springframework.data.mongodb.core.mapping.Document;
import tools.jackson.databind.ext.javatime.deser.key.LocalDateKeyDeserializer;

import java.time.LocalDateTime;
import java.util.Map;

@Document(collation = "activites")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
// is mircoservice ki gpt chat dekhna hai agr annotations ka meaninh bhul gya future me agr
public class Activity {
    private String id;
    private String userId;
    private ActivityType type;
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private Map<String, Object> additionalMetrics;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
