package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*
        *  Here using the dynamic polymorphism i can change the the behavior of call and data overriden methods
        *  That is done by changing the object that is assign to the refence sim (make it one of its children)
        * But, I don't want to make any change in the source code i want to make the changes in a configuration file rather than changing the source code
        * Don't toch the source code the aplication should be configurable
        * That is why i will use my friend Spring!
        * I will make a bean named Sim in my context and set to it any of its children classes
        */
//       Sim sim = new Airtel();
//       sim.call();
//       sim.data();

        /***************************************************************/

        /*
         * What is Spring IOC:
         * Spring IOC means that the framework will create the instances of the classes that i want for me to let me focus on the business logic
         * and will mange them too
         * and store these instances in a Container called IOC container and and the instances saved in the container called beans
         * There are two types of the IOC container
         * 1. Bean Factory
         * 2. Application Context
         * The context IOC container has more features than the Bean Factory container
         * Bean factory and the Application context is just an interfaces
         *So, we need some implemented classes to use these interfaces
         * For the application context there is an implementation class called ClassPathXmlApplicationContext
         */

        ApplicationContext context = new ClassPathXmlApplicationContext("configFile.xml");

        Sim sim = (Sim) context.getBean("sim");
        sim.call();
        sim.data();
    }
}