package com.lust.eurke;

import java.util.List;

/**
 * Created by Administrator on 2016/11/19.
 */
public interface StudentMapper {

    List<Student> likeName(String name);

    Student getById(int id);

    String getNameById(int id);

}
