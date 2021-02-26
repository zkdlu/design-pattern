package creational;

import java.util.HashMap;
import java.util.Map;

public class PrototypePattern {
    public enum Type { 
        Circle, Rectangle
    }

    public abstract class Shape implements Cloneable {
        protected Type type;

        abstract void draw();

        @Override
        protected Object clone() {
            Object clone = null;
            try {
                clone = super.clone();
            } catch (RuntimeException e) {
                e.printStackTrace();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

            return clone;
        }
    }

    public class Circle extends Shape {
        public Circle() {
            this.type = Type.Circle;
        }
        @Override
        void draw() {
            System.out.println("Circle");
        }
    }

    public class ShapePrototype { 
        private Map<Type, Shape> shapeMap = new HashMap<>();

        public void registShape() {
            shapeMap.put(Type.Circle, new Circle());
        }

        public Shape getShape(Type type) {
            return (Shape) shapeMap.get(type).clone();
        }
    }

    public static void main(String[] args) {
        PrototypePattern p = new PrototypePattern();
        p.run();
    }

    public void run() {
        ShapePrototype p = new ShapePrototype();
        p.registShape();

        Circle circle = (Circle) p.getShape(Type.Circle);
        circle.draw();
    }
}
