package edu.aku.hassannaqvi.tpvics_hh.models;

import java.lang.System;

/**
 * Created by hassan.naqvi.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\n\u00a8\u0006\u001d"}, d2 = {"Ledu/aku/hassannaqvi/tpvics_hh/models/Users;", "", "userName", "", "distID", "(Ljava/lang/String;Ljava/lang/String;)V", "()V", "getDistID", "()Ljava/lang/String;", "setDistID", "(Ljava/lang/String;)V", "password", "getPassword", "setPassword", "userID", "", "getUserID", "()J", "setUserID", "(J)V", "getUserName", "setUserName", "hydrate", "cursor", "Landroid/database/Cursor;", "sync", "jsonObject", "Lorg/json/JSONObject;", "UserTable", "app_debug"})
public final class Users {
    private long userID = 0L;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String password = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String distID = "";
    
    public final long getUserID() {
        return 0L;
    }
    
    public final void setUserID(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistID() {
        return null;
    }
    
    public final void setDistID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final edu.aku.hassannaqvi.tpvics_hh.models.Users sync(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject jsonObject) throws org.json.JSONException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final edu.aku.hassannaqvi.tpvics_hh.models.Users hydrate(@org.jetbrains.annotations.NotNull()
    android.database.Cursor cursor) {
        return null;
    }
    
    public Users(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String distID) {
        super();
    }
    
    public Users() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Ledu/aku/hassannaqvi/tpvics_hh/models/Users$UserTable;", "", "()V", "COLUMN_DIST_ID", "", "COLUMN_ID", "COLUMN_PASSWORD", "COLUMN_USERNAME", "TABLE_NAME", "app_debug"})
    public static final class UserTable {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_NAME = "users";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_ID = "_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_USERNAME = "username";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_PASSWORD = "passwordenc";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_DIST_ID = "dist_id";
        @org.jetbrains.annotations.NotNull()
        public static final edu.aku.hassannaqvi.tpvics_hh.models.Users.UserTable INSTANCE = null;
        
        private UserTable() {
            super();
        }
    }
}