package org.mule.modules.helloworld;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.helloworld.config.ConnectorConfig;

@Connector(name = "hello-world", friendlyName = "HelloWorldConnector")
public class HelloWorldConnector {

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend
     *            Name to be used to generate a greeting message.
     * @return A greeting message
     */
    @Processor
    public String greet(String friend) {
        return config.getGreeting() + " " + friend + ". " + config.getReply();
    }

    /**
     *
     *
     * @param friend
     *            Name to be used to generate a greeting message.
     * @return A greeting message
     */
    @Processor
    public String sayGoodbye(String friend) {
        return config.getFarewell() + " " + friend + "!";
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}