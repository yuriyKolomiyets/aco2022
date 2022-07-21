package aco.w4.proxy;

import aco.w4.model.AutoKey;

public interface IAutoProxy {

    void run(AutoKey autoKey) throws Exception;
    void fill();

    void stop();
}
