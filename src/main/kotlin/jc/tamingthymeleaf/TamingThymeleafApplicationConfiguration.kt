package jc.tamingthymeleaf

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver
import org.thymeleaf.templateresolver.ITemplateResolver

@Configuration
class TamingThymeleafApplicationConfiguration {

    @Bean
    fun svgTemplateResolver(): ITemplateResolver {
        val resolver = SpringResourceTemplateResolver()
        resolver.prefix = "classpath:/templates/svg"
        resolver.suffix = ".svg"
        resolver.setTemplateMode("XML")
        return resolver
    }

}