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

  public Object getObject() {
    return object;
  }

  public void setObject(Object object) {
    this.object = object;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  interface TypeEvent {
    int ADD = 0;
    int REMOVE = 1;
    int EDIT = 2;
  }

}
