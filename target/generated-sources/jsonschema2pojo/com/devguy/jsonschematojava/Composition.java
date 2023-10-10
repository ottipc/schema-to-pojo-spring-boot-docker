
package com.devguy.jsonschematojava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "percentage",
    "material"
})
@Generated("jsonschema2pojo")
public class Composition {

    @JsonProperty("number")
    private Object number;
    /**
     * %
     * <p>
     * percentage search
     * 
     */
    @JsonProperty("percentage")
    @JsonPropertyDescription("percentage")
    private Double percentage;
    /**
     * Material
     * <p>
     * Material search
     * 
     */
    @JsonProperty("material")
    @JsonPropertyDescription("Material")
    private Composition.Material material;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("number")
    public Object getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Object number) {
        this.number = number;
    }

    /**
     * %
     * <p>
     * percentage search
     * 
     */
    @JsonProperty("percentage")
    public Double getPercentage() {
        return percentage;
    }

    /**
     * %
     * <p>
     * percentage search
     * 
     */
    @JsonProperty("percentage")
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    /**
     * Material
     * <p>
     * Material search
     * 
     */
    @JsonProperty("material")
    public Composition.Material getMaterial() {
        return material;
    }

    /**
     * Material
     * <p>
     * Material search
     * 
     */
    @JsonProperty("material")
    public void setMaterial(Composition.Material material) {
        this.material = material;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Composition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("percentage");
        sb.append('=');
        sb.append(((this.percentage == null)?"<null>":this.percentage));
        sb.append(',');
        sb.append("material");
        sb.append('=');
        sb.append(((this.material == null)?"<null>":this.material));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.material == null)? 0 :this.material.hashCode()));
        result = ((result* 31)+((this.percentage == null)? 0 :this.percentage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Composition) == false) {
            return false;
        }
        Composition rhs = ((Composition) other);
        return (((((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.material == rhs.material)||((this.material!= null)&&this.material.equals(rhs.material))))&&((this.percentage == rhs.percentage)||((this.percentage!= null)&&this.percentage.equals(rhs.percentage))));
    }


    /**
     * Material
     * <p>
     * Material search
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Material {

        AB_ABACA("Ab - Abaca"),
        ALUMINIUM_HYDROXIDE("Aluminium hydroxide"),
        ANIDEX("Anidex"),
        ARAMID("Aramid"),
        BAMBOO("Bamboo"),
        BISON("Bison"),
        BONE("Bone"),
        WAX("Wax"),
        OTHER("other");
        private final String value;
        private final static Map<String, Composition.Material> CONSTANTS = new HashMap<String, Composition.Material>();

        static {
            for (Composition.Material c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Material(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Composition.Material fromValue(String value) {
            Composition.Material constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
