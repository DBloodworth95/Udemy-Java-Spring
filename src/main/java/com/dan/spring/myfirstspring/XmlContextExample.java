package com.dan.spring.myfirstspring;

import com.dan.spring.myfirstspring.xmlexample.XmlOtherPerson;
import com.dan.spring.myfirstspring.xmlexample.XmlPerson;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configurable
@ComponentScan
public class XmlContextExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        XmlPerson xmlPerson = classPathXmlApplicationContext.getBean(XmlPerson.class);
        XmlOtherPerson xmlOtherPerson = classPathXmlApplicationContext.getBean(XmlOtherPerson.class);
        System.out.println(xmlPerson);
        System.out.println(xmlPerson.getXMLJdbcConnection());
        System.out.println(xmlOtherPerson);
        System.out.println(xmlOtherPerson.getXmlJdbcConnection());
    }
}
