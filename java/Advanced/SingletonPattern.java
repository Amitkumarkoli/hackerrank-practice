import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class SingletonPattern {
    // Step 1: Declare a private static instance of Singleton
    private static Singleton singleInstance = null;

    // Step 2: Declare the public string variable
    public String str;

    // Step 3: Create a private constructor
    private SingletonPattern() {
        str = "Hello I am a singleton! Let me say ";
    }

    // Step 4: Provide a public static method to return the instance
    public static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new SingletonPattern();
        }
        return singleInstance;
    }
}