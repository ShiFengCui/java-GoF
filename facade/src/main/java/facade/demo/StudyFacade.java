package facade.demo;

/**
 * 外观类 - 完成学习
 *
 * @author cuishifeng
 * @Title: EnglishStudyFacade
 * @ProjectName facade.demo
 * @date 2018-11-16
 */
public class StudyFacade {

    private PrepareBook prepareBook = new PrepareBook();
    private ClassRoomLearn classRoomLearn = new ClassRoomLearn();
    private ReviewBook reviewBook = new ReviewBook();

    public void goStudy() {
        prepareBook.prepareStudyBook();
        classRoomLearn.studyOnClass();
        reviewBook.reviewBook();
    }


    public static void main(String[] args) {

        StudyFacade studyFacade = new StudyFacade();
        studyFacade.goStudy();

//        开始预习
//        进入课堂学习
//        开始复习学过的内容

    }

}
