package atu.cicd.labexam_warehouse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {
    private WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService){
        this.warehouseService = warehouseService;
    }
    @GetMapping("get-warehouse/{warehouseId}")
    public WarehouseDetails getWarehouse(@PathVariable int warehouseId){
        return warehouseService.getWarehouseById(warehouseId);
    }
}
