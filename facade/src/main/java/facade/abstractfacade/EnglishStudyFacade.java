package facade.abstractfacade;


/**
 * @author cuishifeng
 * @Title: EnglishStudyFacade
 * @ProjectName facade.abstractfacade
 * @date 2018-11-16
 */
public class EnglishStudyFacade extends Facade {

    private PrepareBook prepareBook = new PrepareBook();
    private ClassRoomLearn classRoomLearn = new ClassRoomLearn();
    private ReviewBook reviewBook = new ReviewBook();

    @Override
    public void method() {
        prepareBook.prepareStudyBook("English");
        classRoomLearn.studyOnClass("English");
        reviewBook.reviewBook("English");
    }
}
