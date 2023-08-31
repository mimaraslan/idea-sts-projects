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

    public void saveDto(UserProfileSaveRequestDto dto) {

        /**
         * Eğer userprofileid daha önceden kayıtlıysa, kaydetmesini engelle.
         */
      //  if(!iUserProfileRepository.existsUserProfileById(dto.getId()))
            save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
    }

}
