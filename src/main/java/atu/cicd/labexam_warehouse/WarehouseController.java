package atu.cicd.labexam_warehouse;

import org.springframework.web.bind.annotation.*;

@RestController
public class WarehouseController {
    private WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService){
        this.warehouseService = warehouseService;
    }

    @PostMapping("add-warehouse")
    public String addWarehouse(@RequestBody WarehouseDetails warehouseDetails){
        System.out.println("Warehouse added: " + warehouseDetails);
        return "Warehouse Added: " + warehouseDetails;
    }

    @GetMapping("get-warehouse/{warehouseId}")
    public WarehouseDetails getWarehouse(@PathVariable int warehouseId){
        return warehouseService.getWarehouseById(warehouseId);
    }

    @PostMapping("/confirm-capacity")
    public WarehouseDetails confirmCapacity(@RequestBody ProductDetails productDetails){
        return warehouseService.getWarehouseById(productDetails.getWarehouseId());
    }
}
