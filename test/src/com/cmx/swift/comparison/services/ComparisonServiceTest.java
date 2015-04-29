package com.cmx.swift.comparison.services;

import junit.framework.TestCase;

public class ComparisonServiceTest extends TestCase {

    private final static String RESOURCE_PATH = "src/main/resources/";
    private final static String MT940_1 = "940_1.txt";
    private final static String MT940_2 = "940_2.txt";

    public void testCompare() throws Exception {
        String result;
        String msg1 = FileService.fileToString(RESOURCE_PATH+MT940_1);
        String msg2 = FileService.fileToString(RESOURCE_PATH+MT940_2);
        result = ComparisonService.compare(msg1, msg2);
        assertFalse(result.isEmpty());
    }
}