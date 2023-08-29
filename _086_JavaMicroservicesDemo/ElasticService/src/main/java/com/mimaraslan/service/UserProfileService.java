package com.mimaraslan.service;

import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import com.mimaraslan.mapper.IUserProfileMapper;
import com.mimaraslan.repository.IUserProfileRepository;
import com.mimaraslan.repository.entity.UserProfile;
import com.mimaraslan.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager <UserProfile, Long> {

    private final IUserProfileRepository iUserProfileRepository;

    public UserProfileService(IUserProfileRepository iUserProfileRepository) {
        super(iUserProfileRepository);
        this.iUserProfileRepository = iUserProfileRepository;
    }


    public Boolean saveDto(UserProfileSaveRequestDto dto) {

        if(!iUserProfileRepository.existsUserProfilesById(dto.getId())) {
            save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
            return  true;
        }
        return  false;

    }



}
