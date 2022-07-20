package aco.w4.proxy;

import aco.w4.model.AutoKey;
import aco.w6.exceptions.InvalidCredentialsExceptions;

public interface IAutoProxy {

    void run(AutoKey autoKey) throws Exception;
    void fill();

    void stop();
}
