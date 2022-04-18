package dev.carlosbarros.support;

import org.aeonbits.owner.Config;
@Config.Sources({"classpath:properties/general.properties"})
public interface ServerConfig extends Config {

    @Key("web.base.url") String BaseUrl();
    @Key("selenium.grid.hub") String Hub();
}
