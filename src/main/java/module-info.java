module io.github.atlascommunity.marklet {
    requires jdk.javadoc;
    requires static  lombok;
    requires markdowngenerator;
    requires org.apache.commons.lang3;

    exports io.github.atlascommunity.marklet;
    exports io.github.atlascommunity.marklet.util;
}