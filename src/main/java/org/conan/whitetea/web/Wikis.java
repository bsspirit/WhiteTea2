package org.conan.whitetea.web;

import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.ListDataProvider;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.conan.whitetea.util.MyDate;
import org.conan.whitetea.wiki.model.WikiDTO;
import org.conan.whitetea.wiki.service.WikiService;

/**
 * 
 * @author ConanZhang
 * @date 2011-6-2
 */
public class Wikis extends Layout {

    @SpringBean
    private WikiService wikiService;

    public Wikis(final PageParameters parameters) {
        List<WikiDTO> list = wikiService.getWikis();

        add(new DataView<WikiDTO>("wikis", new ListDataProvider<WikiDTO>(list), 40) {
            private static final long serialVersionUID = 1L;

            @Override
            protected void populateItem(Item<WikiDTO> item) {
                final WikiDTO dto = (WikiDTO) item.getModelObject();
                item.add(new Label("create_date", MyDate.dayString2(dto.getCreate_date())));

                PageParameters params = new PageParameters();
                params.put("id", dto.getId());

                BookmarkablePageLink<WebPage> link = new BookmarkablePageLink<WebPage>("link_wiki", WikiContent.class, params);
                String repost = dto.getRepost() != null ? "[转]" : "";
                link.add(new Label("title", repost + dto.getTitle()));
                item.add(link);
            }
        });
    }

    @Override
    protected String getTitle() {
        return "龙仙山安吉白茶|白茶知识";
    }
}
