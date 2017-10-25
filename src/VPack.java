/*
 * VPack.java -
 *
 */
import java.io.*;
import java.util.*;
import java.net.*;

public class VPack {
    public static boolean isRunning = true;
    private static int exitClean = 0;

    static void checkIfRunning () {
        if ( isRunning != true ) {
            System.out.println("Terminated.");
            System.out.println("Bye.");
            System.exit(exitClean);
        }
    }

    /* Test method 1 */
    static void U1(int m) {
        // Test/debug suite.
        if ( m == 1 ) {
            return;
        } else if ( m == 0 ) {
            // Test suite one.
            // Create test package.
            Package dummy = new Package("Dummy", "None", 0.1, true, "None");
            Package.getPackageInformation("output");
        } else if ( m == 2 ) {
            // Second test suite.
        } else {
            return;
        }
    }

    /* TODO:Test method 2 -- PROTOTYPE -- */
    static void U2(int m) {}

    static void __init__(String welcomeMessage) {
        System.out.println(welcomeMessage);
        checkIfRunning();
    }

    public static void main(String args[]) {
        String welcome = "********************\n" +
                         "*        VPack     *\n" +
                         "********************\n";
        __init__(welcome);
        U1(1); // Change this to 1 to disable dummy package test.
    }
}
