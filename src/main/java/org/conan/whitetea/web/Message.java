package org.conan.whitetea.web;

import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.ListDataProvider;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.conan.whitetea.message.model.MessageDTO;
import org.conan.whitetea.message.service.MessageService;
import org.conan.whitetea.util.MyDate;

/**
 * 
 * @author ConanZhang
 * @date 2011-6-2
 */
public class Message extends Layout {

    @SpringBean
    private MessageService messageService;

    public Message(final PageParameters parameters) {
        List<MessageDTO> list = messageService.getMessages();

        add(new DataView<MessageDTO>("messages", new ListDataProvider<MessageDTO>(list), 10) {
            private static final long serialVersionUID = 1L;

            @Override
            protected void populateItem(Item<MessageDTO> item) {
                final MessageDTO dto = (MessageDTO) item.getModelObject();
                item.add(new Label("content", dto.getContent()));
                item.add(new Label("email", dto.getEmail()));
                item.add(new Label("name", dto.getName()));
                item.add(new Label("create_date", MyDate.getDBDate(dto.getCreate_date())));
            }
        });
    }

    @Override
    protected String getTitle() {
        return "龙仙山安吉白茶|留言板";
    }
}
