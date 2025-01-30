package br.com.cod3r.exercicios.singleton.ioC;

import br.com.cod3r.exercicios.singleton.bean.AbstractBean;
import br.com.cod3r.singleton.connectionPool.after.conn.ConnectionPool;

import java.util.ArrayList;
import java.util.List;

public class IocSingleton {

    private static IocSingleton instance = new IocSingleton();
    private final static int MAX_NUMBERS_OF_INSTANCES = 3;
    private List<AbstractBean> connectionsPool;

    public static IocSingleton getInstance() {
        return instance;
    }

    private IocSingleton() {
        System.out.println("Creating IOC Singleton instance");
        connectionsPool = new ArrayList<AbstractBean>();
    }

    public AbstractBean addBean(AbstractBean bean) {
        if (connectionsPool.size() != MAX_NUMBERS_OF_INSTANCES) {
            connectionsPool.add(bean);
        } else {
            System.out.println("Exceeded maximum number of instances");
            return null;
        }
        return bean;
    }

    public void printConnectionsPool() {
        for (AbstractBean bean : connectionsPool) {
            System.out.println(bean.getName());
        }
    }
}
