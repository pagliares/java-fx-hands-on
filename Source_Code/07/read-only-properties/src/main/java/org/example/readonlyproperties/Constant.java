package org.example.readonlyproperties;

import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;

public class Constant {
    private final ReadOnlyIntegerWrapper readOnlyIntegerWrapper;

    public Constant(int number){
        this.readOnlyIntegerWrapper = new ReadOnlyIntegerWrapper(number);
    }

    public ReadOnlyIntegerProperty getReadOnlyIntegerProperty(){
        return readOnlyIntegerWrapper.getReadOnlyProperty();
    }

    public void changeConstant(int number){
        this.readOnlyIntegerWrapper.set(number);
    }
}
