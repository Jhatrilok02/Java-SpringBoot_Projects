package com.lpu.algo;

import org.springframework.stereotype.Component;


@Component
public class NoEffectEncoder implements MyPasswordEncoder {
	@Override
	public String encode( String pass)
	{
		return pass;
	}
    @Override
    public boolean match(String encoded, String pass)
	{
		return encoded.equals(pass);
	}
}
