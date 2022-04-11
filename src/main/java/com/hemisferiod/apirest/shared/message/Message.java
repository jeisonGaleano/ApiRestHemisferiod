package com.hemisferiod.apirest.shared.message;

public class Message {

    public static class Success{
        public static final String SUCCESS="Success";
        public static final String CLIENT_CREATED="Cliente creado con exitó";
        public static final String CLIENT_UPDATE="Cliente actualizado con exitó";
        public static final String PRODUCT_CREATED="Producto creado con exitó";
        public static final String PRODUCT_UPDATE="Producto creado con exitó";


    }

    public static class Error{
        public static final String NOT_FOUND="No se encontró cliente con dicha identificación.";
        public static final String FOUND_VENDOR="Ya se encuentra registro con dicha identificación.";

    }
}
