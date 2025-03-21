package cz.amuradon.tralon.newlisting.trader;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record OrderUpdate(@JsonProperty("s") String symbol, @JsonProperty("d") OrderUpdateData data) {

}
