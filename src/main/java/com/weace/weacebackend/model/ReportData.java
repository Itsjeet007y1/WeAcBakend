package com.weace.weacebackend.model;

public class ReportData {

    double ans1;
    double ans2;
    double ans3;
    double ans4;
    double ans5;
    double ans6;
    double satisfactionIndex;

    public double getAns1() {
        return ans1;
    }

    public void setAns1(double ans1) {
        this.ans1 = ans1;
    }

    public double getAns2() {
        return ans2;
    }

    public void setAns2(double ans2) {
        this.ans2 = ans2;
    }

    public double getAns3() {
        return ans3;
    }

    public void setAns3(double ans3) {
        this.ans3 = ans3;
    }

    public double getAns4() {
        return ans4;
    }

    public void setAns4(double ans4) {
        this.ans4 = ans4;
    }

    public double getAns5() {
        return ans5;
    }

    public void setAns5(double ans5) {
        this.ans5 = ans5;
    }

    public double getAns6() {
        return ans6;
    }

    public void setAns6(double ans6) {
        this.ans6 = ans6;
    }

    public double getSatisfactionIndex() {
        return satisfactionIndex;
    }

    public void setSatisfactionIndex(double satisfactionIndex) {
        this.satisfactionIndex = satisfactionIndex;
    }

    @Override
    public String toString() {
        return "ReportData{" +
                "ans1=" + ans1 +
                ", ans2=" + ans2 +
                ", ans3=" + ans3 +
                ", ans4=" + ans4 +
                ", ans5=" + ans5 +
                ", ans6=" + ans6 +
                ", satisfactionIndex=" + satisfactionIndex +
                '}';
    }
}
