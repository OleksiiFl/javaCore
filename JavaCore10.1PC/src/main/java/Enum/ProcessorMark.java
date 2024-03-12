package Enum;

public enum ProcessorMark {
    INTEL3("Intel i3"), INTEL5("Intel i5"), INTEL7("Intel i7");
    private String mark;
    ProcessorMark(String mark) {
        this.mark = mark;
    }
    public String getProcMark() {
        return mark;
    }
}
