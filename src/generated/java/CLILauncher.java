import com.rapidminer.RapidMiner;
import com.rapidminer.tools.PlatformUtilities;

import java.nio.file.Paths;

public class CLILauncher
{
    public static void main(String[] args) throws Exception
    {
        System.setProperty(PlatformUtilities.PROPERTY_RAPIDMINER_HOME, Paths.get("").toAbsolutePath().toString());
        RapidMiner.setExecutionMode(RapidMiner.ExecutionMode.COMMAND_LINE);
        RapidMiner.init();
    }
}
