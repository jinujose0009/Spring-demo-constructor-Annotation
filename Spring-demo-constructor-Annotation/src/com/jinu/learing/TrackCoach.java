package com.jinu.learing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    FortuneService fortuneservice;
    
	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "Practive daily 30 min";
	}

	@Override
	public String getDailyForunes() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortunes();
	}
    @Autowired
	public TrackCoach(FortuneService fortuneservice) {
		super();
		this.fortuneservice = fortuneservice;
	}

}
