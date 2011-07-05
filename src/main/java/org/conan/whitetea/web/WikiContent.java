package org.conan.whitetea.web;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.conan.whitetea.util.MyDate;
import org.conan.whitetea.util.StaticImage;
import org.conan.whitetea.wiki.model.WikiDTO;
import org.conan.whitetea.wiki.service.WikiService;

/**
 * 
 * @author ConanZhang
 * @date 2011-6-2
 */
public class WikiContent extends Layout {

    @SpringBean
    private WikiService wikiService;
    private String title;

    public WikiContent(final PageParameters params) {
        int wikid = params.getAsInteger("id");
        WikiDTO dto = wikiService.getWikiById(wikid);

        

        add(new Label("wiki_title", dto.getTitle()));
        add(new Label("wiki_info", "作者:" + dto.getName() + "  邮箱:" + dto.getEmail() + "  点击20次"));
        if (dto.getRepost() != null) {
            add(new ExternalLink("wiki_repost", dto.getRepost(), "原文地址:" + dto.getRepost()));
        } else {
            add(new ExternalLink("wiki_repost", dto.getRepost()));
        }

        add(new StaticImage("wiki_image", dto.getImage()));
        Label content = new Label("wiki_content", dto.getContent());
        content.setEscapeModelStrings(false);
        add(content);

        add(new Label("create_date", MyDate.dayString2(dto.getCreate_date())));

        PageParameters prev_param = new PageParameters();
        prev_param.put("id", wikid - 1);

        PageParameters next_param = new PageParameters();
        next_param.put("id", wikid + 1);

        BookmarkablePageLink<WebPage> prev = new BookmarkablePageLink<WebPage>("link_prev", WikiContent.class, prev_param);
        BookmarkablePageLink<WebPage> next = new BookmarkablePageLink<WebPage>("link_next", WikiContent.class, next_param);
        add(prev);
        add(next);

        WikiDTO prevDTO = wikiService.getWikiById(wikid - 1);
        if (prevDTO != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("上一篇: ");
            if (prevDTO.getRepost() != null) {
                sb.append("［转］");
            }
            sb.append(prevDTO.getTitle());
            prev.add(new Label("prev_title", sb.toString()));
        } else {
            prev.add(new Label("prev_title", ""));
        }

        WikiDTO nextDTO = wikiService.getWikiById(wikid + 1);
        if (nextDTO != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("下一篇: ");
            if (nextDTO.getRepost() != null) {
                sb.append("［转］");
            }
            sb.append(nextDTO.getTitle());
            next.add(new Label("next_title", sb.toString()));
        } else {
            next.add(new Label("next_title", ""));
        }

    }

    @Override
    protected String getTitle() {
        return title;
    }
}
