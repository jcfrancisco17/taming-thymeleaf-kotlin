package jc.tamingthymeleaf.application.team.web

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/teams")
class TeamController {

    @GetMapping
    fun index(model: Model) : String {
        return "teams/list"
    }


}