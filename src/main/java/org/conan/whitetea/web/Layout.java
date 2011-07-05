package org.conan.whitetea.web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.ExternalLink;

public abstract class Layout extends WebPage {

    final static String TAOBAO_URL = "http://bsspirit.taobao.com/?search=y&scid=353645133&scname=sLK8qrDXsug%3D&checkedRange=true&queryType=cat";

    public Layout() {
        add(new Label("title", getTitle()));
        add(new BookmarkablePageLink<WebPage>("link_logo", Index.class));
        add(new BookmarkablePageLink<WebPage>("link_index", Index.class));
        add(new BookmarkablePageLink<WebPage>("link_drink", Drink.class));
        add(new BookmarkablePageLink<WebPage>("link_photo", Photo.class));
        add(new BookmarkablePageLink<WebPage>("link_consult", Consult.class));
        add(new BookmarkablePageLink<WebPage>("link_message", Message.class));
        add(new BookmarkablePageLink<WebPage>("link_wiki", Wikis.class));

        add(new ExternalLink("link_product", TAOBAO_URL));

    }

    protected abstract String getTitle();

}
