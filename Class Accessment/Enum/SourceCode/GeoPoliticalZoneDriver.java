public class GeoPoliticalZoneDriver {
    public  static String checkForStateInZone(String state){
        String zoneFoundForState = "unknown state";
        for(GeoPoliticalZone zone : GeoPoliticalZone.values()) {
            for(String states : zone.getStates()){
                if(states.equalsIgnoreCase(state)){
                    zoneFoundForState = zone.name();
                    return zoneFoundForState;
                }

            }
        }
        return zoneFoundForState;
    }
}
