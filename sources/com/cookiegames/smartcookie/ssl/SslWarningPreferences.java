package com.cookiegames.smartcookie.ssl;

import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface SslWarningPreferences {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Behavior {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Behavior[] $VALUES;
        public static final Behavior PROCEED = new Behavior("PROCEED", 0);
        public static final Behavior CANCEL = new Behavior("CANCEL", 1);

        private static final /* synthetic */ Behavior[] $values() {
            return new Behavior[]{PROCEED, CANCEL};
        }

        static {
            Behavior[] behaviorArr$values = $values();
            $VALUES = behaviorArr$values;
            $ENTRIES = c.c(behaviorArr$values);
        }

        private Behavior(String str, int i10) {
        }

        @NotNull
        public static kotlin.enums.a<Behavior> getEntries() {
            return $ENTRIES;
        }

        public static Behavior valueOf(String str) {
            return (Behavior) Enum.valueOf(Behavior.class, str);
        }

        public static Behavior[] values() {
            return (Behavior[]) $VALUES.clone();
        }
    }

    @Nullable
    Behavior a(@Nullable String str);

    void b(@NotNull String str, @NotNull Behavior behavior);
}
