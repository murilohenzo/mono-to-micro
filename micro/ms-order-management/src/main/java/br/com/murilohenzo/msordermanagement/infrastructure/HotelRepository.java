package br.com.murilohenzo.msordermanagement.infrastructure;

import br.com.murilohenzo.msordermanagement.representation.HotelRequestRepresentation;
import br.com.murilohenzo.msordermanagement.representation.HotelResponseRepresentation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "HotelService", url = "${apis.ms-hotel}/hotels")
public interface HotelRepository {

    @PostMapping
    ResponseEntity<HotelResponseRepresentation> newHotel(@RequestBody HotelRequestRepresentation hotelRequestRepresentation);
}
