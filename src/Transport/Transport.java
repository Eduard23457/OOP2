package Transport;

import service.Serviceable;

public abstract class Transport implements Serviceable {

    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void service() {
        System.out.println("обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }


}
