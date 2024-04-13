package br.com.murilohenzo.msordermanagement.representation;

public record OrderResponseRepresentation(Long id, String fromAirport, String toAirport, Integer nights) {
}
