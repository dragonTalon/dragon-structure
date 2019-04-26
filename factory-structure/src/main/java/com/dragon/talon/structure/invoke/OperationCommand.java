package com.dragon.talon.structure.invoke;


public class OperationCommand extends Command {
    private Receiver receiver;

    public OperationCommand(Receiver _receiver) {
        this.receiver = _receiver;
    }

    @Override
    public void excute() {
        System.out.println("执行操作");
        receiver.dosomething();
    }
}
