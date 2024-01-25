package com.example.solasido.controller;

import com.example.solasido.service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/history")
public class HistoryController {
    private final HistoryService historyService;

    @GetMapping("/weekly/{week]")
    public String getWeeklyHistory() {
        return "주간 히스토리가 반환될 예정";
    }

    @GetMapping("/monthly/{month}")
    public String getMonthlyHistory() {
        return "월간 히스토리가 반환될 예정";
    }
}
