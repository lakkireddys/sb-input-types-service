package com.edu.sb.input.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties("custom")
@Data
public class ApplicationConfig {
	private String place;
	private String state;
	/*
	 * public String getPlace() { return place; } public void setPlace(String place)
	 * { this.place = place; } public String getState() { return state; } public
	 * void setState(String state) { this.state = state; } public
	 * ApplicationConfig(String place, String state) { this.place = place;
	 * this.state = state; }
	 */
	

}
