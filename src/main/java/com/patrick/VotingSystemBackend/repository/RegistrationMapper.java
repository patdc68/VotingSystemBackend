package com.patrick.VotingSystemBackend.repository;


import com.patrick.VotingSystemBackend.dto.Registration;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
@Mapper
public interface RegistrationMapper {

    void registerUser(@RequestBody Registration registration);
}
