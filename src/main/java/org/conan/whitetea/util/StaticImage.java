package org.conan.whitetea.util;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.WebComponent;
import org.apache.wicket.model.Model;

/**
 * 
 * @author ConanZhang
 * @date 2011-6-2
 */
public class StaticImage extends WebComponent {

    private static final long serialVersionUID = 1L;

    public StaticImage(String id, String url) {
        super(id, new Model<String>(url));
    }

    protected void onComponentTag(ComponentTag tag) {
        super.onComponentTag(tag);
        checkComponentTag(tag, "img");
        tag.put("src", getDefaultModelObjectAsString());
    }

}
