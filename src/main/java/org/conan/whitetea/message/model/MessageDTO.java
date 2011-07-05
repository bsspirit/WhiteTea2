//Create by Conan. E-mail:bsspirit@gmail.com
package org.conan.whitetea.message.model;

import java.util.Date;
import org.conan.whitetea.base.BaseObject;

/**
 * This is Message Model DTO
 * @author Conan Zhang
 * @date 2011-06-02
 */
public class MessageDTO extends BaseObject {

private static final long serialVersionUID = 13069960027050L;

public MessageDTO(){}
public MessageDTO(String name, String email, String content, Date create_date, String ip, String mark){
this.name = name;
this.email = email;
this.content = content;
this.create_date = create_date;
this.ip = ip;
this.mark = mark;
}


private int id;
private String name;
private String email;
private String content;
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
public String getContent (){
return this.content;
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
public void setContent(String content) {
this.content = content;
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
