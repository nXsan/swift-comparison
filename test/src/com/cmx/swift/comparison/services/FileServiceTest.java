package com.cmx.swift.comparison.services;

import junit.framework.TestCase;

public class FileServiceTest extends TestCase {

    private final static String RESOURCE_PATH = "test/resources/";
    private final static String TEST_FILE_NAME = "afinakft_940.afina";

    public void testFileToString() throws Exception {
        String result;
        result = FileService.fileToString(RESOURCE_PATH+TEST_FILE_NAME);
        assertFalse(result.isEmpty());
    }
}