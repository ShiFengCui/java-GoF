package handler.demo2;

/**
 * @author cuishifeng
 * @date 2018-12-11
 */
public abstract class AbstractHandler {


    protected AbstractHandler handler;


    public void setHandler(AbstractHandler handler) {
        this.handler = handler;
    }

    public abstract void chainRequest(String request);


    static class Student extends AbstractHandler {

        @Override
        public void chainRequest(String request) {
            System.out.println("学生收到请求 : " + request);
            this.handler.chainRequest(request);
        }
    }

    static class Teacher extends AbstractHandler {

        @Override
        public void chainRequest(String request) {
            System.out.println("老师收到请求 : " + request);
            this.handler.chainRequest(request);
        }
    }

    static class SchoolMaster extends AbstractHandler {

        @Override
        public void chainRequest(String request) {
            System.out.println("校长收到请求 : " + request);
//            this.handler.chainRequest(request);
        }
    }


    public static void main(String[] args) {

        AbstractHandler student, teacher, schoolmaster;

        student = new Student();
        teacher = new Teacher();
        schoolmaster = new SchoolMaster();

        student.setHandler(teacher);
        teacher.setHandler(schoolmaster);

        student.chainRequest("完成试卷");


    }

}
