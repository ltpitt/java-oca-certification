
public interface Herbivore {

    default void eatPlants() {
        System.out.println("Eating plants");
    }

//    default int getRequiredPlantAmount();
//    public int getRequiredPlanAmount() {
//        return;
//    }
}
