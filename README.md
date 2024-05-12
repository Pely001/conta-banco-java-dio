Introdução de uma classe Transação: Uma nova classe Transacao foi introduzida para representar transações individuais. Cada transação contém informações como o tipo de transação (depósito, saque, transferência), o valor da transação, a data e hora em que ocorreu e uma descrição adicional, se necessário.

Rastreamento de transações: A classe Conta foi atualizada para rastrear todas as transações associadas a uma conta. Toda vez que uma operação (depósito, saque, transferência) é realizada, uma nova instância de Transacao é criada e adicionada à lista de transações da conta.

Enumeração para tipos de transação: Uma enumeração TipoTransacao foi introduzida para representar os diferentes tipos de transações possíveis, como depósito, saque e transferência.

Consulta de histórico de transações: Foi adicionado um método à classe Conta para permitir a consulta do histórico completo de transações associadas à conta. Isso oferece aos clientes e ao sistema a capacidade de visualizar todas as atividades financeiras realizadas em uma conta ao longo do tempo.

Essas melhorias proporcionam uma funcionalidade mais robusta e informativa ao sistema bancário, permitindo um melhor rastreamento e gerenciamento das transações financeiras dos clientes.
