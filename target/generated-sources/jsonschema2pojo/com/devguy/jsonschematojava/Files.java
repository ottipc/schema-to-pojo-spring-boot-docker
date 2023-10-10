
package com.devguy.jsonschematojava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
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


/**
 * Lace
 * <p>
 * Schema for PAX lace attributes
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vendor",
    "vendorBusinessModel",
    "name",
    "composition",
    "yarnType"
})
@Generated("jsonschema2pojo")
public class Files {

    /**
     * Company
     * <p>
     * name of the vendor company
     * 
     */
    @JsonProperty("vendor")
    @JsonPropertyDescription("name of the vendor company")
    private String vendor;
    /**
     * Business Model
     * <p>
     * business model of vendor
     * 
     */
    @JsonProperty("vendorBusinessModel")
    @JsonPropertyDescription("business model of vendor")
    private Files.VendorBusinessModel vendorBusinessModel;
    /**
     * Product Name
     * <p>
     * product name search
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("product name")
    private String name;
    /**
     * Composition
     * <p>
     * composition of lace fabric search
     * 
     */
    @JsonProperty("composition")
    @JsonPropertyDescription("composition of lace fabric")
    private List<Composition> composition = new ArrayList<Composition>();
    /**
     * Yarn Type
     * <p>
     * type of yarn used search
     * 
     */
    @JsonProperty("yarnType")
    @JsonPropertyDescription("type of yarn used")
    private Files.YarnType yarnType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Company
     * <p>
     * name of the vendor company
     * 
     */
    @JsonProperty("vendor")
    public String getVendor() {
        return vendor;
    }

    /**
     * Company
     * <p>
     * name of the vendor company
     * 
     */
    @JsonProperty("vendor")
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * Business Model
     * <p>
     * business model of vendor
     * 
     */
    @JsonProperty("vendorBusinessModel")
    public Files.VendorBusinessModel getVendorBusinessModel() {
        return vendorBusinessModel;
    }

    /**
     * Business Model
     * <p>
     * business model of vendor
     * 
     */
    @JsonProperty("vendorBusinessModel")
    public void setVendorBusinessModel(Files.VendorBusinessModel vendorBusinessModel) {
        this.vendorBusinessModel = vendorBusinessModel;
    }

    /**
     * Product Name
     * <p>
     * product name search
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Product Name
     * <p>
     * product name search
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Composition
     * <p>
     * composition of lace fabric search
     * 
     */
    @JsonProperty("composition")
    public List<Composition> getComposition() {
        return composition;
    }

    /**
     * Composition
     * <p>
     * composition of lace fabric search
     * 
     */
    @JsonProperty("composition")
    public void setComposition(List<Composition> composition) {
        this.composition = composition;
    }

    /**
     * Yarn Type
     * <p>
     * type of yarn used search
     * 
     */
    @JsonProperty("yarnType")
    public Files.YarnType getYarnType() {
        return yarnType;
    }

    /**
     * Yarn Type
     * <p>
     * type of yarn used search
     * 
     */
    @JsonProperty("yarnType")
    public void setYarnType(Files.YarnType yarnType) {
        this.yarnType = yarnType;
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
        sb.append(Files.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null)?"<null>":this.vendor));
        sb.append(',');
        sb.append("vendorBusinessModel");
        sb.append('=');
        sb.append(((this.vendorBusinessModel == null)?"<null>":this.vendorBusinessModel));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("composition");
        sb.append('=');
        sb.append(((this.composition == null)?"<null>":this.composition));
        sb.append(',');
        sb.append("yarnType");
        sb.append('=');
        sb.append(((this.yarnType == null)?"<null>":this.yarnType));
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
        result = ((result* 31)+((this.vendorBusinessModel == null)? 0 :this.vendorBusinessModel.hashCode()));
        result = ((result* 31)+((this.composition == null)? 0 :this.composition.hashCode()));
        result = ((result* 31)+((this.vendor == null)? 0 :this.vendor.hashCode()));
        result = ((result* 31)+((this.yarnType == null)? 0 :this.yarnType.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Files) == false) {
            return false;
        }
        Files rhs = ((Files) other);
        return (((((((this.vendorBusinessModel == rhs.vendorBusinessModel)||((this.vendorBusinessModel!= null)&&this.vendorBusinessModel.equals(rhs.vendorBusinessModel)))&&((this.composition == rhs.composition)||((this.composition!= null)&&this.composition.equals(rhs.composition))))&&((this.vendor == rhs.vendor)||((this.vendor!= null)&&this.vendor.equals(rhs.vendor))))&&((this.yarnType == rhs.yarnType)||((this.yarnType!= null)&&this.yarnType.equals(rhs.yarnType))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }


    /**
     * Business Model
     * <p>
     * business model of vendor
     * 
     */
    @Generated("jsonschema2pojo")
    public enum VendorBusinessModel {

        FULLY_VERTICAL("Fully Vertical"),
        VERTICAL("Vertical"),
        CONVERTER("Converter"),
        TRADER("Trader");
        private final String value;
        private final static Map<String, Files.VendorBusinessModel> CONSTANTS = new HashMap<String, Files.VendorBusinessModel>();

        static {
            for (Files.VendorBusinessModel c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        VendorBusinessModel(String value) {
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
        public static Files.VendorBusinessModel fromValue(String value) {
            Files.VendorBusinessModel constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Yarn Type
     * <p>
     * type of yarn used search
     * 
     */
    @Generated("jsonschema2pojo")
    public enum YarnType {

        FILAMENT_YARN("filament yarn"),
        SPUN_YARN("spun yarn"),
        OTHER("other");
        private final String value;
        private final static Map<String, Files.YarnType> CONSTANTS = new HashMap<String, Files.YarnType>();

        static {
            for (Files.YarnType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        YarnType(String value) {
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
        public static Files.YarnType fromValue(String value) {
            Files.YarnType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
