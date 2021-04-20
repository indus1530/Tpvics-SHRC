package edu.aku.hassannaqvi.tpvics_hh.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b\u00a8\u0006\u0016"}, d2 = {"Ledu/aku/hassannaqvi/tpvics_hh/models/VersionApp;", "", "()V", "pathname", "", "getPathname", "()Ljava/lang/String;", "setPathname", "(Ljava/lang/String;)V", "versioncode", "getVersioncode", "setVersioncode", "versionname", "getVersionname", "setVersionname", "hydrate", "cursor", "Landroid/database/Cursor;", "sync", "jsonObject", "Lorg/json/JSONObject;", "VersionAppTable", "app_debug"})
public final class VersionApp {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String versioncode = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String versionname = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pathname = "";
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersioncode() {
        return null;
    }
    
    public final void setVersioncode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersionname() {
        return null;
    }
    
    public final void setVersionname(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPathname() {
        return null;
    }
    
    public final void setPathname(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final edu.aku.hassannaqvi.tpvics_hh.models.VersionApp sync(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject jsonObject) throws org.json.JSONException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final edu.aku.hassannaqvi.tpvics_hh.models.VersionApp hydrate(@org.jetbrains.annotations.NotNull()
    android.database.Cursor cursor) {
        return null;
    }
    
    public VersionApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Ledu/aku/hassannaqvi/tpvics_hh/models/VersionApp$VersionAppTable;", "", "()V", "COLUMN_ID", "", "COLUMN_PATH_NAME", "COLUMN_VERSION_CODE", "COLUMN_VERSION_NAME", "COLUMN_VERSION_PATH", "TABLE_NAME", "_URI", "app_debug"})
    public static final class VersionAppTable {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_NAME = "versionApp";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_ID = "_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_VERSION_PATH = "elements";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_VERSION_CODE = "versionCode";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_VERSION_NAME = "versionName";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_PATH_NAME = "outputFile";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String _URI = "output.json";
        @org.jetbrains.annotations.NotNull()
        public static final edu.aku.hassannaqvi.tpvics_hh.models.VersionApp.VersionAppTable INSTANCE = null;
        
        private VersionAppTable() {
            super();
        }
    }
}