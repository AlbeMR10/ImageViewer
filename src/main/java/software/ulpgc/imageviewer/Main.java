package software.ulpgc.imageviewer;

import java.io.File;

public class Main {
    public static final String root = "src/main/resources";
    public static void main(String[] args){
        MainFrame frame = new MainFrame();
        Image image = new FileImageLoader(new File(root)).load();
        frame.getImageDisplay().show(image);
        frame.add("<", new PrevImageCommand(frame.getImageDisplay()));
        frame.add(">", new NextImageCommand(frame.getImageDisplay()));
        frame.setVisible(true);
    }
}
