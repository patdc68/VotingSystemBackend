package com.patrick.VotingSystemBackend.controller;

import com.patrick.VotingSystemBackend.dto.Presidents;
import com.patrick.VotingSystemBackend.service.VotingService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Transactional
public class VotingController {

    private final VotingService votingService;

    public VotingController(VotingService votingService) {
        this.votingService = votingService;
    }

    @GetMapping("/presidents")
    public List<Presidents> getPresidentsList(){
        return votingService.gePresidentsList();
    }
}
