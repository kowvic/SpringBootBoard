package com.springboot.board.service;

import org.springframework.data.domain.Page;

import com.springboot.board.domain.Board;
import com.springboot.board.domain.Search;

public interface BoardService {
	void insertBoard(Board board);
	
	void updateBoard(Board board);
	
	void deleteBoard(Board board);
	
	Board getBoard(Board board);
	
	Page<Board> getBoardList(Search search);
}
