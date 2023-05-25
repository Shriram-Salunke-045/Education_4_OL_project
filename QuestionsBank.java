package com.example.educationapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList> cppQuestions() {
        final List<QuestionsList> questionLists = new ArrayList<>();

        final QuestionsList Question1 = new QuestionsList("Which of the following is the correct syntax to print the message in C++ language?", "cout <<\"Hello world!\";", "Cout << Hello world!;", "Out <<\"Hello world!;", "None of the above", "cout <<\"Hello world!\";", "");
        final QuestionsList Question2 = new QuestionsList("Which of the following features must be supported by any programming language to become a pure object-oriented programming language?", "Encapsulation", "Inheritance", "Polymorphism", "All of the above", "All of the above", "");
        final QuestionsList Question3 = new QuestionsList("The programming language that has the ability to create new data types is called___.", "Overloaded", "Encapsulated", "Reprehensible", "Extensible", "Extensible", "");
        final QuestionsList Question4 = new QuestionsList("Which of the following is the original creator of the C++ language?", "Dennis Ritchie", "A package is collection of classes", "A package is collection of classes and interfaces", "A package is collection of interfaces", "A pacakge is collection of interfaces and classes", "");
        final QuestionsList Question5 = new QuestionsList("Identify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class.", "final", "static", "volatile", "abstract", "static", "");
        final QuestionsList Question6 = new QuestionsList("Where does the system stores parameters and local variables whenever a method is invoked?", "Heap", "Stack", "Array", "Tree", "Stack", "");

        //add all question to List<QuestionLists>
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);

        return questionLists;
    }

    private static List<QuestionsList> phpQuestions() {
        final List<QuestionsList> questionLists = new ArrayList<>();

        final QuestionsList Question1 = new QuestionsList("PHP stands for -", "Hypertext Preprocessor", "Pretext Hypertext Preprocessor", "Personal Home Processor", "None of the above", "Hypertext Preprocessor", "");
        final QuestionsList Question2 = new QuestionsList("Who is known as the father of PHP?", "Drek Kolkevi", "List Barely", "Rasmus Lerdrof", "None of the above", "Rasmus Lerdrof", "");
        final QuestionsList Question3 = new QuestionsList("Which of the following is used to display the output in PHP?", "echo", "write", "print", "Both (a) and (c)", "Both (a) and (c)", "");
        final QuestionsList Question4 = new QuestionsList(" Which of the following is the use of strlen() function in PHP?", "The strlen() function returns the type of string", "The strlen() function returns the length of string", "The strlen() function returns the value of string", "The strlen() function returns both value and type of string", "The strlen() function returns the length of string", "");
        final QuestionsList Question5 = new QuestionsList("Which of the following is the correct way to create a function in PHP?", "Create myFunction()", "New_function myFunction()", "function myFunction()", "None of the above", "function myFunction()", "");
        final QuestionsList Question6 = new QuestionsList("Which of the following function is used to find files in PHP?", "glob()", "fold()", "file()", "None of the above", "glob()", "");

        //add all question to List<QuestionLists>
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);

        return questionLists;
    }

    private static List<QuestionsList> javaQuestions() {
        final List<QuestionsList> questionLists = new ArrayList<>();

        final QuestionsList Question1 = new QuestionsList("Number of primitive data types in Java are?", "6", "7", "8", "9", "8", "");
        final QuestionsList Question2 = new QuestionsList("Arrays in java are?", "Object references", "Objects", "Primitive Datatypes", "None", "Objects", "");
        final QuestionsList Question3 = new QuestionsList("When is the object created with new keyword?", "At run time", "At compile time", "Depends on the code", "None", "At run time", "");
        final QuestionsList Question4 = new QuestionsList("Identify the corrected definition of a package.", "A package is collection of editing tools", "A package is collection of classes", "A package is collection of classes and interfaces", "A package is collection of interfaces", "A pacakge is collection of interfaces and classes", "");
        final QuestionsList Question5 = new QuestionsList("Identify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class.", "final", "static", "volatile", "abstract", "static", "");
        final QuestionsList Question6 = new QuestionsList("Where does the system stores parameters and local variables whenever a method is invoked?", "Heap", "Stack", "Array", "Tree", "Stack", "");

        //add all question to List<QuestionLists>
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);

        return questionLists;

    }

    private static List<QuestionsList> pythonQuestions() {
        final List<QuestionsList> questionLists = new ArrayList<>();

        final QuestionsList Question1 = new QuestionsList("Which one of the following is the correct extension of the Python file?", ".py", ".python", ".p", "None of the above", ".py", "");
        final QuestionsList Question2 = new QuestionsList("What do we use to define a block of code in Python language?", "key", "brackets", "indentation", "None", "indentation", "");
        final QuestionsList Question3 = new QuestionsList("What is the method inside the class in python language?", "Object", "Function", "Attribute", "Argument", "Function", "");
        final QuestionsList Question4 = new QuestionsList("Why does the name of local variables start with an underscore discouraged?", "To identify the variable", "It confuses the interpreter", "It indicates a private variable of a class", "None of these", "It indicates a private variable of a class", "");
        final QuestionsList Question5 = new QuestionsList(" Which of the following words cannot be a variable in python language?", "_val", "val", "try", "_try_", "try", "");
        final QuestionsList Question6 = new QuestionsList(" Which of the following operators is the correct option for power(ab)?", "a ^ b", "a**b", "a ^ ^ b", "a ^ * b", "a**b", "");

        //add all question to List<QuestionLists>
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);
        questionLists.add(Question1);

        return questionLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "cpp":
                return cppQuestions();

            case "php":
                return phpQuestions();

            case "java":
                return javaQuestions();

            case "python":
                return pythonQuestions();
        }


        return null;
    }
}
