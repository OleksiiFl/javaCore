package Enum;

public enum KeyboardLighting {
    ON("with lighting"), OFF("without lighting");
    private String lighting;
    KeyboardLighting(String lighting) {
        this.lighting = lighting;
    }
    public String getKeyboardLighting() {
        return lighting;
    }
}
