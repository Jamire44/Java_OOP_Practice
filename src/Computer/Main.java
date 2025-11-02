package Computer;

class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        CPU cpu = computer.getCPU();
        cpu.processData();
    }
}