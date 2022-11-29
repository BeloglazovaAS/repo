package com.example.recyclerviewappintent;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\'J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0004H\'J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/example/recyclerviewappintent/UserDao;", "", "all", "", "Lcom/example/recyclerviewappintent/UserEntity;", "getAll", "()Ljava/util/List;", "delete", "", "user", "getById", "id", "", "insert", "update", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from user")
    public abstract java.util.List<com.example.recyclerviewappintent.UserEntity> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from user where id = :id")
    public abstract com.example.recyclerviewappintent.UserEntity getById(long id);
    
    @androidx.room.Insert()
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.example.recyclerviewappintent.UserEntity user);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.recyclerviewappintent.UserEntity user);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.recyclerviewappintent.UserEntity user);
}