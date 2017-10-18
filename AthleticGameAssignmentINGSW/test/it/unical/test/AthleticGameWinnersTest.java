package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {
	
	private static AthleticGame athleticGame;
	
	@BeforeClass
	public static void init(){
		System.out.println("Before class");
		athleticGame = new AthleticGame("calcio");
	}
	
	@After
	public void resetWork(){
		athleticGame.reset();
	}

	@Before
	public void startWork(){
		athleticGame.start();
	}
	
	@Test
	public void getWinnerWork(){
		
		athleticGame.addArrival("Nuccia", Instant.now().plusMillis(1000));
		athleticGame.addArrival("Burzi", Instant.now().plusMillis(2000));
		athleticGame.addArrival("Tonino", Instant.now().plusMillis(3000));
		
		String winner = athleticGame.getWinner();
		
		Assert.assertEquals("Nuccia", winner);
			
	}
	
	
	
}
