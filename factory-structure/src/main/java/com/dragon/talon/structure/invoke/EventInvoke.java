package com.dragon.talon.structure.invoke;

/**
 * 命令模式
 * 优点
 * ● 类间解耦
 * 调用者角色与接收者角色之间没有任何依赖关系，调用者实现功能时只需调用Command抽象类的execute方法就可以，不需要了解到底是哪个接收者执行。
 * ● 可扩展性
 * Command的子类可以非常容易地扩展，而调用者Invoker和高层次的模块Client不产生严重的代码耦合。
 * ● 命令模式结合其他模式会更优秀
 * 命令模式可以结合责任链模式，实现命令族解析任务；结合模板方法模式，则可以减少Command子类的膨胀问题。
 * @author dragonboy 
 */
public class EventInvoke {

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void active() {
        command.excute();
    }

    public static void main(String[] args) {
       EventInvoke invoke = new EventInvoke();
       Receiver receiver = new AddReceiver();
       Command command = new OperationCommand(receiver);
       invoke.setCommand(command);
       invoke.active();
    }
}
