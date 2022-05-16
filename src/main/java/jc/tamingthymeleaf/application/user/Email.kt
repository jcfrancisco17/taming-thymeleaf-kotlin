package jc.tamingthymeleaf.application.user

import com.google.common.base.MoreObjects
import org.springframework.util.Assert
import java.util.*

class Email(val email: String) {

    init {
        Assert.isTrue(email.contains("@"), "email should contain @ symbol")
    }

    fun asString(): String {
        return email
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Email) return false

        return Objects.equals(email, other.email)
    }

    override fun hashCode(): Int {
        return Objects.hash(email)
    }

    override fun toString(): String {
        return MoreObjects.toStringHelper(this)
            .add("email", email)
            .toString()
    }


}