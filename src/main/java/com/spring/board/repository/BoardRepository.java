package com.spring.board.repository;

import com.spring.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardRepository {

    //mybatis에서 제공하는 java와 mapper를 연동하는 클래스
    private final SqlSessionTemplate sql;
    public  int save(BoardDTO boardDTO){
        // mapper의 namespace, id , 전달할 값
        return sql.insert("Board.save", boardDTO);
    }
}
