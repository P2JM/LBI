package fr.p2jm.lbi.property.owner.enterprise

import fr.p2jm.lbi.auth.User

class Sci {


    String sciName
    //User ceo

    Integer numberOfShare

    Boolean closed

    static constraints = {

        numberOfShare nullable: false, blank: false
        sciName nullable: false, blank: false
    }
}
