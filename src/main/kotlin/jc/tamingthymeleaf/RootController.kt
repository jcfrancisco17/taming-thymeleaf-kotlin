package jc.tamingthymeleaf

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class RootController {

    @GetMapping
    fun index(model: Model): String {
        model.addAttribute("pageTitle", "Taming Thymeleaf")
        model.addAttribute("scientists", listOf("Albert Einstein", "Niels Bohr", "James Clerk Maxwell"))
        return "index"
    }
}