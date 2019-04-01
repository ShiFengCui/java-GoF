package handler.demo;

/**
 * @author cuishifeng
 * @Title: Handler
 * @ProjectName handler.demo
 * @date 2018-11-14
 */
public abstract class Handler {

    protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    /**
     * 传递处理请求
     *
     * @param message
     */
    protected abstract void handlerRequest(String message);


    // -------------------- 子类 ------------------------

    static class ConcreteHandlerA extends Handler {

        @Override
        protected void handlerRequest(String message) {
            if (message.equals("A")) {
                System.out.println("ConcreteHandlerA 处理请求");
            } else {
                System.out.println("A转发请求");
                this.handler.handlerRequest(message);
            }
        }
    }

    static class ConcreteHandlerB extends Handler {

        @Override
        protected void handlerRequest(String message) {
            if (message.equals("B")) {
                System.out.println("ConcreteHandlerB 处理请求");
            } else {
                System.out.println("B转发请求");
                this.handler.handlerRequest(message);
            }
        }
    }

    static class ConcreteHandlerC extends Handler {

        @Override
        protected void handlerRequest(String message) {
            if (message.equals("C")) {
                System.out.println("ConcreteHandlerC 处理请求");
            } else {
                System.out.println("C转发请求");
                this.handler.handlerRequest(message);
            }
        }
    }


    public static void main(String[] args) {

        Handler handlerA, handlerB, handlerC;

        handlerA = new ConcreteHandlerA();
        handlerB = new ConcreteHandlerB();
        handlerC = new ConcreteHandlerC();

        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerC);

        handlerA.handlerRequest("C");


    }
}
