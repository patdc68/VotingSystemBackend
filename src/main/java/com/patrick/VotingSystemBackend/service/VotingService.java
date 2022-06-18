package com.patrick.VotingSystemBackend.service;

import com.patrick.VotingSystemBackend.dto.Presidents;
import com.patrick.VotingSystemBackend.dto.Registration;
import com.patrick.VotingSystemBackend.dto.Senators;
import com.patrick.VotingSystemBackend.dto.UserVote;
import com.patrick.VotingSystemBackend.repository.RegistrationMapper;
import com.patrick.VotingSystemBackend.repository.VotingMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotingService {
    private final VotingMapper votingMapper;
    private final RegistrationMapper registrationMapper;

    public VotingService(VotingMapper votingMapper, RegistrationMapper registrationMapper) {
        this.votingMapper = votingMapper;
        this.registrationMapper = registrationMapper;
    }

    public List<Presidents> gePresidentsList(){
        return votingMapper.getPresidents();
    }

    public List<Senators> geSenatorsList(){
        return votingMapper.getSenatorsList();
    }

    public void registerUser(Registration registration){
        registrationMapper.registerUser(registration);
    }

    public void castVote(UserVote userVote){
        votingMapper.castVote(userVote);
    }

}
