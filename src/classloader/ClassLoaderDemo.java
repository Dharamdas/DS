package classloader;

import com.sun.javafx.util.Logging;

public class ClassLoaderDemo {

    public static void main(String[] args) {
        System.out.println("Printing All types of Class Loaders");
        printClassLoaders();
    }
    public static void printClassLoaders(){
        System.out.println("Printing User Defined Class Loader"+ ClassLoaderApp.class.getClassLoader());
        System.out.println("Printing Pre-Defined Class of Class Loader: "+System.class.getClassLoader());
        System.out.println("Classloader of Logging:" + Logging.class.getClassLoader());

    }
}
