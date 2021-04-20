package edu.aku.hassannaqvi.tpvics_hh.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b\u00a8\u0006\u0016"}, d2 = {"Ledu/aku/hassannaqvi/tpvics_hh/models/Districts;", "", "()V", "dist_id", "", "getDist_id", "()Ljava/lang/String;", "setDist_id", "(Ljava/lang/String;)V", "district", "getDistrict", "setDistrict", "province", "getProvince", "setProvince", "hydrate", "cursor", "Landroid/database/Cursor;", "sync", "jsonObject", "Lorg/json/JSONObject;", "DistrictTable", "app_debug"})
public final class Districts {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String dist_id = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String district = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String province = "";
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDist_id() {
        return null;
    }
    
    public final void setDist_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistrict() {
        return null;
    }
    
    public final void setDistrict(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProvince() {
        return null;
    }
    
    public final void setProvince(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final edu.aku.hassannaqvi.tpvics_hh.models.Districts sync(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject jsonObject) throws org.json.JSONException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final edu.aku.hassannaqvi.tpvics_hh.models.Districts hydrate(@org.jetbrains.annotations.NotNull()
    android.database.Cursor cursor) {
        return null;
    }
    
    public Districts() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Ledu/aku/hassannaqvi/tpvics_hh/models/Districts$DistrictTable;", "", "()V", "COLUMN_DIST_ID", "", "COLUMN_DIST_NAME", "COLUMN_ID", "COLUMN_PROVINCE_NAME", "TABLE_NAME", "app_debug"})
    public static final class DistrictTable {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_NAME = "districts";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_ID = "_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_DIST_ID = "dist_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_DIST_NAME = "district";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_PROVINCE_NAME = "province";
        @org.jetbrains.annotations.NotNull()
        public static final edu.aku.hassannaqvi.tpvics_hh.models.Districts.DistrictTable INSTANCE = null;
        
        private DistrictTable() {
            super();
        }
    }
}