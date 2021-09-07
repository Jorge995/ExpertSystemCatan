package soc.game;

import net.sf.clipsrules.jni.*;
import soc.client.*;

public class SOCAgent {
	
	private static final String fileName = "Agente.clp";
	private static Environment clips;
	private static int playerNumber;
	
	public SOCAgent () {
		clips = new Environment();
	}
	
	public String getFileName() {
		return this.fileName;
	}
	
	public Environment getEnvironment() {
		return this.clips;
	}
	
	public int getPlayerNumber() {
		return this.playerNumber;
	}
	
	public void setPlayerNumber(int number) {
		this.playerNumber = number;
	}
	

}
