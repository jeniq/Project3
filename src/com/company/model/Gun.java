
package com.company.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weapon" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="handy">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="ONE_HANDED"/>
 *                         &lt;enumeration value="TWO_HANDED"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ttc">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="range">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="short-[1-4][0-9]{2}"/>
 *                                   &lt;pattern value="middle-[5-9][0-9]{2}"/>
 *                                   &lt;pattern value="high-[0-4][0-9]{3}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="effectiveRange">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="5"/>
 *                                   &lt;maxInclusive value="4999"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="holder" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="optics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="material" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "weapon"
})
@XmlRootElement(name = "gun")
public class Gun {

    protected List<Gun.Weapon> weapon;

    /**
     * Gets the value of the weapon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weapon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeapon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Gun.Weapon }
     * 
     * 
     */
    public List<Gun.Weapon> getWeapon() {
        if (weapon == null) {
            weapon = new ArrayList<Gun.Weapon>();
        }
        return this.weapon;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="handy">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="ONE_HANDED"/>
     *               &lt;enumeration value="TWO_HANDED"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ttc">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="range">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="short-[1-4][0-9]{2}"/>
     *                         &lt;pattern value="middle-[5-9][0-9]{2}"/>
     *                         &lt;pattern value="high-[0-4][0-9]{3}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="effectiveRange">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;minInclusive value="5"/>
     *                         &lt;maxInclusive value="4999"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="holder" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="optics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="material" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "model",
        "handy",
        "origin",
        "ttc",
        "material"
    })
    public static class Weapon {

        @XmlElement(required = true)
        protected String model;
        @XmlElement(required = true)
        protected String handy;
        @XmlElement(required = true)
        protected String origin;
        @XmlElement(required = true)
        protected Gun.Weapon.Ttc ttc;
        @XmlElement(required = true)
        protected String material;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the model property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModel() {
            return model;
        }

        /**
         * Sets the value of the model property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModel(String value) {
            this.model = value;
        }

        /**
         * Gets the value of the handy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHandy() {
            return handy;
        }

        /**
         * Sets the value of the handy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHandy(String value) {
            this.handy = value;
        }

        /**
         * Gets the value of the origin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigin() {
            return origin;
        }

        /**
         * Sets the value of the origin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigin(String value) {
            this.origin = value;
        }

        /**
         * Gets the value of the ttc property.
         * 
         * @return
         *     possible object is
         *     {@link Gun.Weapon.Ttc }
         *     
         */
        public Gun.Weapon.Ttc getTtc() {
            return ttc;
        }

        /**
         * Sets the value of the ttc property.
         * 
         * @param value
         *     allowed object is
         *     {@link Gun.Weapon.Ttc }
         *     
         */
        public void setTtc(Gun.Weapon.Ttc value) {
            this.ttc = value;
        }

        /**
         * Gets the value of the material property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaterial() {
            return material;
        }

        /**
         * Sets the value of the material property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaterial(String value) {
            this.material = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        @Override
        public String toString() {
            return "Weapon "
                    + "[id = " + id + "] "
                    + "model: " + model
                    + "\nhandy: " + handy
                    + ", origin: " + origin
                    + ", TTC [" + ttc.toString() + "] "
                    + "\nmaterial: " + material + ';';
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="range">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="short-[1-4][0-9]{2}"/>
         *               &lt;pattern value="middle-[5-9][0-9]{2}"/>
         *               &lt;pattern value="high-[0-4][0-9]{3}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="effectiveRange">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;minInclusive value="5"/>
         *               &lt;maxInclusive value="4999"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="holder" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="optics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "range",
            "effectiveRange",
            "holder",
            "optics"
        })
        public static class Ttc {

            @XmlElement(required = true)
            protected String range;
            protected int effectiveRange;
            protected boolean holder;
            protected boolean optics;

            /**
             * Gets the value of the range property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRange() {
                return range;
            }

            /**
             * Sets the value of the range property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRange(String value) {
                this.range = value;
            }

            /**
             * Gets the value of the effectiveRange property.
             * 
             */
            public int getEffectiveRange() {
                return effectiveRange;
            }

            /**
             * Sets the value of the effectiveRange property.
             * 
             */
            public void setEffectiveRange(int value) {
                this.effectiveRange = value;
            }

            /**
             * Gets the value of the holder property.
             * 
             */
            public boolean isHolder() {
                return holder;
            }

            /**
             * Sets the value of the holder property.
             * 
             */
            public void setHolder(boolean value) {
                this.holder = value;
            }

            /**
             * Gets the value of the optics property.
             * 
             */
            public boolean isOptics() {
                return optics;
            }

            /**
             * Sets the value of the optics property.
             * 
             */
            public void setOptics(boolean value) {
                this.optics = value;
            }

            @Override
            public String toString() {
                return "range = " + range + "m"
                        + ", effectiveRange = " + effectiveRange + "m"
                        + ", holder = " + holder
                        + ", optics = " + optics;
            }


        }

    }

}
