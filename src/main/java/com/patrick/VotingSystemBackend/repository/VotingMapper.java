package com.patrick.VotingSystemBackend.repository;

import com.patrick.VotingSystemBackend.dto.Presidents;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface VotingMapper {

    List<Presidents> getPresidents();

}
