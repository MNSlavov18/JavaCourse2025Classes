package university;

public enum ProgramType {
    // 240 120
    MAJOR(240), MINOR(120);

    private int programTypeCredits;

    ProgramType(int programTypeCredits) {
        this.programTypeCredits = programTypeCredits;
    }

    public int getProgramTypeCredits() {
        return programTypeCredits;
    }

    public void setProgramTypeCredits(int programTypeCredits) {
        this.programTypeCredits = programTypeCredits;
    }
}

