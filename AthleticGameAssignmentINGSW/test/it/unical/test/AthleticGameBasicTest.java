package it.unical.test;
import org.junit.Assert;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {
	
	private static AthleticGame athleticGame = new AthleticGame("calcio");
	
	@Test
	public void addArrivalWork(){
		Assert.assertEquals(1, athleticGame.getArrivals().size());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void invalidPartecipantWork(){
		athleticGame.getParecipiantTime("NucciaOliveri");
	}
	
	

}
