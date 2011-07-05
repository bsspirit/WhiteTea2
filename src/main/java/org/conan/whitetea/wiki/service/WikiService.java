package org.conan.whitetea.wiki.service;

import java.util.List;

import org.conan.whitetea.wiki.model.WikiDTO;

public interface WikiService {

    List<WikiDTO> getWikis();

    WikiDTO getWikiById(int id);

}
