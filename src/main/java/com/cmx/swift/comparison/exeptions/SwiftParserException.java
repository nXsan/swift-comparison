package com.cmx.swift.comparison.exeptions;

/**
 * Created by nXs on 29.04.2015.
 */
public class SwiftParserException extends Exception {

    /**
     *
     */

    public SwiftParserException() {
        super();
    }

    public SwiftParserException(String msg) {
        super(msg);
    }

    public SwiftParserException(Throwable e) {
        super(e);
    }

    public SwiftParserException(String msg, Throwable e) {
        super(msg, e);
    }
}
