package jc.tamingthymeleaf

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.LocaleResolver
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.i18n.CookieLocaleResolver
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor

@Configuration
class WebMvcConfiguration : WebMvcConfigurer {

    /**
     * Throws the following when not configured
     *
     * ```
     * java.lang.UnsupportedOperationException: Cannot change HTTP accept header - use a different locale resolution strategy
     * ```
     */
    @Bean
    fun localeResolver(): LocaleResolver {
        return CookieLocaleResolver()
    }

    /**
     * Allows changing of the locale via request parameter, i.e. `?lang=nl`.
     */
    @Bean
    fun localeInterceptor(): LocaleChangeInterceptor {
        val localeChangeInterceptor = LocaleChangeInterceptor()
        localeChangeInterceptor.paramName = "lang"
        return localeChangeInterceptor
    }

    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(localeInterceptor())
    }
}