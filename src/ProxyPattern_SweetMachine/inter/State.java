package ProxyPattern_SweetMachine.inter;

import java.io.Serializable;

public interface State extends Serializable{
    void insertQuarter();
    void rejectQuarter();
    void turnCrank();
    void dispense();
}
