package Command;

public class SkinCareApplication {
    public static void main(String[] args) {
        AppointmentManager manager = new AppointmentManager();

        Command addCommand1 = new AddAppointmentCommand(manager, "Karina Teslenko - Skin Analysis - 2024-12-15 10:00");
        Command addCommand2 = new AddAppointmentCommand(manager, "Karina Teslenko - Facial Treatment - 2024-12-16 14:00");
        Command removeCommand = new RemoveAppointmentCommand(manager, "Karina Teslenko - Skin Analysis - 2024-12-15 10:00");

        CommandInvoker invoker = new CommandInvoker();

        invoker.executeCommand(addCommand1);
        invoker.executeCommand(addCommand2);

        invoker.undoLastCommand();

        invoker.executeCommand(removeCommand);

        invoker.undoLastCommand();
    }
}