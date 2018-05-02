/*
 * MainModel.java
 * ============
 * A class to define 2 Line classes as member variables and return intersection point
 *  AUTHOR: SEUNG CHAN KIM (kimseu@sheridancollege.ca)
 * CREATED: 2018-04-10
 * UPDATED: 2018-04-20
 */
package chan;

import song.*;

public class MainModel {
    
    // member vars
    private Line line1;
    private Line line2;

    // ctors
    public MainModel() {
        line1 = new Line(0, 0, 0, 0);
        line2 = new Line(0, 0, 0, 0);
    }

    // setter
    public void setLine1(float x1, float y1, float x2, float y2) {
        this.line1.set(x1, y1, x2, y2);
    }
 
    public void setLine2(float x1, float y1, float x2, float y2) {
        this.line2.set(x1, y1, x2, y2);
    }
    
    // getter for intersection point between 2 lines
    public Vector2 getIntersectPoint() {
        Vector2 intersect = line1.intersect(line2);
        return intersect;
    }
}
