package it.unibo.radarSystem22.main;

public interface Sonar {
	 public void activate();
	  public void deactivate();
	  public Distance getDistance();
	  public boolean isActive();
}
