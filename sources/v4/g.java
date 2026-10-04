package v4;

import android.content.SharedPreferences;
import kd.InterfaceC4846f;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements InterfaceC4846f<Object, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f239849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f239850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f239851c;

    public g(@NotNull String name, @Nullable String str, @NotNull SharedPreferences preferences) {
        G.p(name, "name");
        G.p(preferences, "preferences");
        this.f239849a = name;
        this.f239850b = str;
        this.f239851c = preferences;
    }

    @Override // kd.InterfaceC4846f, kd.InterfaceC4845e
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String getValue(@NotNull Object thisRef, @NotNull n<?> property) {
        G.p(thisRef, "thisRef");
        G.p(property, "property");
        return this.f239851c.getString(this.f239849a, this.f239850b);
    }

    @Override // kd.InterfaceC4846f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void setValue(@NotNull Object thisRef, @NotNull n<?> property, @Nullable String str) {
        G.p(thisRef, "thisRef");
        G.p(property, "property");
        this.f239851c.edit().putString(this.f239849a, str).apply();
    }

    public /* synthetic */ g(String str, String str2, SharedPreferences sharedPreferences, int i10, C4969v c4969v) {
        this(str, (i10 & 2) != 0 ? null : str2, sharedPreferences);
    }
}
