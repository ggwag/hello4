package org.kosa.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/api")
public class HelloController {
	
	@GetMapping("/")
	public String index(HttpSession session)	{
		log.info("카운트 세션 처리중");
		Integer count = (Integer)session.getAttribute("count");
		if (count == null) {
			count = 0;
		}
		count++;
		session.setAttribute("count", count);
		return "index";
	}
}
