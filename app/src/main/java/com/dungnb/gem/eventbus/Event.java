package com.dungnb.gem.eventbus;

public class Event {

  Object object;
  int type;

  public Event(int type) {
  }

  public Event(Object object, int type) {
    this.object = object;
    this.type = type;
  }

  public static class TypeEvent {
    public static int ADD = 0;
    public static int REMOVE = 1;
    public static int EDIT = 2;
  }

}
