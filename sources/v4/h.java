package v4;

import android.content.SharedPreferences;
import kd.InterfaceC4846f;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    @NotNull
    public static final InterfaceC4846f<Object, String> a(@NotNull SharedPreferences sharedPreferences, @NotNull String name, @Nullable String str) {
        G.p(sharedPreferences, "<this>");
        G.p(name, "name");
        return new g(name, str, sharedPreferences);
    }

    public static /* synthetic */ InterfaceC4846f b(SharedPreferences sharedPreferences, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return a(sharedPreferences, str, str2);
    }
}
