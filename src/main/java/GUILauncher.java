import com.rapidminer.gui.RapidMinerGUI;
import com.rapidminer.gui.ToolbarGUIStartupListener;
import com.rapidminer.tools.PlatformUtilities;

import java.nio.file.Paths;

// See: http://community.rapidminer.com/t5/RapidMiner-Studio/how-to-build-Rapidminer-Studio/m-p/33168
public class GUILauncher
{
    public static void main(String[] args) throws Exception
    {
        System.setProperty(PlatformUtilities.PROPERTY_RAPIDMINER_HOME, Paths.get("").toAbsolutePath().toString());
        // See: http://community.rapidminer.com/t5/Become-a-RapidMiner-Developer/Source-build-ClassCastException-AquaMenuBarUI-on-Mac-OSX/td-p/34291
        System.setProperty("com.apple.macos.useScreenMenuBar", "true");
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        RapidMinerGUI.registerStartupListener(new ToolbarGUIStartupListener());
        RapidMinerGUI.main(args);
    }
}
