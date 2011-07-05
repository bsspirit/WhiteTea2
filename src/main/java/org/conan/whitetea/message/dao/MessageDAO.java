//Create by Conan. E-mail:bsspirit@gmail.com
package org.conan.whitetea.message.dao;

import java.util.List;
import java.util.Map;
import org.conan.whitetea.base.dao.MybatisDAO;
import org.conan.whitetea.base.dao.PageInObject;
import org.conan.whitetea.base.dao.PageOutObject;

import org.conan.whitetea.message.model.MessageDTO;

/**
 * This is Message DAO interface
 * @author Conan Zhang
 * @date 2011-06-02
 */
public interface MessageDAO extends MybatisDAO {

    int insertMessage(MessageDTO dto);
    int deleteMessage(int id);
    int updateMessage(MessageDTO dto);

    MessageDTO getMessageById(int id);
    List<MessageDTO> getMessages(Map<String,Object> paramMap);
    PageOutObject<MessageDTO> getMessagesPaging(Map<String,Object> paramMap, PageInObject page);
    int getMessagesCount(Map<String,Object> paramMap);
}

