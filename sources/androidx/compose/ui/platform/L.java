package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class L implements A1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f103603b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f103604a;

    public L(@NotNull Context context) {
        this.f103604a = context;
    }

    @Override // androidx.compose.ui.platform.A1
    public void a(@NotNull String str) {
        try {
            this.f103604a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e10) {
            throw new IllegalArgumentException("Can't open " + str + '.', e10);
        }
    }
}
