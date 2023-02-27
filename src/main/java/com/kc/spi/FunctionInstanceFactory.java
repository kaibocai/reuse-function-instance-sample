package com.kc.spi;

import com.kc.Function;
import com.microsoft.azure.functions.spi.inject.FunctionInstanceInjector;

public class FunctionInstanceFactory implements FunctionInstanceInjector{
    @Override
    public <T> T getInstance(Class<T> functionClass) throws Exception {
        return (T) Function.getInstance();
    }
}
