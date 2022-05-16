package jc.tamingthymeleaf.application.user

import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter(autoApply = true)
class PhoneNumberAttributeConverter : AttributeConverter<PhoneNumber, String> {
    override fun convertToDatabaseColumn(attribute: PhoneNumber?): String {
        return attribute!!.asString()
    }

    override fun convertToEntityAttribute(dbData: String?): PhoneNumber {
        return PhoneNumber(dbData!!)
    }
}