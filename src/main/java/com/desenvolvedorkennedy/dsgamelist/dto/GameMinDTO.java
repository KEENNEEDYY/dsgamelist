package com.desenvolvedorkennedy.dsgamelist.dto;

import com.desenvolvedorkennedy.dsgamelist.entities.Game;
import com.desenvolvedorkennedy.dsgamelist.projections.GameMinProjection;

public class GameMinDTO {
    
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;


    public GameMinDTO() {
    }

    public GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getYear() {
        return this.year;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }
}
