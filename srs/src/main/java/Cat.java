public class Cat extends Animal implements IPet {


    public Cat(String name) {
        super(name);
    }



    public String crasses() {
        return "Miau mIAU";
    }

    @Override
    public boolean roll() {
        return true;
    }

    @Override
    public String sayLoveYourMaster(String masterName) {
        return null;
    }

    @Override
    public String greeting() {
        return "Miau mIAU";
    }
}
