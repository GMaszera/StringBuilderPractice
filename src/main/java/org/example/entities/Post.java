package org.example.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comentarios> comentarios = new ArrayList<>();

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public List<Comentarios> getComentarios() {
        return comentarios;
    }

    public Integer getLikes() {
        return likes;
    }

    public void adicionarComentario(Comentarios comentario) {
        comentarios.add(comentario);
    }

    public void removerComentario(Comentarios comentario) {
        comentarios.remove(comentario);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append("Likes: " + likes + " - " + moment + "\n");
        sb.append(content + "\n");
        sb.append("Comentários:" + "\n");
        for (Comentarios c : comentarios) {
            sb.append(c.getText() + "\n");
        }
        return sb.toString();

    }

}
