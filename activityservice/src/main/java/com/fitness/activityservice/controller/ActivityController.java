package com.fitness.activityservice.controller;

import com.fitness.activityservice.dto.ActivityResponse;
import com.fitness.activityservice.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fitness.activityservice.dto.ActivityRequest;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {
    @Autowired
    private ActivityService activityService;
    @PostMapping
    public ResponseEntity<ActivityResponse> trackActivity(@RequestBody ActivityRequest request) {
        return ResponseEntity.ok(activityService.trackActivity(request));
    }
    @GetMapping("/{id}")
    public ResponseEntity<List<ActivityResponse>> getUserActivities(@PathVariable String id) {
        return ResponseEntity.ok(activityService.getUserActivities(id));
    }
}
