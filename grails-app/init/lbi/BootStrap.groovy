package lbi

import fr.p2jm.lbi.auth.Role
import fr.p2jm.lbi.auth.User
import fr.p2jm.lbi.auth.UserRole

class BootStrap {

    def init = {

        def adminRole = new Role(authority: 'ROLE_ADMIN').save()

        def testUser = new User(username: 'me', password: 'password').save()

        UserRole.create testUser, adminRole

        UserRole.withSession {
            it.flush()
            it.clear()
        }

        assert User.count() == 1
        assert Role.count() == 1
        assert UserRole.count() == 1

    }
    def destroy = {
    }
}
