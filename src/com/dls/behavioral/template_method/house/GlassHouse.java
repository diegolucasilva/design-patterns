package com.dls.behavioral.template_method.house;

import com.dls.behavioral.template_method.template.HouseTemplate;

public class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }

}
