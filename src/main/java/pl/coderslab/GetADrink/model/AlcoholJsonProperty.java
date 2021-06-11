
package pl.coderslab.GetADrink.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "idIngredient",
    "strIngredient",
    "strDescription",
    "strType",
    "strAlcohol",
    "strABV"
})

@Getter
@Generated("jsonschema2pojo")
public class AlcoholJsonProperty {

//    @JsonProperty("idIngredient")
//    public String idIngredient;
//    @JsonProperty("strIngredient")
//    public String strIngredient;
    @JsonProperty("strDescription")
    private String strDescription;
//    @JsonProperty("strType")
//    public String strType;
//    @JsonProperty("strAlcohol")
//    public String strAlcohol;
//    @JsonProperty("strABV")
//    public String strABV;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    private Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    private void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
