package com.spring.collectiontype;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author hang.yuan
 * @Date 2022/9/19 16:52
 * @Description
 * @Ref
 */
public class Stu {

    private String[] courses;

    private List<String> list;

    private Map<String, String> map;

    private Set<String> set;

    private List<Course> sourseList;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setSourseList(List<Course> sourseList) {
        this.sourseList = sourseList;
    }

    public void test() {
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
        System.out.println(sourseList);
    }
}
