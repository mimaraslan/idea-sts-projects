package com.mimaraslan.service;

import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import com.mimaraslan.repository.IUserProfileRepository;
import com.mimaraslan.repository.entity.UserProfile;
import com.mimaraslan.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager <UserProfile, Long> {

    private final IUserProfileRepository repository;

    public UserProfileService(IUserProfileRepository repository) {
        super(repository);
        this.repository = repository;
    }


    public Boolean saveDto(UserProfileSaveRequestDto dto) {
        return  true;
    }
}
