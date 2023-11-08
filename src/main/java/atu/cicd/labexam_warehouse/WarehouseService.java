package atu.cicd.labexam_warehouse;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WarehouseService {
    public ArrayList<WarehouseDetails> allWarehouses = new ArrayList<WarehouseDetails>();
    WarehouseDetails exampleWarehouse = new WarehouseDetails(201, "Location X", 100);

    public WarehouseDetails getWarehouseById(int warehouseId){
        allWarehouses.add(exampleWarehouse);
        for(int i = 0; i < allWarehouses.size(); i++){
            if(allWarehouses.get(i).getWarehouseId() == warehouseId){
                System.out.println("Warehouse found: " + allWarehouses.get(i));
                return allWarehouses.get(i);
            }
        }
        WarehouseDetails errorWarehouse = new WarehouseDetails(warehouseId, "Warehouse not found", 0);
        return errorWarehouse;
    }
}
