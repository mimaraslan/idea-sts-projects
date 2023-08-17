package com.mimaraslan.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

//Kaydederken kullanıcıdan alınacak bilgileri içeren DTO
@Builder // bir sınıftan nesne türetmeyi sağlar.
@Data //get set metodlarını otomatik tanımlar.
@NoArgsConstructor //boş constructor oluşturur.
@AllArgsConstructor //dolu constructor oluşturur.
public class RegisterRequestDto {

  @NotBlank(message = "Kullanici adi bos gecilemez.")
  private   String username;

//  @Email(message = "Email giriniz")
  private   String email;

  // TODO password Regex yap
  private   String password;
  private   String repassword;

}
