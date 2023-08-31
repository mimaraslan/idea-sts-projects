package com.mimaraslan.service;

import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import com.mimaraslan.manager.IElasticServiceManager;
import com.mimaraslan.mapper.IUserProfileMapper;
import com.mimaraslan.rabbitmq.model.SaveAuthModel;
import com.mimaraslan.repository.IUserProfileRepository;
import com.mimaraslan.repository.entity.UserProfile;
import com.mimaraslan.utility.ServiceManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager<UserProfile, Long> {

    private final IUserProfileRepository userProfileRepository;
    private final IElasticServiceManager elasticServiceManager;

    public UserProfileService(IUserProfileRepository userProfileRepository, IElasticServiceManager elasticServiceManager) {
        super(userProfileRepository);
        this.userProfileRepository = userProfileRepository;
        this.elasticServiceManager = elasticServiceManager;
    }


    public Boolean saveDto(UserProfileSaveRequestDto dto) {

        /*
        UserProfile userProfile = new UserProfile();
        userProfile.setAuthid(dto.getAuthid());
        userProfile.setUsername(dto.getUsername());
        userProfile.setEmail(dto.getEmail());
        save(userProfile);
       */

        /*
        UserProfile userProfile = UserProfile.builder()
                .authid(dto.getAuthid())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build();
        save(userProfile);
        */

        /*
        save(UserProfile.builder()
                .authid(dto.getAuthid())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build());
        */

        save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
        return true;
    }


    public void saveRabbit(SaveAuthModel model) {
        UserProfile userProfile = IUserProfileMapper.INSTANCE.toUserProfile(model);
        save(userProfile);
        elasticServiceManager.addUser(userProfile);
    }


    @Cacheable(value = "getUpperCase")
    public String getUpperCase(String firstName) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return firstName.toUpperCase();
    }


    @CacheEvict(value = "getUpperCase", allEntries = true)
    public void clearCache() {
        System.out.println("getUpperCase için oluşlturulan Cache değerleri silindi.");
    }


}
