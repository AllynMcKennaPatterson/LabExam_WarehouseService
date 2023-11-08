package atu.cicd.labexam_warehouse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseDetails {
    private int warehouseId;
    private String location;
    private int capacity;
}
