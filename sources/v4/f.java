package v4;

import android.content.SharedPreferences;
import kd.InterfaceC4846f;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    @NotNull
    public static final InterfaceC4846f<Object, Integer> a(@NotNull SharedPreferences sharedPreferences, @NotNull String name, int i10) {
        G.p(sharedPreferences, "<this>");
        G.p(name, "name");
        return new e(name, i10, sharedPreferences);
    }
}
