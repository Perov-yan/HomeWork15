public class Ravenclaw extends Hogwarts {

    private String name;
    private int magicPower;
    private int distanceTransgression;
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, int magicPower, int distanceTransgression, int nobility, int honor,
                     int bravery, int hardworking, int loyal, int honest, int smart, int wise, int witty,
                     int creative, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(name, magicPower, distanceTransgression, nobility, honor, bravery, hardworking, loyal, honest, smart, wise, witty, creative, cunning, determination, ambition, resourcefulness, power);
        this.name = name;
        if (magicPower > 0 & magicPower <=100){
            this.magicPower = magicPower;
        }
        if (distanceTransgression > 0 & distanceTransgression <= 100){
            this.distanceTransgression = distanceTransgression;
        }
        if (smart > 0 & smart <=100){
            this.smart = smart;
        }
        if (wise > 0 & wise <= 100){
            this.wise = wise;
        }
        if (witty > 0 & witty <= 100){
            this.witty = witty;
        }
        if (creative > 0 & creative <= 100){
            this.creative = creative;
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
    public int getSmart() {
        return smart;
    }

    @Override
    public void setSmart(int smart) {
        this.smart = smart;
    }

    @Override
    public int getWise() {
        return wise;
    }

    @Override
    public void setWise(int wise) {
        this.wise = wise;
    }

    @Override
    public int getWitty() {
        return witty;
    }

    @Override
    public void setWitty(int witty) {
        this.witty = witty;
    }

    @Override
    public int getCreative() {
        return creative;
    }

    @Override
    public void setCreative(int creative) {
        this.creative = creative;
    }
}
