package com.patrick.VotingSystemBackend.controller;

import com.patrick.VotingSystemBackend.dto.Presidents;
import com.patrick.VotingSystemBackend.dto.Registration;
import com.patrick.VotingSystemBackend.dto.Senators;
import com.patrick.VotingSystemBackend.dto.UserVote;
import com.patrick.VotingSystemBackend.service.VotingService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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

    @GetMapping("/senators")
    public List<Senators> geSenatorsList(){
        return votingService.geSenatorsList();
    }

    @PostMapping("/registerUser")
    public void registerUser(@RequestBody Registration registration){
        votingService.registerUser(registration);
    }

    @PostMapping("/castVote")
    public void castVote(@RequestBody UserVote userVote){
        votingService.castVote(userVote);
    }

}
