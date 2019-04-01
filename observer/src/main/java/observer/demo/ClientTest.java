package observer.demo;

/**
 * @author cuishifeng
 * @Title: ClientTest
 * @ProjectName observer.demo
 * @date 2018-11-10
 */
public class ClientTest {

    public static void main(String[] args) {

        Subject subject = new Strudent();

        Observer teacher = new TeacherObserver("老师");
        Observer classDeans = new ClassDeansObserver("年级主任 ");
        Observer schoolMaster = new SchoolMasterObserver("校长");

        subject.addObserver(teacher);
        subject.addObserver(classDeans);
        subject.addObserver(schoolMaster);

        subject.notify("获得编程大赛第一名");
    }
}
