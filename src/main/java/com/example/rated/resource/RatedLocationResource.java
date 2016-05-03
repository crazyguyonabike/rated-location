package com.example.rated.resource;

import org.apache.log4j.Logger;
import org.apache.commons.lang3.StringUtils;

import java.net.URL;

import javax.inject.Inject;

import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.rated.domain.Location;
import com.example.rated.service.LocationService;

@Path("/")
public class RatedLocationResource {
    static final Logger logger = Logger.getLogger(RatedLocationResource.class);

    @Inject
    private LocationService locationService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getLocation(@QueryParam("name") String name) throws Exception {
        Response.ResponseBuilder responseBuilder = Response.status(Response.Status.BAD_REQUEST);
        logger.debug(String.format("found name: %s", name));
        if (StringUtils.isNotEmpty(name)) {
            Location location = locationService.getLocation(name);
            if (location != null) 
                responseBuilder = Response.ok(location);
            else
                responseBuilder = Response.status(Response.Status.NOT_FOUND);
        }
        return responseBuilder.build();
    }
}
