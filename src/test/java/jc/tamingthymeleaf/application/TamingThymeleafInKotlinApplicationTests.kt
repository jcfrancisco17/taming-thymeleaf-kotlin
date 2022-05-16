package jc.tamingthymeleaf.application

import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("spring-boot-test")
// This tells Spring Test opt out of using an in-memory DB.
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TamingThymeleafInKotlinApplicationTests {

    @Test
    fun contextLoads() {
    }

}