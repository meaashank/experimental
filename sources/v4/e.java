package v4;

import android.content.SharedPreferences;
import kd.InterfaceC4846f;
import kotlin.jvm.internal.G;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements InterfaceC4846f<Object, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f239846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f239847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f239848c;

    public e(@NotNull String name, int i10, @NotNull SharedPreferences preferences) {
        G.p(name, "name");
        G.p(preferences, "preferences");
        this.f239846a = name;
        this.f239847b = i10;
        this.f239848c = preferences;
    }

    @Override // kd.InterfaceC4846f, kd.InterfaceC4845e
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getValue(@NotNull Object thisRef, @NotNull n<?> property) {
        G.p(thisRef, "thisRef");
        G.p(property, "property");
        return Integer.valueOf(this.f239848c.getInt(this.f239846a, this.f239847b));
    }

    public void b(@NotNull Object thisRef, @NotNull n<?> property, int i10) {
        G.p(thisRef, "thisRef");
        G.p(property, "property");
        this.f239848c.edit().putInt(this.f239846a, i10).apply();
    }

    @Override // kd.InterfaceC4846f
    public /* bridge */ /* synthetic */ void setValue(Object obj, n nVar, Integer num) {
        b(obj, nVar, num.intValue());
    }
}
