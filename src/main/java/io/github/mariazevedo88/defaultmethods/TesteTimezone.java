package io.github.mariazevedo88.defaultmethods;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.apache.log4j.Logger;

public class TesteTimezone implements TimezoneInvalidaDoCliente{
	
	static final Logger logger = Logger.getLogger(TesteTimezone.class);

	public static void main(String[] args) {
		
		TesteTimezone testeTimezone = new TesteTimezone();
		ZonedDateTime zonedDateTime = testeTimezone.getZonedDateTime("Europe/Paris");
		logger.info(zonedDateTime);
	}

	@Override
	public LocalDateTime getLocalDateTime() {
		return LocalDateTime.now();
	}

	@Override
	public ZoneId getZoneId(String zona) {
		return ZoneId.of(zona);
	}

}
