package aco.patterns.proxy;

import aco.w4.model.AutoKey;

public class AutoProxy implements IAutoProxy {
    private IAutoProxy target;

    public AutoProxy(IAutoProxy target) {
        this.target = target;
    }
    @Override
    public void run(AutoKey autoKey) throws Exception {
        target.run(autoKey);
        System.out.println("Proxy is working");
    }
    @Override
    public void fill() {
        target.fill();
        System.out.println("Proxy is working");

    }

    @Override
    public void stop() {
        target.stop();
        System.out.println("Proxy is working");

    }
}
