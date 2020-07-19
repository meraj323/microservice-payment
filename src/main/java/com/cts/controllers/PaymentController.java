/**
 * 
 */
package com.cts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;


import com.cts.repositories.PaymentRepository;
import com.google.gson.Gson;

/**
 * @author HP
 *
 */
@RestController
public class PaymentController {
	
	/**
	 * @RequestBody: 
	 * 
	 * @ResponseBody: 
	 * 
	 * @RequestMapping:
	 * 
	 * Serialization and Deserialization of Data Transfer Object!!
	 * 
	 */
	/*
	* @ResponseBody // Spring will bind the return value to outgoing HTTP response body and 
	* serialize the Java Object state to HttpResponse Body!!
	* 
	// @RequestBody: @RequestBody Maps or bind the Http Request Body to a transfer object(DTO) or Domain Object.
	// and enabling automatic deserialization of the inbound HttpRequest body into Java Object.
	*/
	
	@Autowired
	PaymentRepository paymentRepository;
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	 
	@Autowired
	private Gson gson;

}
