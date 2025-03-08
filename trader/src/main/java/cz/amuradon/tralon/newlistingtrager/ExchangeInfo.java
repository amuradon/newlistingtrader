package cz.amuradon.tralon.newlistingtrager;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ExchangeInfo(@JsonProperty("symbols") List<SymbolInfo> symbols) {

}
