package com.hjj.springdemo.exception;

import com.hjj.springdemo.result.ErrorResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: SpringBootDemo
 * @description: 异常处理类,我们只需要在类上加上@ControllerAdvice注解这个类就成为了全局异常处理类，当然你也可以通过 assignableTypes 指定特定的 Controller 类，让异常处理类只处理特定类抛出的异常。
 * @author: hjj
 * @create: 2020-10-18 15:49
 **/
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    // 也可以将 BaseException 换为 RuntimeException
    // 因为 RuntimeException 是 BaseException 的父类
    @ExceptionHandler(BaseException.class)
    public ResponseEntity<?> handleAppException(BaseException ex, HttpServletRequest request){
        ErrorResponse response = new ErrorResponse(ex,request.getRequestURI());
        return new ResponseEntity<>(response,new HttpHeaders(),ex.getError().getStatus());
    }

    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex, HttpServletRequest request){
        ErrorResponse response = new ErrorResponse(ex,request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler(value = RequestValidationFailedException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(RequestValidationFailedException ex, HttpServletRequest request){
        ErrorResponse response = new ErrorResponse(ex,request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
}
