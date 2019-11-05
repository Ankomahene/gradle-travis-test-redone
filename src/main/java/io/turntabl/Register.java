package io.turntabl;

import java.util.*;
import java.util.stream.Collectors;

public class Register {
    private List<Client> clients;

    public Register(List<Client> clients) {
        this.clients = clients;
    }

    public List<String> getNamesOfGoldClients(){
        return this.clients.stream()
                .filter(client -> client.getServiceLevel() == Level.Gold)
                .map(Client::getName)
                .collect(Collectors.toList());
    }

    public Optional<String> getClientNameById(int id){
        return this.clients.stream()
                .filter(c -> c.getId() == id)
                .map(Client::getName)
                .findFirst();

    }

    public String countClientsAtEveryServiceLevel(){
        Map<Level, Integer> c = new HashMap<>();

        for (Client client : clients){
            Integer j = c.get(client);
            c.put(client.getServiceLevel(), (j==null) ? 1 : j + 1);
        }
        for (Map.Entry<Level, Integer> val : c.entrySet()){
            return (""+  val.getKey() + " - " + val.getValue());
        }

        return null;
    }

}
