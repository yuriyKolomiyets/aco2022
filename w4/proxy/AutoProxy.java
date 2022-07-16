package aco.w4.proxy;

public class AutoProxy implements IAutoProxy {
    private IAutoProxy target;

    public AutoProxy(IAutoProxy target) {
        this.target = target;
    }
    @Override
    public void run() {
        target.run();
        System.out.println("Proxy is working");
    }
    @Override
    public void fill() {
        target.fill();
         System.out.println("Proxy is working");
    }
}
