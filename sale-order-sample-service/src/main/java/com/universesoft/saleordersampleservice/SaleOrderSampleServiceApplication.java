package com.universesoft.saleordersampleservice;

import com.universesoft.domainmodule.domain.event.partner.CreatedPartnerEvent;
import com.universesoft.domainmodule.domain.event.product.CreatedProductEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaleOrderSampleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaleOrderSampleServiceApplication.class, args);
		CreatedProductEvent createdProductEvent = new CreatedProductEvent();
		CreatedPartnerEvent createdPartnerEvent = new CreatedPartnerEvent();
	}
}
