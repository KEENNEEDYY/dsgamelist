package com.desenvolvedorkennedy.dsgamelist.projections;

public interface GameMinProjection {
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Long getPosition();
}
