package org.conan.whitetea.wiki.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.conan.whitetea.base.dao.PageInObject;
import org.conan.whitetea.wiki.dao.WikiDAO;
import org.conan.whitetea.wiki.model.WikiDTO;
import org.conan.whitetea.wiki.service.WikiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author ConanZhang
 * @date 2011-6-2
 */
@Service(value = "wikiService")
public class WikiServiceImpl implements WikiService {

    @Autowired
    private WikiDAO wikiDAO;

    @Override
    public List<WikiDTO> getWikis() {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("page", new PageInObject(0, 40, "id", "desc"));
        return wikiDAO.getWikis(paramMap);
    }

    @Override
    public WikiDTO getWikiById(int id) {
        return wikiDAO.getWikiById(id);
    }

}
