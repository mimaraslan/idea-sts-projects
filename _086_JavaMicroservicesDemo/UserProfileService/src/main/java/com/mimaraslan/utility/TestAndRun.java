package com.mimaraslan.utility;

import com.mimaraslan.manager.IElasticServiceManager;
import com.mimaraslan.repository.entity.UserProfile;
import com.mimaraslan.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class TestAndRun {

    private final UserProfileService userProfileService;

    private final IElasticServiceManager elasticServiceManager;

    // Bu kısım eğer kullanılacak ise kullanıldıktan sonra bu kısımı yorum satırına almak mantıklı olacaktır.
    @PostConstruct
    //Constructor metod çalıştıktan sonra çalışması istenen kodlar bu anotaation ile işaretlenmiş metodun içine yazılır.
    public void init() { //initialize (başlatma)

        new Thread(() -> {
            getUserProfileInfo();
        }).start();

        // new Thread(this::getUserProfileInfo).start();

    }

    private void getUserProfileInfo() {

        List<UserProfile> userProfileList = userProfileService.findAll(); // tüm userprofile datalarını bir liste aktardık.

        userProfileList.forEach(elasticServiceManager::addUser); // Eski verileri Postgre’den Elastic’e teker teker aktarma
        
/*
        userProfileList.forEach(x->{
                      elasticServiceManager.addUser(x);
                  });
        */

    }
}
