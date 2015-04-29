package com.cmx.swift.comparison.controllers;

import com.cmx.swift.comparison.services.ComparisonService;
import com.cmx.swift.comparison.services.FileService;
import java.io.IOException;

/**
 * Created by nXs on 29.04.2015.
 */


public class ComparisonMain {

    private final static String RESOURCE_PATH = "С:/swift_files/";

    public static void main(String[] args) {
        ComparisonService cs = new ComparisonService();
        String message1 = "";
        String message2 = "";
        StringBuffer resultCompare = new StringBuffer();
        try {
            message1 = FileService.fileToString(RESOURCE_PATH+"1.txt");
            message2 = FileService.fileToString(RESOURCE_PATH+"2.txt");
        }
        catch (IOException ioe) {
            resultCompare.append(ioe.getMessage());
        }

        if (!message1.isEmpty() && !message2.isEmpty()) {
            resultCompare.append(ComparisonService.compare(message1, message2));
        }
        else {
            resultCompare.append("not all files loaded");
        }

        System.out.print(resultCompare.toString());
    }




}
