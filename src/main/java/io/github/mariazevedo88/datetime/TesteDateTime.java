package io.github.mariazevedo88.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.apache.log4j.Logger;

public class TesteDateTime {
	
	private static final Logger logger = Logger.getLogger(TesteDateTime.class);

	public static void main(String[] args) {
		//Usamos o ZonedDateTime

	    ZoneId fusoHorarioSP = ZoneId.of("America/Sao_Paulo");
	    ZonedDateTime agoraSP = ZonedDateTime.now(fusoHorarioSP);
	      
	      
	    //Exemplo: 2018-02-26T20:15:57.838-03:00[America/Sao_Paulo]
	    logger.info(agoraSP); 
	}

}
