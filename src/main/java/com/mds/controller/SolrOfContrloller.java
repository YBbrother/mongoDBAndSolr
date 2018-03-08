package com.mds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/solr")
public class SolrOfContrloller {
	
	@RequestMapping(value="/sunshine")
	public String sunshine(Model model) {
		model.addAttribute("msg", "阳光正好，微风不燥");
		return "sunshine";
	}

}
