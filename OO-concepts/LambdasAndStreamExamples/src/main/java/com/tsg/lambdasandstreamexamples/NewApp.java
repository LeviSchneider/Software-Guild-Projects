/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.lambdasandstreamexamples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class NewApp {
    public static void main(String[] args)
    {
        List<Server> servers = new ArrayList<>();
        Server one = new Server();
        one.setName("web01");
        one.setIp("192.168.1.1");
        one.setMake("Dell");
        one.setRam("8GB");
        one.setNumProcessors("9");
        one.setPurchaseDate(LocalDate.parse("2012-01-01", DateTimeFormatter.ISO_DATE));
        
        servers.add(one);
        
        one = new Server();
        one.setName("db01");
        one.setIp("192.168.3.45");
        one.setMake("HP");
        one.setRam("16GB");
        one.setNumProcessors("24");
        one.setPurchaseDate(LocalDate.parse("2015-01-01", DateTimeFormatter.ISO_DATE));
        
        servers.add(one);
        
        one = new Server();
        one.setName("hr124");
        one.setIp("192.168.32.111");
        one.setMake("IBM");
        one.setRam("16GB");
        one.setNumProcessors("12");
        one.setPurchaseDate(LocalDate.parse("2016-01-01", DateTimeFormatter.ISO_DATE));
        
        servers.add(one);
        
        one = new Server();
        one.setName("eng16");
        one.setIp("192.168.32.56");
        one.setMake("HP");
        one.setRam("4GB");
        one.setNumProcessors("8");
        one.setPurchaseDate(LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_DATE));
        
        servers.add(one);
        
        one = new Server();
        one.setName("eng64");
        one.setIp("192.168.34.56");
        one.setMake("HP");
        one.setRam("8GB");
        one.setNumProcessors("16");
        one.setPurchaseDate(LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_DATE));
        
        servers.add(one);
        
        String make = "dElL";
        System.out.println("All " + make + " servers in inventory:");
        servers.stream()
                .filter(s -> s.getMake().equalsIgnoreCase(make))
                .forEach(e -> System.out.println(e.getName()));
        
        
        servers.stream()
                .filter(
                        (Server s) -> 
                        {
                            return s.getMake().equalsIgnoreCase(make);
                        })
                .forEach(e -> System.out.println(e.getName()));
        
        Predicate<Server> filterThis = (Server s) -> {return s.getMake().equalsIgnoreCase(make); };
        
        servers.stream()
                .filter(filterThis)
                .forEach(e -> System.out.println(e.getName()));
        
        
        long testAge = 3;
        
        System.out.println("All servers older than " + testAge + " years in inventory: ");
        
        servers.stream()
                .filter(s -> s.getServerAge() > testAge)
                .forEach(e -> System.out.println(e.getName()));
        
        List<Server> oldServers = servers.stream()
                .filter(s -> s.getServerAge() > testAge)
                .collect(Collectors.toList());
        
        System.out.println("Number of old servers: " + oldServers.size());
        
        oldServers.forEach(s -> System.out.println(s.getName()));
        
        servers.stream()
                .mapToLong(Server::getServerAge)
                .forEach(v -> System.out.println("Server age: " + v));
        
        double averageAge = servers.stream()
                .mapToLong(Server::getServerAge)
                .average()
                .getAsDouble();
        
        System.out.println("Average age of servers is " + averageAge + " years.");
        
        servers.stream()
                .sorted((Server a, Server b) -> 
                {
                    if(a.getServerAge() < b.getServerAge())
                    {
                        return -1;
                    }else if(a.getServerAge() == b.getServerAge())
                    {
                        return 0;
                    }else
                    {
                        return 1;
                    }
                }
                )
                .forEach(q -> System.out.println("Server " + q.getName() + " is " + q.getServerAge() + " years old"));
       
    }
}
