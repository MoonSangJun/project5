//package com.example;
//
//import java.util.Date;
//
//public class BoardVo {
//    private int seq;
//    private String purpose;
//    private String nickname;
//    private String duedate;
//    private String personnel;
//    private String apply;
//    private String introduce;
//    private String inquire;
//    private String manager;
//    private String qualifications;
//    private String interview;
//    private String image;
//    private int cnt;
//
//
//
//    public int getSeq() {
//        return seq;
//    }
//
//    public void setSeq(int seq) {
//        this.seq = seq;
//    }
//
//    public String getPurpose() {
//        return purpose;
//    }
//
//    public void setPurpose(String purpose) {
//        this.purpose = purpose;
//    }
//
//    public String getName() {
//        return nickname;
//    }
//
//    public void setName(String nickname) {
//        this.nickname = nickname;
//    }
//
//    public String getDate() {
//        return duedate;
//    }
//
//    public void setDate(String date) {
//        this.duedate = duedate;
//    }
//
//    public String getNumber() {
//        return personnel;
//    }
//
//    public void setNumber(String personnel) {
//        this.personnel = personnel;
//    }
//
//    public String getApply() {
//        return apply;
//    }
//
//    public void setApply(String apply) {
//        this.apply = apply;
//    }
//
//    public String getIntroduce() {
//        return introduce;
//    }
//
//    public void setIntroduce(String introduce) {
//        this.introduce = introduce;
//    }
//
//    public String getInquire() {
//        return inquire;
//    }
//
//    public void setInquire(String inquire) {
//        this.inquire = inquire;
//    }
//
//    public String getManager() {
//        return manager;
//    }
//
//    public void setManager(String manager) {
//        this.manager = manager;
//    }
//
//    public String getQualifications() {
//        return qualifications;
//    }
//
//    public void setQualifications(String qualifications) {
//        this.qualifications = qualifications;
//    }
//
//    public String getInterview() {
//        return interview;
//    }
//
//    public void setInterview(String interview) {
//        this.interview = interview;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    public int getCnt() {
//        return cnt;
//    }
//
//    public void setCnt(int cnt) {
//        this.cnt = cnt;
//    }
//
//
//
//
//
//}

package com.example;

import java.util.Date;

public class BoardVo {
    private int seq;
    private String title;
    private String category;
    private String writer;
    private String content;
    private Date regdate;
    private int cnt;


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSeq() {
        return seq;
    }
    public void setSeq(int seq) {
        this.seq = seq;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getRegdate() {
        return regdate;
    }
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }
    public int getCnt() {
        return cnt;
    }
    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}