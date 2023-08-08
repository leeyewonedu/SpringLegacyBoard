package com.spring.board.service;

import com.spring.board.dto.BoardDTO;
import com.spring.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    public int save(BoardDTO boardDTO){
        return boardRepository.save(boardDTO);
    }
}
