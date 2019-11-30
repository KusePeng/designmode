package proxy.cglib;

/**
 * @description: Cglib动态代理测试客户端
 * @author: XP
 * @create: 2019/11/30
 */
public class Client {

    public static void main(String[] args) {

        TeacherDao td = new TeacherDao();
        TeacherDao proxyInstance = (TeacherDao) new TeacherProxyFactory(td).getProxyInstance();
        proxyInstance.teach();
    }
}
