package facade.abstractfacade;

/**
 * @author cuishifeng
 * @Title: MathStudyFacade
 * @ProjectName facade.abstractfacade
 * @date 2018-11-16
 */
public class MathStudyFacade extends Facade {

    private PrepareBook prepareBook = new PrepareBook();
    private ClassRoomLearn classRoomLearn = new ClassRoomLearn();
    private ReviewBook reviewBook = new ReviewBook();
    private OlympicMathCompetition olympicMathCompetition = new OlympicMathCompetition();

    @Override
    public void method() {
        prepareBook.prepareStudyBook("Math");
        classRoomLearn.studyOnClass("Math");
        reviewBook.reviewBook("Math");
        olympicMathCompetition.joinOlympicMath();
    }
}
