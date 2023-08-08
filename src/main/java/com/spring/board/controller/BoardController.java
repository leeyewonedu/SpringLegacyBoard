package com.spring.board.controller;

import com.spring.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    @GetMapping("/save")
    public String saveForm(){
        return "save";
    }

    //@RequestParam :
    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO){
        return " ";
    }
}
