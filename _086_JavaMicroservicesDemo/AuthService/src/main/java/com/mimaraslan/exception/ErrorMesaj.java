package com.mimaraslan.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ErrorMesaj {
     Integer code;
     String mesaj;
     HttpStatus status;

}
