package com.bicheka.service;

public interface ShoppingCartService {

    void addProductToShoppingCart(String email, String productId);
    void updateProductQuantityInShoppingCart(String email, String productId, Integer quantity);
    String removeFromCart(String id, String email);
    String clearCart(String email);
    String buyCartItems();
}
