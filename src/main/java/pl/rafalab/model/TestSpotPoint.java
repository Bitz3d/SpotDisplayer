package pl.rafalab.model;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TestSpotPoint {



    private Long id;

    private String spotName;


    private double pointX;


    private double pointY;


    private double pointZ;


    private String robName;

    private String line;


    private List<TestSpotPoint> testSpotPointsList = new ArrayList<>();



    public TestSpotPoint() {
    }

    public TestSpotPoint(String spotName, double pointX, double pointY, double pointZ, String robName, String line) {
        this.spotName = spotName;
        this.pointX = pointX;
        this.pointY = pointY;
        this.pointZ = pointZ;
        this.robName = robName;
        this.line = line;
    }

    public List<TestSpotPoint> getTestSpotPointsList() {

        TestSpotPoint testSpotPoint = new TestSpotPoint("lsp1",2884.51,473.38,1006.16,"04r02","2.1");
        TestSpotPoint testSpotPoint1 = new TestSpotPoint("lsp2",2885.58,473.06,980.21,"04r02","2.1");
        TestSpotPoint testSpotPoint2 = new TestSpotPoint("lsp3",2932.72,554.94,871.46,"04r02","2.1");
        TestSpotPoint testSpotPoint3 = new TestSpotPoint("lsp4",2954.87,569.96,833.2,"04r02","2.1");
        TestSpotPoint testSpotPoint4 = new TestSpotPoint("lsp5",3160.84,556.13,326.57,"04r02","2.1");
        TestSpotPoint testSpotPoint5 = new TestSpotPoint("lsp6",2867.04,680.33,662.29,"04r02","2.1");

        testSpotPointsList.add(testSpotPoint);
        testSpotPointsList.add(testSpotPoint1);
        testSpotPointsList.add(testSpotPoint2);
        testSpotPointsList.add(testSpotPoint3);
        testSpotPointsList.add(testSpotPoint4);
        testSpotPointsList.add(testSpotPoint5);

        return testSpotPointsList;
    }

    public String getRobName() {
        return robName;
    }

    public void setRobName(String robName) {
        this.robName = robName;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpotName() {
        return spotName;
    }

    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double getPointZ() {
        return pointZ;
    }

    public void setPointZ(double pointZ) {
        this.pointZ = pointZ;
    }

    @Override
    public String toString() {
        return "Id:" +id+" Spot Name: "+spotName+" Point x: "+ pointX+" Point y: "+ pointY+" Point z: "+ pointY;
    }




}
