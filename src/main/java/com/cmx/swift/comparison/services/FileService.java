package com.cmx.swift.comparison.services;


import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;


/**
 * Created by nXs on 29.04.2015.
 */
public class FileService {

    public static String fileToString(String location) throws IOException {
        String result = "";
        FileInputStream inputStream = new FileInputStream(location);
        try {
            result = IOUtils.toString(inputStream);
        } finally {
            inputStream.close();
        }
        return result;
    };



}
