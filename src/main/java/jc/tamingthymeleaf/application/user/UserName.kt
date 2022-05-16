package jc.tamingthymeleaf.application.user

import com.google.common.base.MoreObjects
import java.util.*
import javax.persistence.Embeddable

@Embeddable
class UserName(val firstName: String, val lastName: String) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserName) return false

        return Objects.equals(firstName, other.firstName) and Objects.equals(lastName, other.lastName)
    }

    override fun hashCode(): Int {
        return Objects.hash(firstName, lastName)
    }

    override fun toString(): String {
        return MoreObjects.toStringHelper(this)
            .add("firstName", firstName)
            .add("lastName", lastName)
            .toString()
    }


}