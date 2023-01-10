//package com.solvd.delivery;
//
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.lang.StringUtils;
//
//import java.io.File;
//
//public class WordCount {
//        public static void main(String[] args) throws Exception {
//            String str = FileUtils.readFileToString(new File("R:\\IdeaProjects\\DeliveryCompany8\\src\\M\\resources\\text.txt"));
//            System.out.println("String:\n" + str);
//            str = StringUtils.lowerCase(str);
//            int countThe = StringUtils.countMatches(str, "the");
//            int countAre = StringUtils.countMatches(str, "are");
//            int countProgramming = StringUtils.countMatches(str, "programming");
//            System.out.println("\"the\" count: " + countThe);
//            System.out.println("\"are\" count: " + countAre);
//            System.out.println("\"programming\" count: " + countProgramming);
//        }
//    }