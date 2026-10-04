package v4;

import android.content.SharedPreferences;
import kd.InterfaceC4846f;
import kotlin.jvm.internal.G;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: v4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5684a implements InterfaceC4846f<Object, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f239838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f239839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f239840c;

    public C5684a(@NotNull String name, boolean z10, @NotNull SharedPreferences preferences) {
        G.p(name, "name");
        G.p(preferences, "preferences");
        this.f239838a = name;
        this.f239839b = z10;
        this.f239840c = preferences;
    }

    @Override // kd.InterfaceC4846f, kd.InterfaceC4845e
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean getValue(@NotNull Object thisRef, @NotNull n<?> property) {
        G.p(thisRef, "thisRef");
        G.p(property, "property");
        return Boolean.valueOf(this.f239840c.getBoolean(this.f239838a, this.f239839b));
    }

    public void b(@NotNull Object thisRef, @NotNull n<?> property, boolean z10) {
        G.p(thisRef, "thisRef");
        G.p(property, "property");
        this.f239840c.edit().putBoolean(this.f239838a, z10).apply();
    }

    @Override // kd.InterfaceC4846f
    public /* bridge */ /* synthetic */ void setValue(Object obj, n nVar, Boolean bool) {
        b(obj, nVar, bool.booleanValue());
    }
}
