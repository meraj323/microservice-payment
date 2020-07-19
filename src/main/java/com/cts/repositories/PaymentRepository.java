/**
 * 
 */
package com.cts.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.cts.domains.Payment;

/**
 * @author HP
 *
 */
public interface PaymentRepository extends MongoRepository<Payment, String>{

}
