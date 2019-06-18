package com.jinu.learing;

import org.springframework.stereotype.Component;

@Component
public class FortunceIMp implements FortuneService {

	@Override
	public String getFortunes() {
		// TODO Auto-generated method stub
		return "Today is your lucky day";
	}

}
