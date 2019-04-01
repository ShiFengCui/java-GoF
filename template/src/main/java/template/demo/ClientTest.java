package template.demo;

/**
 * @author cuishifeng
 * @Title: ClientTest
 * @ProjectName template.demo
 * @date 2018-11-11
 */
public class ClientTest {


    public static void main(String[] args) {

        ViewResolverTemplate velocityResolver = new VelocityResolver();
        velocityResolver.render();

        ViewResolverTemplate  freamarkerResolver = new FreeMarkerResolver();
        freamarkerResolver.render();


    }
}
