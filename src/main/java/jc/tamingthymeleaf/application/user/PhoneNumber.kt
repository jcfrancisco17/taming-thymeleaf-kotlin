package jc.tamingthymeleaf.application.user

import com.google.common.base.MoreObjects
import java.util.*

class PhoneNumber(private val phoneNumber: String) {

    fun asString(): String {
        return phoneNumber
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PhoneNumber) return false

        return Objects.equals(phoneNumber, other.phoneNumber)
    }

    override fun hashCode(): Int {
        return Objects.hash(phoneNumber)
    }

    override fun toString(): String {
        return MoreObjects.toStringHelper(this)
            .add("phoneNumber", phoneNumber)
            .toString()
    }
}