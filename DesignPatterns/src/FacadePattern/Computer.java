package FacadePattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/16.
 */
public class Computer {

    private final CPU cpu;
    private final Memory memory;
    private final Disk disk;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }
    public void startup(){
        Utils.showStr("start the computer");
        cpu.startup();
        memory.startup();
        disk.startup();
        Utils.showStr("start the computer finished");
    }

    public void shutdown(){
        Utils.showStr("shutdown the computer");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        Utils.showStr("shutdown the computer finished");
    }
}
