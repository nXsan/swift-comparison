package com.cmx.swift.comparison.services;

import com.cmx.swift.comparison.exeptions.SwiftParserException;
import com.prowidesoftware.swift.io.ConversionService;
import com.prowidesoftware.swift.io.IConversionService;
import com.prowidesoftware.swift.model.SwiftMessage;

/**
 * Created by nXs on 29.04.2015.
 */

public class SwiftSingleton{
    private static SwiftSingleton instance;
    private IConversionService srv;

    public static synchronized SwiftSingleton getInstance(){
        if(instance == null){
            instance = new SwiftSingleton();
        }
        return instance;
    }

    public SwiftSingleton(){
        srv = new ConversionService();
    }

    public SwiftMessage getMessage(String fin) throws SwiftParserException {
        return srv.getMessageFromFIN(fin);
    }

    public String getFIN(SwiftMessage msg) throws SwiftParserException{
        return srv.getFIN(msg);
    }

    public IConversionService getConversionService(){
        return srv;
    }
}