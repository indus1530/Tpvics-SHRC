package edu.aku.hassannaqvi.tpvics_hh.utils.datecollection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Ledu/aku/hassannaqvi/tpvics_hh/utils/datecollection/DateRepository;", "", "()V", "Companion", "app_debug"})
public final class DateRepository {
    @org.jetbrains.annotations.NotNull()
    public static final edu.aku.hassannaqvi.tpvics_hh.utils.datecollection.DateRepository.Companion Companion = null;
    
    public DateRepository() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J6\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007J*\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\"\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J1\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Ledu/aku/hassannaqvi/tpvics_hh/utils/datecollection/DateRepository$Companion;", "", "()V", "dateValidator", "", "year", "", "month", "day", "getCalculatedAge", "Ledu/aku/hassannaqvi/tpvics_hh/utils/datecollection/AgeModel;", "currentDate", "Lorg/threeten/bp/LocalDate;", "allowCurrentAge", "getDOBFromAge", "refDate", "getDate", "isDateLessThenDOB", "dt", "(IIILorg/threeten/bp/LocalDate;)Ljava/lang/Boolean;", "app_debug"})
    public static final class Companion {
        
        private final org.threeten.bp.LocalDate getDate(int year, int month, int day) {
            return null;
        }
        
        public final boolean dateValidator(int year, int month, int day) {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isDateLessThenDOB(int year, int month, int day, @org.jetbrains.annotations.Nullable()
        org.threeten.bp.LocalDate dt) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final edu.aku.hassannaqvi.tpvics_hh.utils.datecollection.AgeModel getCalculatedAge(@org.jetbrains.annotations.NotNull()
        org.threeten.bp.LocalDate currentDate, int year, int month, int day, boolean allowCurrentAge) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final edu.aku.hassannaqvi.tpvics_hh.utils.datecollection.AgeModel getCalculatedAge(@org.jetbrains.annotations.NotNull()
        org.threeten.bp.LocalDate currentDate, int year, int month, int day) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final edu.aku.hassannaqvi.tpvics_hh.utils.datecollection.AgeModel getCalculatedAge(int year, int month, int day) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.threeten.bp.LocalDate getDOBFromAge(@org.jetbrains.annotations.NotNull()
        org.threeten.bp.LocalDate refDate, int year, int month, int day) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.threeten.bp.LocalDate getDOBFromAge(int year, int month, int day) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}