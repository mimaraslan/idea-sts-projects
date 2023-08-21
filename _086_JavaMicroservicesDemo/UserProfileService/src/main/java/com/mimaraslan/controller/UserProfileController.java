package com.mimaraslan.controller;

import com.mimaraslan.dto.request.UserProfileDoSaveRequestDto;
import com.mimaraslan.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static com.mimaraslan.constant.EndPoints.*;


//  http://localhost:9093/user
@RequiredArgsConstructor
@RestController
@RequestMapping(USER)
public class UserProfileController {

    private final UserProfileService userProfileService;

   //  http://localhost:9093/user/save
    @PostMapping(SAVE)
    public ResponseEntity<Boolean> save (UserProfileDoSaveRequestDto dto) {
         userProfileService.doSave(dto);
    }

}
