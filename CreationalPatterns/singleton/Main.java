package br.com.cod3r.exercicios.singleton;

import br.com.cod3r.exercicios.singleton.bean.AbstractBean;
import br.com.cod3r.exercicios.singleton.bean.BeanController;
import br.com.cod3r.exercicios.singleton.bean.BeanRepository;
import br.com.cod3r.exercicios.singleton.bean.BeanService;
import br.com.cod3r.exercicios.singleton.ioC.IocSingleton;

public class Main {
    public static void main(String[] args) {
        IocSingleton singleton = IocSingleton.getInstance();
        AbstractBean abstractBean = new BeanService();
        singleton.addBean(abstractBean);


        AbstractBean abstractBean2 = new BeanRepository();
        IocSingleton singleton2 = IocSingleton.getInstance();
        singleton2.addBean(abstractBean2);


        AbstractBean abstractBean3 = new BeanController();
        IocSingleton singleton3 = IocSingleton.getInstance();
        singleton3.addBean(abstractBean3);

        AbstractBean abstractBean4 = new BeanController();
        IocSingleton singleton4 = IocSingleton.getInstance();
        singleton3.addBean(abstractBean3);


        AbstractBean abstractBean5 = new BeanController();
        IocSingleton singleton5 = IocSingleton.getInstance();
        singleton3.addBean(abstractBean5);

        singleton.printConnectionsPool();


    }
}
