package designpattern.behavioraldesignpatterns.observer;

public interface Subject {
	
	public void registerSubscriber(Subscribers subscribers);
	public void removeSubscriber(Subscribers subscribers);
	public void notifySubscriber();

}
