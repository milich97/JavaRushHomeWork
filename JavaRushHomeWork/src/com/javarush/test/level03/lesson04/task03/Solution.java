package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution {
    public static void main(String[] args) {
        Zerg z1 = new Zerg();
        z1.name="1";
        Zerg z2 = new Zerg();
        z2.name="2";
        Zerg z3 = new Zerg();
        Zerg z4 = new Zerg();
        Zerg z5 = new Zerg();
        Zerg z6 = new Zerg();
        Zerg z7 = new Zerg();
        Zerg z8 = new Zerg();
        Zerg z9 = new Zerg();
        Zerg z10 = new Zerg();
        z3.name="3";
        z4.name="4";
        z5.name="5";
        z6.name="6";
        z7.name="7";
        z8.name="8";
        z9.name="9";
        z10.name="10";
        Protos p1 = new Protos();
        Protos p2 = new Protos();
        Protos p3 = new Protos();
        Protos p4 = new Protos();
        Protos p5 = new Protos();
        p1.name="11";
        p2.name="12";
        p3.name="13";
        p4.name="14";
        p5.name="15";
        Terran q=new Terran();
        Terran  w=new Terran();
        Terran  e=new Terran();
        Terran r =new Terran();
        Terran t =new Terran();
        Terran y =new Terran();
        Terran  u=new Terran();
        Terran  i=new Terran();
        Terran  o=new Terran();
        Terran oo =new Terran();
        Terran oi =new Terran();
        Terran ui =new Terran();
        q.name="111";
        w.name="1121";
        e.name="1131";
        r.name="1141";
        t.name="1151";
        y.name="1161";
        u.name="1171";
        i.name="1181";
        o.name="1191";
        oo.name="11111";
        oi.name="11112";
        ui.name="11311";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protos {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}