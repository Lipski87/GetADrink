package pl.coderslab.GetADrink.webclient.dto;

import java.util.*;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import pl.coderslab.GetADrink.model.Drink;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "drinks"
})

@Data
@Generated("jsonschema2pojo")
public class DrinkDto {

    @JsonProperty("drinks")
    public List<Drink> drinks = null;

    @JsonIgnore
    public static Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
