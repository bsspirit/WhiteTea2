//Create by Conan. E-mail:bsspirit@gmail.com
package org.conan.whitetea.wiki.model;

import java.util.Date;
import org.conan.whitetea.base.BaseObject;

/**
 * This is Wiki Model DTO
 * @author Conan Zhang
 * @date 2011-06-02
 */
public class WikiDTO extends BaseObject {

private static final long serialVersionUID = 13070048279610L;

public WikiDTO(){}
public WikiDTO(String name, String email, String title, String content, String image, String repost, Date create_date, String ip, String mark){
this.name = name;
this.email = email;
this.title = title;
this.content = content;
this.image = image;
this.repost = repost;
this.create_date = create_date;
this.ip = ip;
this.mark = mark;
}


private int id;
private String name;
private String email;
private String title;
private String content;
private String image;
private String repost;
private Date create_date;
private String ip;
private String mark;

public int getId() {
return this.id;
}

public String getName (){
return this.name;
}
public String getEmail (){
return this.email;
}
public String getTitle (){
return this.title;
}
public String getContent (){
return this.content;
}
public String getImage (){
return this.image;
}
public String getRepost (){
return this.repost;
}
public Date getCreate_date (){
return this.create_date;
}
public String getIp (){
return this.ip;
}
public String getMark (){
return this.mark;
}


public void setId(int id) {
this.id = id;
}

public void setName(String name) {
this.name = name;
}
public void setEmail(String email) {
this.email = email;
}
public void setTitle(String title) {
this.title = title;
}
public void setContent(String content) {
this.content = content;
}
public void setImage(String image) {
this.image = image;
}
public void setRepost(String repost) {
this.repost = repost;
}
public void setCreate_date(Date create_date) {
this.create_date = create_date;
}
public void setIp(String ip) {
this.ip = ip;
}
public void setMark(String mark) {
this.mark = mark;
}


}
