package com.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PolicyCartRequest {
	
	private Integer policyId;
		private Double premium;
	
}
