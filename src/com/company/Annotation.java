package com.company;

import com.company.annotationspack.MyAnnotation;

import java.lang.reflect.Field;

public class Annotation {

    public void getClassMethods(Object object){
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(int i = 0; i<fields.length; i++){
            System.out.println(fields[i].getName());
        }

    }public void getAnnotations(Object object){
        Class clazz = object.getClass();
        Field [] fields = clazz.getDeclaredFields();
        for(int i =0; i< fields.length; i++){
            java.lang.annotation.Annotation annotation = fields[i].getAnnotation(MyAnnotation.class);
            if(annotation==null){
                continue;
            }fields[i].setAccessible(true);
        }

    }
}
