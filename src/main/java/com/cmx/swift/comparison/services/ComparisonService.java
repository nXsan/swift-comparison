package com.cmx.swift.comparison.services;

import com.cmx.swift.comparison.exeptions.SwiftParserException;
import com.prowidesoftware.swift.model.SwiftMessage;

/**
 * Created by nXs on 29.04.2015.
 */
public class ComparisonService {

    /**
     * Сравнение 2х свифтов с последующим выводом результата сравнения
     * @param fin1
     * @param fin2
     * @return
     */
    public static String compare(String fin1, String fin2) {
        StringBuilder result = new StringBuilder();
        SwiftMessage sm1;
        SwiftMessage sm2;
        SwiftSingleton swiftSingleton = SwiftSingleton.getInstance();

        // validating swift's
        try{
            sm1 = swiftSingleton.getMessage(fin1);
            sm2 = swiftSingleton.getMessage(fin2);
        } catch(SwiftParserException spe) {
            result.append("Не удалось распарсить SWIFT");
            result.append(spe.getMessage());
            return result.toString();
        } catch(Exception e){
            result.append(e.getMessage());
            return result.toString();
        }

        // compare swift's
        if (sm1 != null && sm2 != null) {

            if ( !sm1.getBlock1().equals(sm2.getBlock1()) ) {
                result.append("1ый блок одного файла не равен другому");
            };
            if ( !sm1.getBlock2().equals(sm2.getBlock2()) ) {
                result.append("2ый блок одного файла не равен другому");
            };
            if ( !sm1.getBlock3().equals(sm2.getBlock3()) ) {
                result.append("3ый блок одного файла не равен другому");
            };
            if ( !sm1.getBlock4().equals(sm2.getBlock4()) ) {
                result.append("4ый блок одного файла не равен другому");
            };
        }

        return result.toString();
    };



}
