public class Gryffindor extends Hogwarts {

    private String name;
    private int magicPower;
    private int distanceTransgression;
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int distanceTransgression, int nobility, int honor, int bravery,
                      int hardworking, int loyal, int honest, int smart, int wise, int witty, int creative, int cunning,
                      int determination, int ambition, int resourcefulness, int power) {
        super(name, magicPower, distanceTransgression, nobility, honor, bravery, hardworking, loyal, honest, smart,
                wise, witty, creative, cunning, determination, ambition, resourcefulness, power);
        this.name = name;
        if (magicPower > 0 & magicPower <= 100){
            this.magicPower = magicPower;
        }
        if (distanceTransgression > 0 & distanceTransgression <= 100){
            this.distanceTransgression = distanceTransgression;
        }
        if (nobility > 0 & nobility <= 100){
            this.nobility = nobility;
        }
        if (honor > 0 & honor <= 100){
            this.honor = honor;
        }
        if (bravery > 0 & bravery <= 100) {
            this.bravery = bravery;
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
    public int getNobility() {
        return nobility;
    }

    @Override
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    @Override
    public int getHonor() {
        return honor;
    }

    @Override
    public void setHonor(int honor) {
        this.honor = honor;
    }

    @Override
    public int getBravery() {
        return bravery;
    }

    @Override
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
