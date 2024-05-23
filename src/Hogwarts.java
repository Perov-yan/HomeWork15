public class Hogwarts {

    // all students
    private String name;
    private int magicPower; // Магическая сила
    private int distanceTransgression; //  Расстояние трансгрессии
    // Gryffindors
    private int nobility; // благородство
    private int honor; // честь
    private int bravery; // храбрость
    // Hufflepuff
    private int hardworking; // трудолюбие
    private int loyal; // верность
    private int honest; // честность
    // Ravenclaw
    private int smart; // ум
    private int wise; // мудрость
    private int witty; // остроумие
    private int creative; // творчество
    // Slytherin
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; //находчивость
    private int power; // власть

    public Hogwarts(String name, int magicPower, int distanceTransgression, int nobility, int honor, int bravery,
                    int hardworking, int loyal, int honest, int smart, int wise, int witty, int creative, int cunning,
                    int determination, int ambition, int resourcefulness, int power) {
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
        if (hardworking > 0 & hardworking <= 100) {
            this.hardworking = hardworking;
        }
        if (loyal > 0 & loyal <= 100){
            this.loyal = loyal;
        }
        if (honest > 0 & honest <= 100) {
            this.honest = honest;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        this.distanceTransgression = distanceTransgression;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
