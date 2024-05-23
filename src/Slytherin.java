public class Slytherin extends Hogwarts {

    private String name;
    private int magicPower;
    private int distanceTransgression;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String name, int magicPower, int distanceTransgression, int nobility,
                     int honor, int bravery, int hardworking, int loyal, int honest, int smart,
                     int wise, int witty, int creative, int cunning, int determination, int ambition,
                     int resourcefulness, int power) {
        super(name, magicPower, distanceTransgression, nobility, honor, bravery, hardworking, loyal,
                honest, smart, wise, witty, creative, cunning, determination, ambition, resourcefulness, power);
        this.name = name;
        if (magicPower > 0 & magicPower <= 100){
            this.magicPower = magicPower;
        }
        if (distanceTransgression > 0 & distanceTransgression <= 100){
            this.distanceTransgression = distanceTransgression;
        }
        if (cunning > 0 & cunning <= 100){
            this.cunning = cunning;
        }
        if (determination > 0 & determination <= 100) {
            this.determination = determination;
        }
        if (ambition > 0 & ambition <= 100) {
            this.ambition = ambition;
        }
        if (resourcefulness > 0 & resourcefulness <= 100) {
            this.resourcefulness = resourcefulness;
        }
        if (power > 0 & power <= 100) {
            this.power = power;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMagicPower() {
        return magicPower;
    }

    @Override
    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    @Override
    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    @Override
    public void setDistanceTransgression(int distanceTransgression) {
        this.distanceTransgression = distanceTransgression;
    }

    @Override
    public int getCunning() {
        return cunning;
    }

    @Override
    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    @Override
    public int getDetermination() {
        return determination;
    }

    @Override
    public void setDetermination(int determination) {
        this.determination = determination;
    }

    @Override
    public int getAmbition() {
        return ambition;
    }

    @Override
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    @Override
    public int getResourcefulness() {
        return resourcefulness;
    }

    @Override
    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }
}
