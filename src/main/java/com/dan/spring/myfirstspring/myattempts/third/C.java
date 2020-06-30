package com.dan.spring.myfirstspring.myattempts.third;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("C")
public class C implements I {
}
