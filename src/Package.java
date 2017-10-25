public class Package {

    public static String  packageName;
    public static String  meta;
    public static double  version;
    public static boolean InstallablePackage;
    public static String  depends;

    public Package (String p, String m, double v, boolean I, String d) {
        packageName        = p;
        meta               = m;
        version            = v;
        InstallablePackage = I;
        depends            = d;
    }

    public static void getPackageInformation(String mode) {
        if ( mode == "output" ) {
            System.out.println("Package name: " + packageName);
            System.out.println("");
            System.out.println("Meta: " + meta);
            System.out.println("Version: " + version);
            System.out.println("Installable? " + InstallablePackage);
            System.out.println("Dependencies: ");
            System.out.println("Done.");
        }
    }

    // Function prototypes
    public static void installPackage() {};
    public static void removePackage()  {};
    public static void update()         {};
    public static void purge()          {};
    public static void repoGet()        {};
}
