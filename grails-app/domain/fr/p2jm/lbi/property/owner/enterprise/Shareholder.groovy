package fr.p2jm.lbi.property.owner.enterprise

import fr.p2jm.lbi.auth.User

class Shareholder {

    User shareholder

    Float numberOfShare

    static constraints = {
        shareholder nullable: false, blank: false
        numberOfShare nullable: false, blank: false
    }
}
