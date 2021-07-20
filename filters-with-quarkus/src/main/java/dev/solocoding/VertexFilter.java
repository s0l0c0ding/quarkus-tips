package dev.solocoding;

import io.quarkus.vertx.web.RouteFilter;
import io.vertx.ext.web.RoutingContext;

public class VertexFilter {

    @RouteFilter
    void myFilter(RoutingContext rc) {
       rc.response().putHeader("X-Header", "Vertex header");
       rc.next(); 
    }
}
