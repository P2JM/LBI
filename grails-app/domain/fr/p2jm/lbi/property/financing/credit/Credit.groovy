package fr.p2jm.lbi.property.financing.credit

class Credit {

    String creditName
    Date startDate
    Date endDate

    Integer duration

    Integer delay

    Float amount

    Float rate

    Insurance insurance


    static constraints = {
        creditName nullable: false, blank: false
        startDate nullable: false, blank: false
        duration nullable: false, blank: false
        amount nullable: false, blank: false
        rate nullable: false, blank: false
    }
}
