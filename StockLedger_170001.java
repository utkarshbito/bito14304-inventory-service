package com.example.inventory.repository;

import java.util.List;

/** Added 170001 to give the incremental path a real diff. */
public interface StockLedger {
    List<String> lowStockSkus(int threshold);
    void record(String sku, int delta);
}
