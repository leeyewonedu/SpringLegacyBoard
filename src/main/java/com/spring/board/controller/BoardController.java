package com.spring.board.controller;

import com.spring.board.dto.BoardDTO;
import com.spring.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/save")
    public String saveForm(){
        return "save";
    }

    //@RequestParam :
    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO){
        //DB통신 결과값을 담기위한 변수
        int saveResult = boardService.save(boardDTO);
        if(saveResult > 0){
            return "redirect:/board/";
        }else{
            return "save";
        }
    }
}
