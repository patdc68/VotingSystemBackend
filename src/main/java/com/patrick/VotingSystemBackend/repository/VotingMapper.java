package com.patrick.VotingSystemBackend.repository;

import com.patrick.VotingSystemBackend.dto.Presidents;
import com.patrick.VotingSystemBackend.dto.Senators;
import com.patrick.VotingSystemBackend.dto.UserVote;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
@Mapper
public interface VotingMapper {

    List<Presidents> getPresidents();

    List<Senators> getSenatorsList();

    void castVote(@RequestBody UserVote userVote);

}
