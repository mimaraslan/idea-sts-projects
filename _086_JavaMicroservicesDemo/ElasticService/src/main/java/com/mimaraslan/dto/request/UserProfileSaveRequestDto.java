package com.mimaraslan.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder // bir sınıftan nesne türetmeyi sağlar.
@Data //get set metodlarını otomatik tanımlar.
@NoArgsConstructor //boş constructor oluşturur.
@AllArgsConstructor //dolu constructor oluşturur.
public class UserProfileSaveRequestDto {

    private Long id;
    private Long authid;
    private String username;
    private String email;
    private String ad;
    private String address;
    private String phone;
    private String avatar;

    private  Long createAt;
    private boolean state;

}
