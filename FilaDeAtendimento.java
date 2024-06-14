// Desenvolver um sistema de atendimento para clientes em uma loja.
// Programa que simule a fila de atendimento, onde os clientes entram na fila e são atendidos um por um


import java.util.Random;

public class FilaDeAtendimento {
    public static void main(String[] args) {
        int n = 5; //tamanho da fila
        // gera um número aleatório para cada cliente:
        var random = new Random();
        int cliente = random.nextInt(101);
        // cria a fila:
        Queue queue = new Queue(cliente);
        System.out.println("Chegou o cliente " + cliente);
        //Simula a chegada dos clientes no laço for:
        for(int i = 2; i <= n; i++) {
            cliente = random.nextInt(101);
            System.out.println("Chegou o cliente " + cliente);
            queue.enqueue(cliente);
        }
        // Atendimento dos clientes 9até que a fila se encontre vazia)
        var node = queue.dequeue();
        while (node != null) {
            System.out.println("Atendido o cliente " + node.getValue());
            node = queue.dequeue();
        }
    }

}

