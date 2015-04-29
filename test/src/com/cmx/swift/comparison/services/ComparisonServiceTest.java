package com.cmx.swift.comparison.services;

import junit.framework.TestCase;

public class ComparisonServiceTest extends TestCase {

    private final static String RESOURCE_PATH = "test/resources/";
    private final static String MT940_1 = "afinakft_940.afina";
    private final static String MT940_2 = "notvalidafinaswi_940.afina";
    private final static String MT940_3 = "badrbicafinakft_940.afina";
    private final static String MT940_4 = "badrbicafinaswi_940.afina";

    public void testCompare() throws Exception {
        String result;
        String msg1 = FileService.fileToString(RESOURCE_PATH+MT940_1);
        String msg2 = FileService.fileToString(RESOURCE_PATH+MT940_3);
        String msg3 = FileService.fileToString(RESOURCE_PATH+MT940_4);

        result = ComparisonService.compare(msg1, msg1);
        assertTrue(result.isEmpty());

    }

}