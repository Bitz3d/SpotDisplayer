package pl.rafalab.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.rafalab.repositories.SpotPointF54Repository;
import pl.rafalab.repositories.SpotPointF55Repository;
import pl.rafalab.repositories.SpotPointF56Repository;

@Component
public class SpotPointWorker {


    @Autowired
    SpotPointF54Repository spotPointF54Repository;

    @Autowired
    SpotPointF55Repository spotPointF55Repository;


    @Autowired
    SpotPointF56Repository spotPointF56Repository;

    @Autowired
    SpotPointF54 spotPointF54;

    @Autowired
    SpotPointF55 spotPointF55;

    @Autowired
    SpotPointF56 spotPointF56;

    public void spotPointRetriver(String robTarget) {


        if (robTarget.contains("lsp")) {

            String[] split = robTarget.split(":=");

            String firstPartOfRontarget = split[0];
            String secondPartOfRobtarget = split[1];

            String spotName = firstPartOfRontarget.toLowerCase().replaceAll("const| |robtarget", "");


            System.out.println(spotName);

            if (spotName.endsWith("_f54")) {



               String[] f54clearRobXYZPositionsTab = soptSetter(secondPartOfRobtarget);

                String f54robXPositions = f54clearRobXYZPositionsTab[0];
                String f54robYPositions = f54clearRobXYZPositionsTab[1];
                String f54robZPositions = f54clearRobXYZPositionsTab[2];

                spotPointF54 = new SpotPointF54(spotName, Double.parseDouble(f54robXPositions),Double.parseDouble(f54robYPositions),Double.parseDouble(f54robZPositions));
                spotPointF54Repository.save(spotPointF54);

            }
            if (spotName.endsWith("_f55")) {

                String[] f55clearRobXYZPositionsTab = soptSetter(secondPartOfRobtarget);

                String f55robXPositions = f55clearRobXYZPositionsTab[0];
                String f55robYPositions = f55clearRobXYZPositionsTab[1];
                String f55robZPositions = f55clearRobXYZPositionsTab[2];
                spotPointF55 = new SpotPointF55(spotName, Double.parseDouble(f55robXPositions),Double.parseDouble(f55robYPositions),Double.parseDouble(f55robZPositions));
                spotPointF55Repository.save(spotPointF55);

            }
            if (spotName.endsWith("_f56")) {

                String[] f56clearRobXYZPositionsTab = soptSetter(secondPartOfRobtarget);

                String f56robXPositions = f56clearRobXYZPositionsTab[0];
                String f56robYPositions = f56clearRobXYZPositionsTab[1];
                String f56robZPositions = f56clearRobXYZPositionsTab[2];
                spotPointF56 = new SpotPointF56(spotName, Double.parseDouble(f56robXPositions),Double.parseDouble(f56robYPositions),Double.parseDouble(f56robZPositions));
                spotPointF56Repository.save(spotPointF56);

            } else {
                System.out.println("Not a spot point");
            }


        }


    }

    private String[] soptSetter(String secondPartOfRobtarget) {

        String[] spotsLocations = secondPartOfRobtarget.split("\\],\\[");

        String robXYZPositions = spotsLocations[0];


        String clearRobXYZPositions = robXYZPositions.replaceAll("\\[\\[", "");

        String[] clearRobXYZPositionsTab = clearRobXYZPositions.split(",");

        return clearRobXYZPositionsTab;

    }


}