package org.apache.rocketmq.broker;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.apache.rocketmq.srvutil.ServerUtil;

/**
 * @author liyiwen
 * @Description:
 * @date 2019-12-15 09:06
 */
public class CliTest {

    public static void main(String[] args) {
        Options options = ServerUtil.buildCommandlineOptions(new Options());
        CommandLine commandLine = ServerUtil.parseCmdLine("mqbroker", args, buildCommandlineOptions(options),
                new PosixParser());
        if (null == commandLine) {
            System.exit(-1);
        }
    }

    private static Options buildCommandlineOptions(final Options options) {
        Option opt = new Option("c", "configFile", true, "Broker config properties file");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("p", "printConfigItem", false, "Print all config item");
        opt.setRequired(false);
        options.addOption(opt);

        opt = new Option("m", "printImportantConfig", false, "Print important config item");
        opt.setRequired(false);
        options.addOption(opt);

        return options;
    }
}
