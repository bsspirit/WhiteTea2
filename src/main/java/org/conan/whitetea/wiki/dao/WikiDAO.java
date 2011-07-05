//Create by Conan. E-mail:bsspirit@gmail.com
package org.conan.whitetea.wiki.dao;

import java.util.List;
import java.util.Map;
import org.conan.whitetea.base.dao.MybatisDAO;
import org.conan.whitetea.base.dao.PageInObject;
import org.conan.whitetea.base.dao.PageOutObject;

import org.conan.whitetea.wiki.model.WikiDTO;

/**
 * This is Wiki DAO interface
 * @author Conan Zhang
 * @date 2011-06-02
 */
public interface WikiDAO extends MybatisDAO {

    int insertWiki(WikiDTO dto);
    int deleteWiki(int id);
    int updateWiki(WikiDTO dto);

    WikiDTO getWikiById(int id);
    List<WikiDTO> getWikis(Map<String,Object> paramMap);
    PageOutObject<WikiDTO> getWikisPaging(Map<String,Object> paramMap, PageInObject page);
    int getWikisCount(Map<String,Object> paramMap);
}

