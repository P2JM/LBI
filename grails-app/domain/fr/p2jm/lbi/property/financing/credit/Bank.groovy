package fr.p2jm.lbi.property.financing.credit

class Bank {


    String bankName

    static constraints = {
        bankName nullable: false, blank: false, unique: true
    }
}
