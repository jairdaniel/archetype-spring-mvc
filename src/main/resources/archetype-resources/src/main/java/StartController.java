#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/start.html")
public class StartController {

	@RequestMapping(method=RequestMethod.GET)
	public String start(ModelMap model){
		model.addAttribute("message", "This message comes from a SpringMVC app");
		return "start";
	}
}
