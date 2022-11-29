package com.example.recyclerviewappintent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001b"}, d2 = {"Lcom/example/recyclerviewappintent/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/recyclerviewappintent/RecyclerAdapter;", "getAdapter", "()Lcom/example/recyclerviewappintent/RecyclerAdapter;", "setAdapter", "(Lcom/example/recyclerviewappintent/RecyclerAdapter;)V", "listItem", "", "Lcom/example/recyclerviewappintent/UserEntity;", "getListItem", "()Ljava/util/List;", "setListItem", "(Ljava/util/List;)V", "phoneBookDatabase", "Lcom/example/recyclerviewappintent/UserDao;", "getPhoneBookDatabase", "()Lcom/example/recyclerviewappintent/UserDao;", "phoneBookDatabase$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy phoneBookDatabase$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.recyclerviewappintent.MainActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_ENTITY_ID = "ENTITY_ID";
    public com.example.recyclerviewappintent.RecyclerAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.recyclerviewappintent.UserEntity> listItem;
    
    public MainActivity() {
        super();
    }
    
    private final com.example.recyclerviewappintent.UserDao getPhoneBookDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.recyclerviewappintent.RecyclerAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.example.recyclerviewappintent.RecyclerAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.recyclerviewappintent.UserEntity> getListItem() {
        return null;
    }
    
    public final void setListItem(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.recyclerviewappintent.UserEntity> p0) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/recyclerviewappintent/MainActivity$Companion;", "", "()V", "USER_ENTITY_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}