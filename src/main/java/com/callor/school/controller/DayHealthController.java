package com.callor.school.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.school.model.DayHealthVO;
import com.callor.school.model.UserVO;
import com.callor.school.service.DayHealthService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value = "/user")
@Controller
public class DayHealthController {

   private final DayHealthService dayhealthService;

   public DayHealthController(DayHealthService dayhealthService) {
      this.dayhealthService = dayhealthService;
   }

   @RequestMapping(value = "/dayHealth", method = RequestMethod.GET)
   public String dayHealth(HttpSession session) {
      return null;
   }

   @RequestMapping(value = "/dayHealth", method = RequestMethod.POST)
   public String dayHealth(HttpSession session, DayHealthVO dayhealthVO,
         String sc_id, String sl_listid,Model model) {
      UserVO userVO = (UserVO) session.getAttribute("USER");
      log.debug(dayhealthVO.toString());
      int ret = dayhealthService.insert(dayhealthVO,userVO);
      
      return String.format("redirect:/user/dayHealth/%s/%s",sc_id,sl_listid) ;
   }
//   @RequestMapping(value = "/dayHealth", method = RequestMethod.POST)
//   public String dayHealth(HttpSession session, Model model) {
//      DayHealthVO dayhealthVO = dayhealthService.findById(my_seq);
//      model.addAttribute("DAYHEALTH", dayhealthVO);
//
//      return null;
//   }
   /*
    * @RequestMapping(value = "/dayHealth", method = RequestMethod.GET) public
    * String dayHealth() { return null; }
    * 
    */










}//end class

