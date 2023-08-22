package com.mimaraslan.repository.entity;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Builder // bir sınıftan nesne türetmeyi sağlar.
@Data //get set metodlarını otomatik tanımlar.
@NoArgsConstructor //boş constructor oluşturur.
@AllArgsConstructor //dolu constructor oluşturur.
@ToString
@Entity
@Table(name = "tbl_user_profile")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

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
