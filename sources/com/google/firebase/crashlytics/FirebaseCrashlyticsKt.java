package com.google.firebase.crashlytics;

import com.google.firebase.Firebase;
import ed.l;
import kotlin.L0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseCrashlyticsKt {
    @NotNull
    public static final FirebaseCrashlytics getCrashlytics(@NotNull Firebase firebase) {
        G.p(firebase, "<this>");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        G.o(firebaseCrashlytics, "getInstance()");
        return firebaseCrashlytics;
    }

    public static final void setCustomKeys(@NotNull FirebaseCrashlytics firebaseCrashlytics, @NotNull l<? super KeyValueBuilder, L0> init) {
        G.p(firebaseCrashlytics, "<this>");
        G.p(init, "init");
        init.invoke(new KeyValueBuilder(firebaseCrashlytics));
    }
}
