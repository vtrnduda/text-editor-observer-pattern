package br.edu.ifpb.padroes;

public enum EventType {
    OPEN("open"),
    SAVE("save");
    
    private final String value;
    
    EventType(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}

