package com.mimaraslan.repository.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Builder // bir sınıftan nesne türetmeyi sağlar.
@Data //get set metodlarını otomatik tanımlar.
@NoArgsConstructor //boş constructor oluşturur.
@AllArgsConstructor //dolu constructor oluşturur.
@ToString
@Document(indexName = "tbl_user_profile")
public class UserProfile {

    @Id
    private Long id;

    private Long userProfileId;
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
