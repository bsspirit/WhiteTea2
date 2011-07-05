package org.conan.whitetea.message.service;

import java.util.List;

import org.conan.whitetea.message.model.MessageDTO;

public interface MessageService {
    
    List<MessageDTO> getMessages();

}
