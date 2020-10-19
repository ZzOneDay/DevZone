package project.core.cdi.context;


import project.core.cdi.bean.BeanDefinitionReader;
import project.core.cdi.bean.BeanFactory;

public interface ApplicationContext extends BeanFactory, BeanDefinitionReader {

}
