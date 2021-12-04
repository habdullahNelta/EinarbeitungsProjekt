package HelfMethoden;

import java.awt.*;
import java.io.File;

public class OpenFile {
    String FileLoction = System.getProperty("user.dir");

    public void OpenTestReport() {

        try {
            //constructor of file class having file as argument
            File file = new File(FileLoction + "\\test-output\\html\\index.html");
            if (!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists())         //checks file exists or not
                desktop.open(file);              //opens the specified file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void OpenTestDate() {

        try {
            //constructor of file class having file as argument
            File file = new File(FileLoction + "\\src\\main\\java\\HelfMethoden\\TestData.properties");
            if (!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists())         //checks file exists or not
                desktop.open(file);              //opens the specified file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void OpenScreenshot() {

        try {
            //constructor of file class having file as argument
            File file = new File(FileLoction + "\\Screenshots");////\\"+ScreenshotName+ ".png"
            //File file = new File(FileLoction + "\\Screenshots");
            //System.out.println(FileLoction + "\\Screenshots\\"+ScreenshotName+ ".png");
            if (!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists())         //checks file exists or not
                desktop.open(file);              //opens the specified file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

