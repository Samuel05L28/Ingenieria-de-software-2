//Aplicando el patron Command

interface Comando {
    void ejecutar();
}

class Computador {
    public void encender() {
        System.out.println("Encendiendo el computador");
    }
    public void reiniciar() {
        System.out.println("Reiniciando el computador");
    }
    public void suspender() {
        System.out.println("Suspendiendo el computador");
    }
    public void apagar() {
        System.out.println("Apagando el computador");
    }
}

class Celular {
    public void encender() {
        System.out.println("Encendiendo el celular");
    }
    public void reiniciar() {
        System.out.println("Reiniciando el celular");
    }
    public void suspender() {
        System.out.println("Suspendiendo el celular");
    }
    public void apagar() {
        System.out.println("Apagando el celular");
    }
}

class EncenderComputadorComando implements Comando {
    private Computador computador;

    public EncenderComputadorComando(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
        computador.encender();
    }
}

class ReiniciarComputadorComando implements Comando {
    private Computador computador;

    public ReiniciarComputadorComando(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
        computador.reiniciar();
    }
}

class SuspenderComputadorComando implements Comando {
    private Computador computador;

    public SuspenderComputadorComando(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
        computador.suspender();
    }
}

class ApagarComputadorComando implements Comando {
    private Computador computador;

    public ApagarComputadorComando(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
        computador.apagar();
    }
}

class EncenderCelularComando implements Comando {
    private Celular celular;

    public EncenderCelularComando(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
        celular.encender();
    }
}

class ReiniciarCelularComando implements Comando {
    private Celular celular;

    public ReiniciarCelularComando(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
        celular.reiniciar();
    }
}
class SuspenderCelularComando implements Comando {
    private Celular celular;

    public SuspenderCelularComando(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
        celular.suspender();
    }
}

class ApagarCelularComando implements Comando {
    private Celular celular;

    public ApagarCelularComando(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
        celular.apagar();
    }
}

class Controlador {
    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void ejecutarComando() {
        if (comando != null) {
            comando.ejecutar();
        } else {
            System.out.println("No se ha asignado ningún comando");
        }
    }
}


public class Quinta_Pregunta {
    public static void main(String[] args) {

        Computador computador = new Computador();
        Celular celular = new Celular();

        Comando encenderComputador = new EncenderComputadorComando(computador);
        Comando apagarComputador = new ApagarComputadorComando(computador);
        Comando suspenderComputador = new SuspenderComputadorComando(computador);
        Comando reiniciarComputador = new ReiniciarComputadorComando(computador);

        
        Comando encenderCelular = new EncenderCelularComando(celular);
        Comando apagarCelular = new ApagarCelularComando(celular);
        Comando suspenderCelular = new SuspenderCelularComando(celular);
        Comando reiniciarCelular = new ReiniciarCelularComando(celular);

        Controlador controlador = new Controlador();

        controlador.setComando(encenderComputador);
        controlador.ejecutarComando(); 
        controlador.setComando(apagarComputador);
        controlador.ejecutarComando(); 
        controlador.setComando(suspenderComputador);
        controlador.ejecutarComando(); 
        controlador.setComando(reiniciarComputador);
        controlador.ejecutarComando(); 

        System.out.println("<------------------------------------------------------------------------>");

        controlador.setComando(encenderCelular);
        controlador.ejecutarComando(); 
        controlador.setComando(apagarCelular);
        controlador.ejecutarComando(); 
        controlador.setComando(suspenderCelular);
        controlador.ejecutarComando(); 
        controlador.setComando(reiniciarCelular);
        controlador.ejecutarComando(); 
    }
}
