package template.demo;

/**
 * @author cuishifeng
 * @Title: FreeMarkerResolver
 * @ProjectName template.demo
 * @date 2018-11-11
 */
public class FreeMarkerResolver extends ViewResolverTemplate {

    @Override
    protected void loading() {
        System.out.println("加载freeMarker视图解析器");
    }

    @Override
    protected void readView() {
        System.out.println("freeMarker 读取视图模板内容");
    }

    @Override
    protected void hook() {
        System.out.println("freeMarker 额外配置项");
    }

    @Override
    protected boolean isCache() {
        return false;
    }
}
