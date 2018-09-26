package fr.p2jm.lbi.property.financing.credit

class Insurance {

    Insurer insurer
     Float rate

    static constraints = {
        rate nullable: false, blank: false
        insurer nullable: false, blank: false
    }
}
