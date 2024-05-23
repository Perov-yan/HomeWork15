public class Hufflepuff extends Hogwarts {

    private String name;
    private int magicPower;
    private int distanceTransgression;
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magicPower, int distanceTransgression, int nobility, int honor,
                      int bravery, int hardworking, int loyal, int honest, int smart, int wise, int witty,
                      int creative, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(name, magicPower, distanceTransgression, nobility, honor, bravery, hardworking, loyal, honest, smart,
                wise, witty, creative, cunning, determination, ambition, resourcefulness, power);
        this.name = name;
        if (magicPower > 0 & magicPower <= 100){
            this.magicPower = magicPower;
        }
        if (distanceTransgression > 0 & distanceTransgression <= 100){
            this.distanceTransgression = distanceTransgression;
        }
        if (hardworking > 0 & hardworking <= 100) {
            this.hardworking = hardworking;
        }
        if (loyal > 0 & loyal <= 100){
            this.loyal = loyal;
        }
        if (honest > 0 & honest <= 100) {
            this.honest = honest;
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
    public int getHardworking() {
        return hardworking;
    }

    @Override
    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    @Override
    public int getLoyal() {
        return loyal;
    }

    @Override
    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    @Override
    public int getHonest() {
        return honest;
    }

    @Override
    public void setHonest(int honest) {
        this.honest = honest;
    }
}
