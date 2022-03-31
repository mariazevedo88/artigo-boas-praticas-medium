package io.github.mariazevedo88.defaultmethods;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface TimezoneInvalidaDoCliente extends TimezoneCliente{
	
	static final Logger logger = LogManager.getLogger(TimezoneInvalidaDoCliente.class);
	
	@Override
	public default ZonedDateTime getZonedDateTime(String zona) {
        try {
            return ZonedDateTime.of(getLocalDateTime(),ZoneId.of(zona)); 
        } catch (DateTimeException e) {
        	logger.error("Timezone inválido: " + zona +"; utilizando o timezone default.");
            return ZonedDateTime.of(getLocalDateTime(), ZoneId.systemDefault());
        }
    }

}
