package edu.aku.hassannaqvi.tpvics_hh.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Ledu/aku/hassannaqvi/tpvics_hh/database/CreateTable;", "", "()V", "DATABASE_COPY", "", "DATABASE_NAME", "DATABASE_VERSION", "", "PROJECT_NAME", "SQL_CREATE_BL_RANDOM", "SQL_CREATE_CHILD_TABLE", "SQL_CREATE_DISTRICTS", "SQL_CREATE_FORMS", "SQL_CREATE_PSU_TABLE", "SQL_CREATE_USERS", "SQL_CREATE_VERSIONAPP", "app_debug"})
public final class CreateTable {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PROJECT_NAME = "TPVICS_HH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "TPVICS_HH.db";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_COPY = "TPVICS_HH_copy.db";
    public static final int DATABASE_VERSION = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SQL_CREATE_FORMS = "CREATE TABLE Forms(_id INTEGER PRIMARY KEY AUTOINCREMENT,projectName TEXT,deviceid TEXT,tagid TEXT,username TEXT,_uid TEXT,_luid TEXT,gpslat TEXT,gpslng TEXT,gpsdate TEXT,gpsacc TEXT,formdate TEXT,sysdate TEXT,appversion TEXT,cluster_code TEXT,hhno TEXT,formtype TEXT,sInfo TEXT,sE TEXT,sM TEXT,sN TEXT,sO TEXT,fStatus TEXT,fstatus88x TEXT,endingdatetime TEXT,istatus TEXT,istatus88x TEXT,synced TEXT,synced_date TEXT );";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SQL_CREATE_USERS = "CREATE TABLE users(_id INTEGER PRIMARY KEY AUTOINCREMENT,username TEXT,passwordenc TEXT,dist_id TEXT );";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SQL_CREATE_VERSIONAPP = "CREATE TABLE versionApp (_id INTEGER PRIMARY KEY AUTOINCREMENT,versionCode TEXT, versionName TEXT, outputFile TEXT );";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SQL_CREATE_BL_RANDOM = "CREATE TABLE bl_randomised(_id TEXT,hh02 TEXT,hh05 TEXT,UID TEXT,hh TEXT,hh03 TEXT,hh07 TEXT,hh08 TEXT,hh09 TEXT,hhss TEXT,randDT TEXT,sno TEXT );";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SQL_CREATE_PSU_TABLE = "CREATE TABLE clusters (_id INTEGER PRIMARY KEY AUTOINCREMENT,dist_id TEXT, ebcode TEXT, geoarea TEXT, cluster_no TEXT );";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SQL_CREATE_CHILD_TABLE = "CREATE TABLE Child_Table(_id INTEGER PRIMARY KEY AUTOINCREMENT,deviceid TEXT,tagid TEXT,username TEXT,_uid TEXT,_uuid TEXT,formdate TEXT,sysdate TEXT,sca TEXT,scb TEXT,scc TEXT,synced TEXT,synced_date TEXT,ec14 TEXT,ec13 TEXT,ec15 TEXT,agey TEXT,agem TEXT,cluster_code TEXT,hhno TEXT,cstatus TEXT,cstatus88x TEXT );";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SQL_CREATE_DISTRICTS = "CREATE TABLE districts(_id INTEGER PRIMARY KEY AUTOINCREMENT,dist_id TEXT,district TEXT,province TEXT );";
    @org.jetbrains.annotations.NotNull()
    public static final edu.aku.hassannaqvi.tpvics_hh.database.CreateTable INSTANCE = null;
    
    private CreateTable() {
        super();
    }
}