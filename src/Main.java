// experimental test jar to verify opening of Windows OS default browser

import java.awt.Desktop;
        import java.io.*;
        import java.net.URI;

class GFG {
    public static void main(String[] args)
            throws Exception
    {
        Desktop desk = Desktop.getDesktop();

        // try to open expert.ai Platform Playground with the Windows OS default browser
        desk.browse(new URI("https://platform.expertcustomers.ai/"));
    }
}
