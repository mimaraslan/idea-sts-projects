package com.mimaraslan.dto.request;

import io.swagger.v3.oas.models.security.SecurityScheme;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder // bir sınıftan nesne türetmeyi sağlar.
@Data //get set metodlarını otomatik tanımlar.
@NoArgsConstructor //boş constructor oluşturur.
@AllArgsConstructor //dolu constructor oluşturur.
public class PagingRequestDto {

    private Integer pageSize; // bir istekte listenecek kayıt sayısı

    private Integer currentPage;  // su andaki bulunduğun sayfa numarasi

    private String sortParameter; // hangi alana göre sıralayacağız.

    private String direction; //ASC A -> Z   0->9,  DESC  Z->A   9->0

}
