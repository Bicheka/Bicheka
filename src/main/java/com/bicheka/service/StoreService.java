package com.bicheka.service;

import java.util.List;

import com.bicheka.POJO.Store;

public interface StoreService {
    public Store createStore(Store store, String email);

    public Store getStoreByName(String name);

    public List<Store> getAllStores();

    public void deleteStore(String storename);

    public void deleteUserStores(String email);

    public Store renameStore(String storename, String newName);
}
