package proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @description: 代理工厂
 * @author: XP
 * @create: 2019/11/29
 */
public class TeacherProxyFactory {
    //目标对象
    private Object target;

    public TeacherProxyFactory(Object target) {
        this.target = target;
    }

    public Object getTeacherProxyInstance() {
        ClassLoader loader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, interfaces, (proxy, method, args) -> {
            System.out.println("proxy begin!");
            Object result = method.invoke(target, args);
            System.out.println("proxy end!");
            return result;
        });
    }
}
