package aco.w4.proxy;

import aco.w4.model.AutoKey;
import aco.w6.exceptions.InvalidCredentialsExceptions;

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
