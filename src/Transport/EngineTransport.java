package Transport;

public abstract class EngineTransport extends Transport {

    public EngineTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}
