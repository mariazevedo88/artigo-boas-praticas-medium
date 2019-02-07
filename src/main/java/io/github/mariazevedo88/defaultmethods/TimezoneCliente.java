package io.github.mariazevedo88.defaultmethods;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public interface TimezoneCliente {
	
	public LocalDateTime getLocalDateTime();
	
	public ZoneId getZoneId(String zona);
	    
    default ZonedDateTime getZonedDateTime(String zona) {
        return ZonedDateTime.of(getLocalDateTime(), getZoneId(zona));
    }

}
