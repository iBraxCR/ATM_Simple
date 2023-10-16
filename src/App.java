import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaración de variables
        int saldo = 1000;
        int retirar, depositar, op;
        String nombre;

        // Solicitar el nombre del usuario
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");

        // Mostrar mensaje de bienvenida con el saldo actual
        JOptionPane.showMessageDialog(null, "Bienvenido: " + nombre + ", Su saldo actual es de: " + saldo);

        // Solicitar la operación que desea realizar
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué operación desea realizar?\n"
                + "Para Retirar, ingrese 1\n"
                + "Para Depositar, ingrese 2\n"
                + "Para salir, ingrese 3"));

        // Realizar la operación seleccionada
        switch (op) {
            case 1: // Operación de retiro
                retirar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto a retirar"));

                // Verificar si el saldo es suficiente para el retiro
                if (retirar > saldo) {
                    JOptionPane.showMessageDialog(null, "El monto ingresado no está disponible en su cuenta");
                } else {
                    saldo = saldo - retirar;
                    JOptionPane.showMessageDialog(null, "Operación exitosa! Su saldo actual es de: " + saldo);
                }
                break;

            case 2: // Operación de depósito
                depositar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto a depositar"));
                saldo = saldo + depositar;
                JOptionPane.showMessageDialog(null, "Saldo actual: " + saldo);
                break;

            case 3: // Salir del programa
                JOptionPane.showMessageDialog(null, "Gracias por usar este sistema");
                System.exit(0);
                break;
        }
    }
}
