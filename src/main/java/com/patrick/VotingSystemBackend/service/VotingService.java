package com.patrick.VotingSystemBackend.service;

import com.patrick.VotingSystemBackend.dto.Presidents;
import com.patrick.VotingSystemBackend.repository.VotingMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotingService {
    private final VotingMapper votingMapper;

    public VotingService(VotingMapper votingMapper) {
        this.votingMapper = votingMapper;
    }

    public List<Presidents> gePresidentsList(){
        return votingMapper.getPresidents();
    }

}
