package com.example.eunboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {


    @GetMapping("/board/writepro") // http://localhost:8080/board/write
  public String boardWriteForm(){

    return "boardwrite"; // templates/boardwrite.html 호출
  }

  @GetMapping("/board/main")
  public String boardMainForm(){

      return "boardmain"; // templates/boardmain.html 호출
  }
}
