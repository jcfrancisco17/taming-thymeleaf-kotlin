package jc.tamingthymeleaf.application

import io.github.wimdeblauwe.jpearl.InMemoryUniqueIdGenerator
import io.github.wimdeblauwe.jpearl.UniqueIdGenerator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver
import org.thymeleaf.templateresolver.ITemplateResolver
import java.util.*

@Configuration
class TamingThymeleafApplicationConfiguration {

    @Bean
    fun svgTemplateResolver(): ITemplateResolver {
        val resolver = SpringResourceTemplateResolver()
        resolver.prefix = "classpath:/templates/svg/"
        resolver.suffix = ".svg"
        resolver.setTemplateMode("XML")
        return resolver
    }

    @Bean
    fun uniqueIdGenerator() : UniqueIdGenerator<UUID> {
        return InMemoryUniqueIdGenerator()
    }

}