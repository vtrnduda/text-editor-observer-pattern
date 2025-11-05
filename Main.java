package br.edu.ifpb.padroes;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.subscribe(EventType.OPEN, new LogListener("/path/to/log/file.txt"));
        editor.subscribe(EventType.SAVE, new EmailNotificationListener("admin@example.com"));
        editor.subscribe(EventType.SAVE, new SmsNotificationListener("+55 83 9999-9999"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}