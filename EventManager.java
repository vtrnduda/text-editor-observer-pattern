package br.edu.ifpb.padroes;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(EventType... operations) {
        for (EventType operation : operations) {
            this.listeners.put(operation.getValue(), new ArrayList<>());
        }
    }

    public void subscribe(EventType eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType.getValue());
        users.add(listener);
    }

    public void unsubscribe(EventType eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType.getValue());
        users.remove(listener);
    }

    public void notify(EventType eventType, File file) {
        List<EventListener> users = listeners.get(eventType.getValue());
        for (EventListener listener : users) {
            listener.update(eventType.getValue(), file);
        }
    }
}
