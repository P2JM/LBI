package fr.p2jm.lbi.crypto.wallet

class Wallet {


    String walletName
    String walletAdress

    static constraints = {
        walletName nullable: false, blank: false
    }
}
