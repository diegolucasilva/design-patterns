package com.dls.structural.flyweight;

/*
can be recognized by a creation method that returns
cached objects instead of creating new.
You can implement shared leaf nodes of the Composite tree as Flyweights
to save some RAM.

Flyweight X Singleton
1 - There should be only one Singleton instance, whereas a Flyweight class
can have multiple instances with different intrinsic states.
2 - The Singleton object can be mutable. Flyweight objects are immutable.

EX:
java.lang.Integer#valueOf(int)
(also Boolean, Byte, Character, Short, Long and BigDecimal)

EX:
In this example, we’re going to render a forest (1.000.000 trees)!
Each tree will be represented by its own object that has some state
(coordinates, texture and so on). Although the program does its primary job,
naturally, it consumes a lot of RAM.

The reason is simple: too many tree objects contain duplicate data
(name, texture, color). That’s why we can apply the Flyweight pattern
 and store these values inside separate flyweight objects
(the TreeType class). Now, instead of storing the same data
in thousands of Tree objects, we’re going to reference one of the
flyweight objects with a particular set of values.

The client code isn’t going to notice anything since the complexity of
reusing flyweight objects is buried inside a flyweight factory.
 */


import com.dls.structural.flyweight.forest.Forest;

import java.awt.*;

public class Main {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 10000000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        createForest();
        metrics();
    }

    private static void createForest() {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);
    }

    private static void metrics() {
        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}