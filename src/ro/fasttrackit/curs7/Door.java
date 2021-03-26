package ro.fasttrackit.curs7;

public class Door {
    private boolean open;
    private boolean locked;

    public Door() {
        this.open = false;
        this.locked = true;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isLocked() {
        return locked;
    }

    public void open() {
        if (locked) {
            System.out.println("Usa este incuiata, nu poate fi deschisa");
        } else {
            this.open = true;
        }
    }

    public void close() {
        this.open = false;
    }

    public void lock() {
        if (open) {
            System.out.println("Usa este deschisa, nu poate fi inchisa");
        } else {
            this.locked = true;
        }
    }

    public void unlock() {
        this.locked = false;
    }

    @Override
    public String toString() {
        return "Door{" +
                "open=" + open +
                ", locked=" + locked +
                '}';
    }
}
