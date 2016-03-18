/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.lambdasandstreamexamples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class LambDasOnMapsExample {
    public static void main(String[] args) {
        Map<String, Server> servers = new HashMap<>();
        Server one = new Server();
        one.setName("web01");
        one.setIp("192.168.1.1");
        one.setMake("Dell");
        one.setRam("8GB");
        one.setNumProcessors("9");
        one.setPurchaseDate(LocalDate.parse("2012-01-01", DateTimeFormatter.ISO_DATE));
        
        servers.put(one.getName(), one);
        
        one = new Server();
        one.setName("db01");
        one.setIp("192.168.3.45");
        one.setMake("HP");
        one.setRam("16GB");
        one.setNumProcessors("24");
        one.setPurchaseDate(LocalDate.parse("2015-01-01", DateTimeFormatter.ISO_DATE));
        
        servers.put(one.getName(), one);
        
        one = new Server();
        one.setName("hr124");
        one.setIp("192.168.32.111");
        one.setMake("IBM");
        one.setRam("16GB");
        one.setNumProcessors("12");
        one.setPurchaseDate(LocalDate.parse("2016-01-01", DateTimeFormatter.ISO_DATE));
        
        servers.put(one.getName(), one);
        
        one = new Server();
        one.setName("eng16");
        one.setIp("192.168.32.56");
        one.setMake("HP");
        one.setRam("4GB");
        one.setNumProcessors("8");
        one.setPurchaseDate(LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_DATE));
        
        servers.put(one.getName(), one);
        
        one = new Server();
        one.setName("eng64");
        one.setIp("192.168.34.56");
        one.setMake("HP");
        one.setRam("8GB");
        one.setNumProcessors("16");
        one.setPurchaseDate(LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_DATE));
        
        servers.put(one.getName(), one);
        
        String make = "hp";
        
        System.out.println("All " +  make + " servers in inventor");
        
        servers.values().stream()
                .filter(s -> s.getMake().equalsIgnoreCase(make))
                .forEach(e -> System.out.println(e.getName() + " is an HP server."));
        
        Collection<Server> newServers = servers.values().stream()
                .filter(s -> s.getServerAge() < 5)
                .collect(Collectors.toList());
        
        System.out.println("We have " + newServers.size() + " of newer servers in out inventory.");
        
        newServers.forEach(e -> System.out.println(e.getName()));
    }
}
