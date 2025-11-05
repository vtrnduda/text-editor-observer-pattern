package br.edu.ifpb.padroes;

import java.io.File;

public interface EventListener {

    void update(String eventType, File file);

}
