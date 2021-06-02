package pl.coderslab.GetADrink.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;

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
@ToString
@Entity
@Table(name = "drinks")
@Generated("jsonschema2pojo")
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("idDrink")
    private String idDrink;
    @JsonProperty("strDrink")
    @Column(name = "drink_name")
    private String strDrink;
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
    @Column(name = "alcoholic")
    private String strAlcoholic;
//    @JsonProperty("strGlass")
//    public String strGlass;
    @JsonProperty("strInstructions")
    @Column(name = "instructions")
    private String strInstructions;
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
    @Transient
    @JsonProperty("strIngredient1")
    private String strIngredient1;
    @Transient
    @JsonProperty("strIngredient2")
    private String strIngredient2;
    @Transient
    @JsonProperty("strIngredient3")
    private String strIngredient3;
    @Transient
    @JsonProperty("strIngredient4")
    private String strIngredient4;
    @Transient
    @JsonProperty("strIngredient5")
    private Object strIngredient5;
    @Transient
    @JsonProperty("strIngredient6")
    private Object strIngredient6;
    @Transient
    @JsonProperty("strIngredient7")
    private Object strIngredient7;
    @Transient
    @JsonProperty("strIngredient8")
    private Object strIngredient8;
    @Transient
    @JsonProperty("strIngredient9")
    private Object strIngredient9;
    @Transient
    @JsonProperty("strIngredient10")
    private Object strIngredient10;
    @Transient
    @JsonProperty("strIngredient11")
    private Object strIngredient11;
    @Transient
    @JsonProperty("strIngredient12")
    private Object strIngredient12;
    @Transient
    @JsonProperty("strIngredient13")
    private Object strIngredient13;
    @Transient
    @JsonProperty("strIngredient14")
    private Object strIngredient14;
    @Transient
    @JsonProperty("strIngredient15")
    private Object strIngredient15;
    @Transient
    @JsonProperty("strMeasure1")
    private String strMeasure1;
    @Transient
    @JsonProperty("strMeasure2")
    private String strMeasure2;
    @Transient
    @JsonProperty("strMeasure3")
    private String strMeasure3;
    @Transient
    @JsonProperty("strMeasure4")
    private String strMeasure4;
    @Transient
    @JsonProperty("strMeasure5")
    private Object strMeasure5;
    @Transient
    @JsonProperty("strMeasure6")
    private Object strMeasure6;
    @Transient
    @JsonProperty("strMeasure7")
    private Object strMeasure7;
    @Transient
    @JsonProperty("strMeasure8")
    private Object strMeasure8;
    @Transient
    @JsonProperty("strMeasure9")
    private Object strMeasure9;
    @Transient
    @JsonProperty("strMeasure10")
    private Object strMeasure10;
    @Transient
    @JsonProperty("strMeasure11")
    private Object strMeasure11;
    @Transient
    @JsonProperty("strMeasure12")
    private Object strMeasure12;
    @Transient
    @JsonProperty("strMeasure13")
    private Object strMeasure13;
    @Transient
    @JsonProperty("strMeasure14")
    private Object strMeasure14;
    @Transient
    @JsonProperty("strMeasure15")
    private Object strMeasure15;
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


    private String strIngredientsAndMeasures;




}
