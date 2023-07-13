package com.desenvolvedorkennedy.dsgamelist.projections;

public interface GameMinProjection {
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Long getPosition();
}
