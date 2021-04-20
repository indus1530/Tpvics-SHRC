package edu.aku.hassannaqvi.tpvics_hh.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010,\u001a\u00020\u0006J\u0006\u0010-\u001a\u00020\u0000J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0003H\u0002J\u000e\u0010/\u001a\u0002002\u0006\u0010.\u001a\u00020\u0003R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\b \u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010\u00a8\u00061"}, d2 = {"Ledu/aku/hassannaqvi/tpvics_hh/core/AppInfo;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "versionName", "", "installedOn", "", "versionCode", "", "(Ljava/lang/String;JI)V", "appVersion", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "dbHelper", "Ledu/aku/hassannaqvi/tpvics_hh/database/DatabaseHelper;", "getDbHelper", "()Ledu/aku/hassannaqvi/tpvics_hh/database/DatabaseHelper;", "setDbHelper", "(Ledu/aku/hassannaqvi/tpvics_hh/database/DatabaseHelper;)V", "deviceID", "getDeviceID", "setDeviceID", "dtToday", "getDtToday", "getInstalledOn", "()J", "setInstalledOn", "(J)V", "isTestingApp", "", "()Z", "tagName", "getTagName", "setTagName", "getVersionCode", "()I", "setVersionCode", "(I)V", "getVersionName", "setVersionName", "getAppInfo", "getInfo", "mContext", "updateTagName", "", "app_debug"})
public final class AppInfo {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String versionName = "";
    private long installedOn = 0L;
    private int versionCode = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tagName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String deviceID = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String appVersion = "";
    public edu.aku.hassannaqvi.tpvics_hh.database.DatabaseHelper dbHelper;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersionName() {
        return null;
    }
    
    public final void setVersionName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getInstalledOn() {
        return 0L;
    }
    
    public final void setInstalledOn(long p0) {
    }
    
    public final int getVersionCode() {
        return 0;
    }
    
    public final void setVersionCode(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTagName() {
        return null;
    }
    
    public final void setTagName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceID() {
        return null;
    }
    
    public final void setDeviceID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppVersion() {
        return null;
    }
    
    public final void setAppVersion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDtToday() {
        return null;
    }
    
    public final boolean isTestingApp() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final edu.aku.hassannaqvi.tpvics_hh.database.DatabaseHelper getDbHelper() {
        return null;
    }
    
    public final void setDbHelper(@org.jetbrains.annotations.NotNull()
    edu.aku.hassannaqvi.tpvics_hh.database.DatabaseHelper p0) {
    }
    
    private final java.lang.String getTagName(android.content.Context mContext) {
        return null;
    }
    
    public final void updateTagName(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final edu.aku.hassannaqvi.tpvics_hh.core.AppInfo getInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppInfo() {
        return null;
    }
    
    public AppInfo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public AppInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String versionName, long installedOn, int versionCode) {
        super();
    }
}