package proxy.dynamic;

/**
 * @description: 目标对象
 * @author: XP
 * @create: 2019/11/29
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("Teacher teaching!");
    }
}
