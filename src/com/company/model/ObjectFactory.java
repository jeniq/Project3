
package com.company.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.company.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.company.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Gun }
     * 
     */
    public Gun createGun() {
        return new Gun();
    }

    /**
     * Create an instance of {@link Gun.Weapon }
     * 
     */
    public Gun.Weapon createGunWeapon() {
        return new Gun.Weapon();
    }

    /**
     * Create an instance of {@link Gun.Weapon.Ttc }
     * 
     */
    public Gun.Weapon.Ttc createGunWeaponTtc() {
        return new Gun.Weapon.Ttc();
    }

}
