package jc.tamingthymeleaf.application.user

import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter(autoApply = true)
class EmailAttributeConverter : AttributeConverter<Email, String> {

    override fun convertToDatabaseColumn(attribute: Email?): String {
        return attribute!!.asString()
    }

    override fun convertToEntityAttribute(dbData: String?): Email {
        return Email(dbData!!)
    }
}