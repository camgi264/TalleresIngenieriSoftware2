// Interfaz Command
interface Command {
    void execute();
}

// Clases receptoras
class Computador {
    public void encender() {
        System.out.println("ENCENDIENDO EL COMPUTADOR");
    }

    public void reiniciar() {
        System.out.println("REINICIANDO EL COMPUTADOR");
    }

    public void suspender() {
        System.out.println("SUSPENDIENDO EL COMPUTADOR");
    }

    public void apagar() {
        System.out.println("APAGANDO EL COMPUTADOR");
    }
}

class Celular {
    public void encender() {
        System.out.println("ENCENDIENDO EL CELULAR");
    }

    public void reiniciar() {
        System.out.println("REINICIANDO EL CELULAR");
    }

    public void suspender() {
        System.out.println("SUSPENDIENDO EL CELULAR");
    }

    public void apagar() {
        System.out.println("APAGANDO EL CELULAR");
    }
}

// Implementaciones de comandos específicos
class EncenderComputadorCommand implements Command {
    private Computador computador;

    public EncenderComputadorCommand(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void execute() {
        computador.encender();
    }
}

class ReiniciarComputadorCommand implements Command {
    private Computador computador;

    public ReiniciarComputadorCommand(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void execute() {
        computador.reiniciar();
    }
}

class EncenderCelularCommand implements Command {
    private Celular celular;

    public EncenderCelularCommand(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.encender();
    }
}

class ApagarCelularCommand implements Command {
    private Celular celular;

    public ApagarCelularCommand(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.apagar();
    }
}

// Invocador
class ControlRemoto {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void ejecutarAccion() {
        if (command != null) {
            command.execute();
        }
    }
}


public class CommandPatternExample {
    public static void main(String[] args) {
        
        Computador computador = new Computador();
        Celular celular = new Celular();

        
        Command encenderComputador = new EncenderComputadorCommand(computador);
        Command reiniciarComputador = new ReiniciarComputadorCommand(computador);
        Command encenderCelular = new EncenderCelularCommand(celular);
        Command apagarCelular = new ApagarCelularCommand(celular);

        
        ControlRemoto control = new ControlRemoto();

        
        control.setCommand(encenderComputador);
        control.ejecutarAccion();

        control.setCommand(reiniciarComputador);
        control.ejecutarAccion();

        control.setCommand(encenderCelular);
        control.ejecutarAccion();

        control.setCommand(apagarCelular);
        control.ejecutarAccion();
    }
}

