package com.nespresso.exercise.restaurant;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Restaurant {


    private Map<Table, Integer> tables;
    private List<String> preOrders;  
    
    public Restaurant(){
        tables = new LinkedHashMap<Table, Integer>();
        preOrders = new ArrayList<String>();
    }
    
    public int initTable(int numberOfCustomer) {
        tables.put(Factory.createTable(numberOfCustomer), numberOfCustomer);
        return tables.size() - 1;
    }

    public void customerSays(int tableId, String string) {

        Table table = getTableById(tableId);
        checkPreOrder(string);
        if(table.isNewCustomerToServe(Factory.getCustomer(string))){
            int unservedCustomers = tables.get(table) - 1;
            tables.put(table, unservedCustomers);
        }
            
        table.addCustomerRequest(string);
    }

    private void checkPreOrder(String string) {
        if(string.contains(" for ")){
            String preOrder = Factory.getOrder(string);
            if(preOrders.contains(preOrder))
                preOrders.remove(preOrders.indexOf(preOrder));
            else
                preOrders.add(preOrder);
        }
        
    }

    private Table getTableById(int tableId) {
        List<Table> listTables = new ArrayList<Table>(tables.keySet());
        Table table = listTables.get(tableId);
        return table;
    }

    public String createOrder(int tableId) {
        StringBuilder orders = new StringBuilder();
        Table table = getTableById(tableId);
        if(tables.get(table) > 0){
            orders.append("MISSING "+tables.get(table));
        }
        else if(preOrders.size() != 0){
            
            orders.append("MISSING "+preOrders.size()+" for ");
            for (String preOrder : preOrders) {
                orders.append(preOrder);
            }
        }        
        else{
            orders.append(getTableById(tableId).printOrders());
        }
        
        return orders.toString();
    }

}
