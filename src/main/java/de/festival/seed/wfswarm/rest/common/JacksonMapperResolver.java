package de.festival.seed.wfswarm.rest.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

/**
 * Producing the {@link ObjectMapper Jackson ObjectMapper} instance which should be used by Jax-RS to
 * consume/produceconsume/produce JSON.<br/>
 * <b>Use this to do configure the ObjectMapper for all resources.</b>
 */
@Provider
public class JacksonMapperResolver implements ContextResolver<ObjectMapper> {

//    @Inject
//    private Logger logger;

    private final ObjectMapper mapper;

    public JacksonMapperResolver() {
        /* Creating the ObjectMapper inside the constructor; this way, it will be instantiated and configured
         * exactly one time on application startup.
         */
//        logger.info("Creating configured Jackson Object Mapper.");
        System.out.println("Creating configured Jackson Object Mapper.");
        this.mapper = new ObjectMapper();


        //find the JSR310 data type module of jackson (marshalling Java 8 DateTime API):
        mapper.findAndRegisterModules();

        //render DateTimes not as array of attributes ([2017,1,29,...]) but as String ('2017-01-29...'):
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    }

    @Override
    public ObjectMapper getContext(Class<?> type) {
        return mapper;
    }
}
