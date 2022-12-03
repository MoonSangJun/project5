//package com.example;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class BoardDao {
//
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    public int insertBoard(BoardVo vo){
//        String sql = "insert into BOARD(purpose, nickname, duedate, personnel, apply, introduce, inquire, manager, qualifications, interview, image) values("
//                + "'" + vo.getPurpose() + "',"
//                +"'" + vo.getName() + "',"
//                +"'" + vo.getDate() + "',"
//                +"'" + vo.getNumber() + "',"
//                +"'" + vo.getApply() + "',"
//                +"'" + vo.getIntroduce() + "',"
//                + "'" + vo.getInquire() + "',"
//                + "'" + vo.getManager() + "',"
//                + "'" + vo.getQualifications() + "',"
//                + "'" + vo.getInterview() + "',"
//                + "'" + vo.getImage() + "')";
//
//        return jdbcTemplate.update(sql);
//    }
//
//
//    public int deleteBoard(int seq){
//        String sql = "delete from BOARD where seq = " + seq;
//        return jdbcTemplate.update(sql);
//    }
//
//
//
//    public int updateBoard(BoardVo vo){
//        String sql = "update BOARD set purpose=" + vo.getPurpose() + "."
//                +"nickname = " + vo.getName() + ","
//                +"duedate = " + vo.getDate() + ","
//                +"personnel = " + vo.getNumber() + ","
//                +"apply = " + vo.getApply() + ","
//                +"introduce = " + vo.getIntroduce() + ","
//                +"inquire = " + vo.getInquire() + ","
//                +"manager = " + vo.getManager() + ","
//                +"qualifications = " + vo.getQualifications() + ","
//                +"image = " + vo.getImage();
//        return jdbcTemplate.update(sql);
//    }
//
//    class BoardRowMapper implements RowMapper<BoardVo> {
//        @Override
//        public BoardVo mapRow(ResultSet rs, int rowNum) throws SQLException{
//            BoardVo vo = new BoardVo();
//            vo.setSeq(rs.getInt("seq"));
//            vo.setPurpose(rs.getString("purpose"));
//            vo.setName(rs.getString("nickname"));
//            vo.setDate(rs.getString("duedate"));
//            vo.setNumber(rs.getString("personnel"));
//            vo.setApply(rs.getString("apply"));
//            vo.setIntroduce(rs.getString("introduce"));
//            vo.setInquire(rs.getString("inquire"));
//            vo.setManager(rs.getString("manager"));
//            vo.setQualifications(rs.getString("qualifications"));
//            vo.setInterview(rs.getString("interview"));
//            vo.setImage(rs.getString("image"));
//            vo.setCnt(rs.getInt("cnt"));
//            return vo;
//        }
//    }
//
//    public BoardVo getBoard(int seq){
//        String sql="select * from BOARD where seq=" + seq;
//        return jdbcTemplate.queryForObject(sql, new BoardRowMapper());
//    }
//
//    public List<BoardVo> getBoardList(){
//        String sql="select * from BOARD order by regdate desc";
//        return jdbcTemplate.query(sql,new BoardRowMapper());
//    }
//}

package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardDao {
/*
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    private final String BOARD_INSERT = ;
    private final String BOARD_UPDATE = "update BOARD set title=?, writer=?, content=? where seq=?";
    private final String BOARD_DELETE = "delete from BOARD  where seq=?";
    private final String BOARD_GET = "select * from BOARD  where seq=?";
    private final String BOARD_LIST = "select * from BOARD order by seq desc";*/

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insertBoard(BoardVo vo) {
        String sql = "insert into BOARD (title, writer, content, category) values (" +
                "'" + vo.getTitle() + "'," +"'"+vo.getWriter()+"',"+"'"+vo.getContent()+"',"+"'"+vo.getCategory()+"')";
        return jdbcTemplate.update(sql);
    }

    public int deleteBoard(int seq) {
        String sql = "delete from BOARD where seq = " + seq;
        return jdbcTemplate.update(sql);
    }

    public int updateBoard(BoardVo vo) {
        String sql = "update BOARD set title='" +vo.getTitle() + "'," +
                " title='" + vo.getTitle() + "'," + " writer='" + vo.getWriter() + "'," +
                " content='" + vo.getContent() +"'," + " category='" + vo.getCategory() + "' where seq=" + vo.getSeq();
        return jdbcTemplate.update(sql);
    }

    public BoardVo getBoard(int seq) {
        String sql = "select * from BOARD where seq=" +seq;
        return jdbcTemplate.queryForObject(sql,new BoardRowMapper());
    }

    public List<BoardVo> getBoardList() {
        String sql = "select * from BOARD order by regdate desc";
        return jdbcTemplate.query(sql, new BoardRowMapper());
    }

    class BoardRowMapper implements RowMapper<BoardVo> {
        @Override
        public BoardVo mapRow(ResultSet rs, int rowNum) throws SQLException {
            BoardVo vo = new BoardVo();
            vo.setSeq(rs.getInt("seq"));
            vo.setCategory(rs.getString("category"));
            vo.setTitle(rs.getString("title"));
            vo.setContent(rs.getString("content"));
            vo.setWriter(rs.getString("writer"));
            vo.setRegdate(rs.getDate("regdate"));
            return vo;
        }
    }
}