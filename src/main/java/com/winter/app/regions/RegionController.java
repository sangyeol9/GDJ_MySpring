package com.winter.app.regions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/regions/*")
public class RegionController  {
	
	//private RegionDAO dao;
	@Autowired
	private RegionService service;

//	public RegionController(){	
//		this.dao = new RegionDAO();
//	}
////	@RequestMapping(value="add", method = RequestMethod.GET)
////	public String add() {
////		
////		
////		return "regions/add";
////	}
//	@RequestMapping(value="add", method = RequestMethod.POST)
//	public String add(RegionDTO dto,Model model) throws Exception {
////		String id =  request.getParameter("region_id");
////		String name = request.getParameter("region_name");
////		RegionDTO dto = new RegionDTO();
////		dto.setRegion_id((Integer.valueOf(id)));
////		dto.setRegion_name(name);
//		int result = this.dao.addRegion(dto);
//		
//		String msg ="등록 실패";
//		if(result>0) {
//			msg = "등록 성공";
//		}
////		request.setAttribute("msg", msg);
////		request.setAttribute("path", "./list");
//		model.addAttribute("msg", msg);
//		model.addAttribute("path", "./list");
//		return "commons/result";
//	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET) 
	//public String list(HttpServletRequest request) {
	
	public String list(HttpServletRequest request) throws Exception {
		
		List<RegionDTO> list = service.getList();
		request.setAttribute("list", list);
		
		return "regions/list";
	}
//	@RequestMapping(value="detail", method = RequestMethod.GET)
//	public String detail(Integer region_id,Model model) throws Exception{
//		
//		RegionDTO dto = new RegionDTO();
//		dto.setRegion_id(region_id);
//		dto = dao.getDetail(dto);
//		//request.setAttribute("detail", dto);
//		model.addAttribute("detail", dto);
//		
//		return "regions/detail";
//	}
}

