package edu.aku.hassannaqvi.tpvics_hh.ui.other;

import java.lang.System;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Ledu/aku/hassannaqvi/tpvics_hh/ui/other/SplashscreenActivity;", "Landroid/app/Activity;", "()V", "activityScope", "Lkotlinx/coroutines/CoroutineScope;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "Companion", "Continuation", "app_debug"})
public final class SplashscreenActivity extends android.app.Activity {
    private final kotlinx.coroutines.CoroutineScope activityScope = null;
    private static final int SPLASH_TIME_OUT = 500;
    public static java.util.List<java.lang.String> provinces;
    public static java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, edu.aku.hassannaqvi.tpvics_hh.models.Districts>> districtsMap;
    @org.jetbrains.annotations.NotNull()
    public static final edu.aku.hassannaqvi.tpvics_hh.ui.other.SplashscreenActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    public SplashscreenActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Ledu/aku/hassannaqvi/tpvics_hh/ui/other/SplashscreenActivity$Continuation;", "T", "Lkotlin/coroutines/Continuation;", "()V", "resume", "", "value", "(Ljava/lang/Object;)V", "resumeWith", "result", "Lkotlin/Result;", "resumeWithException", "exception", "", "app_debug"})
    public static abstract class Continuation<T extends java.lang.Object> implements kotlin.coroutines.Continuation<T> {
        
        public abstract void resume(T value);
        
        public abstract void resumeWithException(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable exception);
        
        @java.lang.Override()
        public void resumeWith(@org.jetbrains.annotations.NotNull()
        java.lang.Object result) {
        }
        
        public Continuation() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R2\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\b0\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Ledu/aku/hassannaqvi/tpvics_hh/ui/other/SplashscreenActivity$Companion;", "", "()V", "SPLASH_TIME_OUT", "", "districtsMap", "", "", "Lkotlin/Pair;", "Ledu/aku/hassannaqvi/tpvics_hh/models/Districts;", "getDistrictsMap", "()Ljava/util/Map;", "setDistrictsMap", "(Ljava/util/Map;)V", "provinces", "", "getProvinces", "()Ljava/util/List;", "setProvinces", "(Ljava/util/List;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getProvinces() {
            return null;
        }
        
        public final void setProvinces(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, edu.aku.hassannaqvi.tpvics_hh.models.Districts>> getDistrictsMap() {
            return null;
        }
        
        public final void setDistrictsMap(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, edu.aku.hassannaqvi.tpvics_hh.models.Districts>> p0) {
        }
        
        private Companion() {
            super();
        }
    }
}