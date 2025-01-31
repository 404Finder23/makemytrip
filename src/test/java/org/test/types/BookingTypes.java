package org.test.types;

import org.test.constants.MMTConstants;
import org.test.utility.MMTException;

public enum BookingTypes {
    FLIGHTS,HOTELS,BUSES,TRAINS;

    public <T> String getBookingSectionUrls(T types) throws MMTException {
        switch (this){
            case FLIGHTS:{
                 return MMTConstants.PageURL.FLIGHT_HOME_PAGE;
            }
            case TRAINS:{
                return MMTConstants.PageURL.TRAIN_HOME_PAGE;
            }
            case BUSES:{
                return MMTConstants.PageURL.BUS_HOME_PAGE;
            }
            case HOTELS:{
                return MMTConstants.PageURL.HOTEL_HOME_PAGE;
            }
            default:{
                throw new MMTException("Invalid Booking Section Selected");
            }
        }
    }
}
