package fr.p2jm.lbi.auth

import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_ADMIN')
class SecureController {

    def index() { }
}
