package com.mimaraslan.rabbitmq.consumer;


import com.mimaraslan.rabbitmq.model.SaveAuthModel;
import com.mimaraslan.repository.entity.UserProfile;
import com.mimaraslan.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserConsumer {

    private final UserProfileService userProfileService;

    @RabbitListener(queues = "queue-auth")
    public void createFromQueue(SaveAuthModel model){
        userProfileService.save(
                UserProfile.builder()
                        .authid(model.getAuthid())
                        .username(model.getUsername())
                        .email(model.getEmail())
                        .build()
        );
    }

}
