package com.joysistvi.stage1.day11;

import java.util.*;

public class StudentGradeAverage
{
    private static String[] studentNames;
    private static double[][] grades;   // grades[student][subject]
    private static double[] averages;
    private static final Scanner scan = new Scanner(System.in);

    static void main(String[] args)
    {
        int studentCount;
        int subjectCount;

        System.out.print("Enter number of students: ");
        studentCount = scan.nextInt();

        System.out.print("Enter number of subjects: ");
        subjectCount = scan.nextInt();

        String[] subjects = studentSubjects(subjectCount);

        studentNames = new String[studentCount];
        grades = new double[studentCount][subjectCount];
        averages = new double[studentCount];

        studentsInformation(
                studentCount,
                subjectCount,
                subjects
        );

        displayStudentInformation(subjects);

        scan.close();
    }

    private static String[] studentSubjects(int arrayLimit)
    {
        String[] subjects = new String[arrayLimit];

        scan.nextLine();

        System.out.println("\nEnter subject names:");

        for (int index = 0; index < arrayLimit; index++)
        {
            System.out.print("Subject " + (index + 1) + ": ");

            subjects[index] = scan.nextLine();
        }

        return subjects;
    }


    private static void studentsInformation(
            int studentCount,
            int subjectCount,
            String[] subjects
    )
    {
        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++)
        {
            double sumOfGrades = 0;

            System.out.print("\nName of Student " + (studentIndex + 1) + ": ");
            String name = scan.nextLine();

            studentNames[studentIndex] = name;

            for (int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++)
            {
                System.out.print(subjects[subjectIndex] + ": ");
                double grade = scan.nextDouble();

                grades[studentIndex][subjectIndex] = grade;

                sumOfGrades += grade;
            }

            scan.nextLine();

            averages[studentIndex] = sumOfGrades / subjectCount;
        }
    }


    private static void displayStudentInformation(String[] subjects)
    {
        int studentColumnWidth = calculateStudentColumnWidth();
        int subjectColumnWidth = calculateSubjectColumnWidth(subjects);
        int averageColumnWidth = 10;


        printTableHeader(
                subjects,
                studentColumnWidth,
                subjectColumnWidth,
                averageColumnWidth
        );


        printHeaderLine(
                studentColumnWidth,
                subjectColumnWidth,
                averageColumnWidth,
                subjects.length
        );


        printStudentRows(
                subjects,
                studentColumnWidth,
                subjectColumnWidth,
                averageColumnWidth
        );
    }


    private static int calculateStudentColumnWidth()
    {
        int width = "Student".length() + 3;

        for (String name : studentNames)
        {
            width = Math.max(width, name.length() + 3);
        }

        return width;
    }


    private static int calculateSubjectColumnWidth(String[] subjects)
    {
        int width = "Average".length() + 3;

        for (String subject : subjects) width = Math.max(width, subject.length() + 3);

        return width;
    }


    private static void printTableHeader(
            String[] subjects,
            int studentColumnWidth,
            int subjectColumnWidth,
            int averageColumnWidth
    )
    {
        System.out.printf("%-" + studentColumnWidth + "s", "Student");

        for (String subject : subjects) System.out.printf("%-" + subjectColumnWidth + "s", subject);

        System.out.printf("%-" + averageColumnWidth + "s%n", "Average");
    }


    private static void printHeaderLine(
            int studentColumnWidth,
            int subjectColumnWidth,
            int averageColumnWidth,
            int subjectCount
    )
    {
        int totalWidth = studentColumnWidth + (subjectColumnWidth * subjectCount) + averageColumnWidth;
        System.out.println("-".repeat(totalWidth));
    }


    private static void printStudentRows(
            String[] subjects,
            int studentColumnWidth,
            int subjectColumnWidth,
            int averageColumnWidth
    )
    {
        for (int studentIndex = 0; studentIndex < studentNames.length; studentIndex++)
        {
            System.out.printf("%-" + studentColumnWidth + "s", studentNames[studentIndex]);

            for (int subjectIndex = 0; subjectIndex < subjects.length; subjectIndex++)
            {
                System.out.printf("%-" + subjectColumnWidth + ".2f", grades[studentIndex][subjectIndex]);
            }

            System.out.printf("%-" + averageColumnWidth + ".2f%n", averages[studentIndex]);
        }
    }
}