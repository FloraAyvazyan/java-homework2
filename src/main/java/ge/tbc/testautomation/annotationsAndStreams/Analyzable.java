package ge.tbc.testautomation.annotationsAndStreams;

import java.awt.*;

//4) ამ პაკეტშივე შექმენით Analyzable კლასი და აქ მოიფიქრეთ
// 10-15 სხვადასხვა ტიპის ცვლადი. თითოეულს თავზე დააწერეთ VariableNameAnnotation

//და თითოეულ name ველში გადაეცით ცვლადის სახელი,
// მაგრამ პირველი ასო დიდი გახადეთ. ერთი ცვლადის ანოტაციაში არ გადასცეთ name, და ერთშიც
//რამე სხვა ჩაწერეთ, გარდა ცვლადის სახელისა.
public class Analyzable {
    @VariableNameAnnotation //default მნიშცნელოვბაა
    private byte byteVariable;

    @VariableNameAnnotation(name = "DifferentName")  // სხვა სახელით
    private short shortVariable;

    @VariableNameAnnotation(name = "IntVariable")
    private int intVariable;

    @VariableNameAnnotation(name = "DoubleVariable")
    private double doubleVariable;

    @VariableNameAnnotation(name = "StringVariable")
    private String stringVariable;

    @VariableNameAnnotation(name = "FloatVariable")
    private float floatVariable;

    @VariableNameAnnotation(name = "LongVariable")
    private long longVariable;

    @VariableNameAnnotation(name = "BoolVariable")
    private boolean boolVariable;

    @VariableNameAnnotation(name = "CharVariable")
    private char charVariable;

    @VariableNameAnnotation(name = "IntegerVariable")
    private Integer integerVariable;


}
