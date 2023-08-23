package com.mimaraslan.manager;


import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import static com.mimaraslan.constant.EndPoints.SAVE;


public interface IUserProfileManager {

    @PostMapping(SAVE)
    ResponseEntity<Boolean> save(@RequestBody UserProfileSaveRequestDto dto);
}
