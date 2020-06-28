package com.dan.spring.myfirstspring.mixingscopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/*
  * This is where the scope mixing begins.
  * An additional parameter for @Scope can be used to determine whether or not we want to use this class as a proxy.
  * What this does is, create a new instance of the class every time even if the dependant class is a singleton.
  * So this could be really useful when the user wants to make multiple queries to the database, we can allow them
  * to use a new connection for every query.
 */

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {
    public JdbcConnection() {
        System.out.println("JDBC");
    }
}
