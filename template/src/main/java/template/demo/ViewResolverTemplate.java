package template.demo;

/**
 * @author cuishifeng
 * @Title: ViewResolverTemplate
 * @ProjectName template.demo
 * @date 2018-11-11
 */
public abstract class ViewResolverTemplate {


    protected final void render() {
        loading();
        hook();
        readView();
        if (isCache()){
            System.out.println(">>>> 开启缓存");
        }else {
            System.out.println(">>>> 没有开启缓存");
        }
    }

    protected abstract void loading();

    protected abstract void readView();

    protected void hook() {
    }

    protected boolean isCache() {
        return false;
    }

}
