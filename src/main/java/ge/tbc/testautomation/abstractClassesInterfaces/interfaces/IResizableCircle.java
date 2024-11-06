package ge.tbc.testautomation.abstractClassesInterfaces.interfaces;

import ge.tbc.testautomation.javaoop.figures.Circle;

//abstractClassesInterfaces-ში შექმენით interfaces
// პაკეტი და მანდ შექმენით ინტერფეისი IResizableCircle და გაწერეთ 2 მეთოდის სიგნატურა:
//* Circle returnDoubleSizedCircle(Circle circle);
//* Circle returnCustomSizedCircle(Circle circle, double byvValue);

public interface IResizableCircle {
    Circle returnDoubleSizedCircle(Circle circle);
    Circle returnCustomSizedCircle(Circle circle, double byvValue);
}
