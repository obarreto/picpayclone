package br.com.dio.picpayclone.exceptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestControllerAdviceException {
	
	@Autowired
	private MessageSource messageSource;
}
