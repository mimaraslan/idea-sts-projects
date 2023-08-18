package com.mimaraslan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Tüm controller sınıfları için merkezi bir şekilde hata yönetimi sağlayan anotasyondur.
 */

@ControllerAdvice
public class GlobalExceptionHandler {


  private ErrorMessage createErrorMesaj(ErrorType eerrorType, Exception exception){
      System.out.println("Hata oluştu...."+exception.getMessage());
       return ErrorMessage.builder()
                .code(eerrorType.getCode())
                .message(eerrorType.getMessage())
                .build();
    }


    /**
     * ExceptionHandler: Uygulama içinde oluşacak hatanın türünü verdiğimiz şekilde yakalanmasını sağlar.
     * ResponseBody: Dönüş tipimizin formatının Json olmasını sağlar.
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<String> handleException(Exception e){
        //log tutabilirsin, db'e kayıt işlemleri...

        return ResponseEntity.badRequest().body("Uygulamada bad request gerçekleşti..."+e.getMessage());
    }

    @ExceptionHandler(AuthServiceException.class)
    @ResponseBody
    public ResponseEntity<ErrorMessage> handleSatisException(AuthServiceException e){
        ErrorType errorType=e.getType();
        HttpStatus httpStatus=errorType.getStatus();
        return new ResponseEntity<ErrorMessage>(createErrorMesaj(errorType,e),httpStatus);
    }




}
