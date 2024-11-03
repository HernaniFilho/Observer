import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Publisher
public class EventManager {
    public Map<String, EventListener> listeners;

    EventManager() {
        listeners = new HashMap<String, EventListener>();
    }

    public void subscribe(String eventType, EventListener listener) {
        listeners.put(eventType, listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        listeners.remove(eventType, listener);
    }

    public void notifier(String eventType) {
        EventListener listener = listeners.get(eventType);
        listener.update();
    }
}
