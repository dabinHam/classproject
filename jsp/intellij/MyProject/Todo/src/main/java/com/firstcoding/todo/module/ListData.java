package com.firstcoding.todo.module;

public class ListData {

    private String todo;
    private String date;
    private String prStt;

    public ListData() {
    }

    public ListData(String todo, String date, String prStt) {
        this.todo = todo;
        this.date = date;
        this.prStt = prStt;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrStt() {
        return prStt;
    }

    public void setPrStt(String prStt) {
        this.prStt = prStt;
    }

    @Override
    public String toString() {
        return "ListData{" +
                "todo='" + todo + '\'' +
                ", date='" + date + '\'' +
                ", prStt='" + prStt + '\'' +
                '}';
    }
}
