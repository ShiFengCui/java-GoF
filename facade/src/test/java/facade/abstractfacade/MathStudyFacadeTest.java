package facade.abstractfacade;


import org.junit.Test;

/**
 * @author cuishifeng
 * @Title: MathStudyFacadeTest
 * @ProjectName facade.abstractfacade
 * @date 2018-11-16
 */
public class MathStudyFacadeTest {


    @Test
    public void test() throws Exception {

        Facade facade = new MathStudyFacade();
        facade.method();

//        开始预习 >> Math
//        进入 - Math 课堂学习
//        开始复习学过的内容 >> Math
//        参加奥林匹克数学比赛

    }
}