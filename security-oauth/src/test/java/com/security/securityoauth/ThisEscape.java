package com.security.securityoauth;

public class ThisEscape {

    public ThisEscape(EventSource source) {
        source.registerListener(new EventListener() {
            @Override
            public void onEvent(Event event) {
                doSome();
            }
        });
    }

    private void doSome(){
        System.out.println("ThisEscape doSome");
    }

    interface EventListener{
        void onEvent(Event event);
    }
    interface Event{

    }
    interface EventSource{
        void registerListener(EventListener listener);
    }

    public static void main(String[] args) {
        new ThisEscape(new EventSource() {
            @Override
            public void registerListener(EventListener listener) {
                listener.onEvent(new Event() {
                });
                System.out.println("EventSource registerListener");
            }
        });
    }
}
