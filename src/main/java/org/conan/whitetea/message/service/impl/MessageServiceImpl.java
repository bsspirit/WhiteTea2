package org.conan.whitetea.message.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.conan.whitetea.base.dao.PageInObject;
import org.conan.whitetea.message.dao.MessageDAO;
import org.conan.whitetea.message.model.MessageDTO;
import org.conan.whitetea.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "messageService")
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDAO messageDAO;

    public List<MessageDTO> getMessages() {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("page", new PageInObject(0, 40, "id", "desc"));
        return messageDAO.getMessages(paramMap);
    }

}
