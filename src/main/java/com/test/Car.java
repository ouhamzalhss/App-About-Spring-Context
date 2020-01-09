package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicule{

	@Autowired
	@Qualifier("tyre")
	private Tyre tyre;
	
	
    public Tyre getTyre() {
		return tyre;
	}


	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}


	public void drive(){
        System.out.println("Car driving.."+ tyre);
    }
}
