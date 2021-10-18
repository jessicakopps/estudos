// Exercício
// Reimplemente a seguinte instrução usando uma lambda como a rotina de tratamento de evento:

package Teoria.DesenvolvimentoAvançado.Lambda;

public class Lambda4 {
  public static void main(String[] args) {

// button.addActionListener(
// new ActionListener()
// {
// public void actionPerformed(ActionEvent event)
// {
// JOptionPane.showMessageDialog(ParentFrame.this,
// "JButton event handler");
// }
// }
// );

button.addActionListener( (e) -> {
  System.out.println("O botão foi pressionado, e o código
  executado utiliza uma função lambda!");
});