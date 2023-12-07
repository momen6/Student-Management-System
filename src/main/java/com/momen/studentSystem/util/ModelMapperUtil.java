package com.momen.studentSystem.util;

import org.modelmapper.ModelMapper;

/**
 * @author Mo'men Magdy
 * this is a singleton class allowing only a single instance of ModelMapper
 * to be created and accessed
 */
public class ModelMapperUtil {

    /**
     * the single instance of ModelMapper
     */
    private static final ModelMapper modelMapper = new ModelMapper();


    private ModelMapperUtil() {

        /**
         * private constructor
         */
    }

    /**
     * Retrieves the shared instance of ModelMapper
     *
     * @return instance of ModelMapper
     */


    public static ModelMapper MAPPER() {
        return modelMapper;
    }
}
