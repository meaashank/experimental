package androidx.compose.foundation;

import android.content.res.Configuration;
import androidx.compose.runtime.C1968u;
import androidx.compose.runtime.InterfaceC1903d1;
import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nDarkTheme.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DarkTheme.android.kt\nandroidx/compose/foundation/DarkTheme_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,51:1\n77#2:52\n*S KotlinDebug\n*F\n+ 1 DarkTheme.android.kt\nandroidx/compose/foundation/DarkTheme_androidKt\n*L\n48#1:52\n*E\n"})
public final class C1841x {
    @InterfaceC1903d1
    @InterfaceC1917i
    public static final boolean a(@Nullable InterfaceC1946s interfaceC1946s, int i10) {
        if (C1968u.c0()) {
            C1968u.p0(-882615028, i10, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        boolean z10 = (((Configuration) interfaceC1946s.Q(AndroidCompositionLocals_androidKt.f())).uiMode & 48) == 32;
        if (C1968u.c0()) {
            C1968u.o0();
        }
        return z10;
    }
}
