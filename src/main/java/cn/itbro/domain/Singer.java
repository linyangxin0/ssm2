package cn.itbro.domain;

import cn.itbro.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Singer {
    int id;
    String name;
    //0女 1男
    int sex;
    String sexStr;
    String nationality;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    Date birthday;
    String birthdayStr;

    public String getBirthdayStr() {
        if(birthday!=null){
            birthdayStr= DateUtils.date2String(birthday,"yyyy-MM-dd");
        }
        return birthdayStr;
    }

    public void setBirthdayStr(String birthdayStr) {
        this.birthdayStr = birthdayStr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getSexStr() {
        if (sex==0){
            sexStr="女";
        }
        if (sex==1){
            sexStr="男";
        }
        return sexStr;
    }

    public void setSexStr(String sexStr) {
        this.sexStr = sexStr;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", sexStr='" + sexStr + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
