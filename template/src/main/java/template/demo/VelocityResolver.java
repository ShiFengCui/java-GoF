package template.demo;

/**
 * @author cuishifeng
 * @Title: VelocityResolver
 * @ProjectName template.demo
 * @date 2018-11-11
 */
public class VelocityResolver extends ViewResolverTemplate {


    @Override
    protected void loading() {
        System.out.println("加载velocity模板解析器");
    }

    @Override
    protected void readView() {
        System.out.println("velocity 读取视图模板内容");
    }

    @Override
    protected boolean isCache() {
        return true;
    }
}
