package fr.p2jm.lbi.property.financing.credit

class Insurer {

    String insurerName

    static constraints = {
        insurerName nullable: false, blank: false, unique: true
    }
}
