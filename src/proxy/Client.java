package proxy;

/**
 * @description: 动态代理测试客户端
 * @author: XP
 * @create: 2019/11/29
 */
public class Client {

    public static void main(String[] args) {
        ITeacherDao td = new TeacherDao();
        TeacherProxyFactory proxy = new TeacherProxyFactory(td);
        ITeacherDao proxyInstance = (ITeacherDao) proxy.getTeacherProxyInstance();
        proxyInstance.teach();

    }
}
