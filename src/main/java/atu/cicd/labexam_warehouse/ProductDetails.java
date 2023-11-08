package atu.cicd.labexam_warehouse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetails {
    private int productId;
    private String productName;
    private int quantity;
    private int warehouseId;
}
