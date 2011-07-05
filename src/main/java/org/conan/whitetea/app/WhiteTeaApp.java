package org.conan.whitetea.app;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.conan.whitetea.web.Consult;
import org.conan.whitetea.web.Drink;
import org.conan.whitetea.web.Index;
import org.conan.whitetea.web.Message;
import org.conan.whitetea.web.Photo;
import org.conan.whitetea.web.WikiContent;
import org.conan.whitetea.web.Wikis;

/**
 * @author ConanZhang
 * @date 2011-6-2
 */
public class WhiteTeaApp extends WebApplication {

    public WhiteTeaApp() {
    }

    @Override
    public void init() {
        getMarkupSettings().setDefaultMarkupEncoding("utf-8");
        addComponentInstantiationListener(new SpringComponentInjector(this));

        mountBookmarkablePage("/consult", Consult.class);
        mountBookmarkablePage("/photo", Photo.class);
        mountBookmarkablePage("/message", Message.class);
        mountBookmarkablePage("/drink", Drink.class);
        mountBookmarkablePage("/wikis", Wikis.class);
        mountBookmarkablePage("/wiki", WikiContent.class);
    }

    public Class<Index> getHomePage() {
        return Index.class;
    }

}
