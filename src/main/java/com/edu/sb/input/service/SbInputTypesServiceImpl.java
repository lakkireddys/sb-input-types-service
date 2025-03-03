package com.edu.sb.input.service;

import org.springframework.stereotype.Service;

@Service
public class SbInputTypesServiceImpl implements SbInputTypesService {

	@Override
	public String concatMsg(String msg1, String msg2) {
		// TODO Auto-generated method stub
		return msg1.concat(" - dev tools and lombok added - "+msg2);
	}

}
