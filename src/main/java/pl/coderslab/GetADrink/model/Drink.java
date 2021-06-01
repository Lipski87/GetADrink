package pl.coderslab.GetADrink.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "idDrink",
        "strDrink",
        "strDrinkAlternate",
        "strTags",
        "strVideo",
        "strCategory",
        "strIBA",
        "strAlcoholic",
        "strGlass",
        "strInstructions",
        "strInstructionsES",
        "strInstructionsDE",
        "strInstructionsFR",
        "strInstructionsIT",
        "strInstructionsZH-HANS",
        "strInstructionsZH-HANT",
        "strDrinkThumb",
        "strIngredient1",
        "strIngredient2",
        "strIngredient3",
        "strIngredient4",
        "strIngredient5",
        "strIngredient6",
        "strIngredient7",
        "strIngredient8",
        "strIngredient9",
        "strIngredient10",
        "strIngredient11",
        "strIngredient12",
        "strIngredient13",
        "strIngredient14",
        "strIngredient15",
        "strMeasure1",
        "strMeasure2",
        "strMeasure3",
        "strMeasure4",
        "strMeasure5",
        "strMeasure6",
        "strMeasure7",
        "strMeasure8",
        "strMeasure9",
        "strMeasure10",
        "strMeasure11",
        "strMeasure12",
        "strMeasure13",
        "strMeasure14",
        "strMeasure15",
        "strImageSource",
        "strImageAttribution",
        "strCreativeCommonsConfirmed",
        "dateModified"
})

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "drinks")
@Generated("jsonschema2pojo")
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("idDrink")
    public String idDrink;
    @JsonProperty("strDrink")
    public String strDrink;
//    @JsonProperty("strDrinkAlternate")
//    public Object strDrinkAlternate;
//    @JsonProperty("strTags")
//    public Object strTags;
//    @JsonProperty("strVideo")
//    public Object strVideo;
//    @JsonProperty("strCategory")
//    public String strCategory;
//    @JsonProperty("strIBA")
//    public Object strIBA;
    @JsonProperty("strAlcoholic")
    public String strAlcoholic;
//    @JsonProperty("strGlass")
//    public String strGlass;
    @JsonProperty("strInstructions")
    public String strInstructions;
//    @JsonProperty("strInstructionsES")
//    public Object strInstructionsES;
//    @JsonProperty("strInstructionsDE")
//    public String strInstructionsDE;
//    @JsonProperty("strInstructionsFR")
//    public Object strInstructionsFR;
//    @JsonProperty("strInstructionsIT")
//    public String strInstructionsIT;
//    @JsonProperty("strInstructionsZH-HANS")
//    public Object strInstructionsZHHANS;
//    @JsonProperty("strInstructionsZH-HANT")
//    public Object strInstructionsZHHANT;
//    @JsonProperty("strDrinkThumb")
//    public String strDrinkThumb;
//    @JsonProperty("strIngredient1")
//    public String strIngredient1;
//    @JsonProperty("strIngredient2")
//    public String strIngredient2;
//    @JsonProperty("strIngredient3")
//    public String strIngredient3;
//    @JsonProperty("strIngredient4")
//    public String strIngredient4;
//    @JsonProperty("strIngredient5")
//    public Object strIngredient5;
//    @JsonProperty("strIngredient6")
//    public Object strIngredient6;
//    @JsonProperty("strIngredient7")
//    public Object strIngredient7;
//    @JsonProperty("strIngredient8")
//    public Object strIngredient8;
//    @JsonProperty("strIngredient9")
//    public Object strIngredient9;
//    @JsonProperty("strIngredient10")
//    public Object strIngredient10;
//    @JsonProperty("strIngredient11")
//    public Object strIngredient11;
//    @JsonProperty("strIngredient12")
//    public Object strIngredient12;
//    @JsonProperty("strIngredient13")
//    public Object strIngredient13;
//    @JsonProperty("strIngredient14")
//    public Object strIngredient14;
//    @JsonProperty("strIngredient15")
//    public Object strIngredient15;
//    @JsonProperty("strMeasure1")
//    public String strMeasure1;
//    @JsonProperty("strMeasure2")
//    public String strMeasure2;
//    @JsonProperty("strMeasure3")
//    public String strMeasure3;
//    @JsonProperty("strMeasure4")
//    public String strMeasure4;
//    @JsonProperty("strMeasure5")
//    public Object strMeasure5;
//    @JsonProperty("strMeasure6")
//    public Object strMeasure6;
//    @JsonProperty("strMeasure7")
//    public Object strMeasure7;
//    @JsonProperty("strMeasure8")
//    public Object strMeasure8;
//    @JsonProperty("strMeasure9")
//    public Object strMeasure9;
//    @JsonProperty("strMeasure10")
//    public Object strMeasure10;
//    @JsonProperty("strMeasure11")
//    public Object strMeasure11;
//    @JsonProperty("strMeasure12")
//    public Object strMeasure12;
//    @JsonProperty("strMeasure13")
//    public Object strMeasure13;
//    @JsonProperty("strMeasure14")
//    public Object strMeasure14;
//    @JsonProperty("strMeasure15")
//    public Object strMeasure15;
//    @JsonProperty("strImageSource")
//    public Object strImageSource;
//    @JsonProperty("strImageAttribution")
//    public Object strImageAttribution;
//    @JsonProperty("strCreativeCommonsConfirmed")
//    public String strCreativeCommonsConfirmed;
//    @JsonProperty("dateModified")
//    public String dateModified;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//
//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}
