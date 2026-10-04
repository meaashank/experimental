package v4;

import android.content.SharedPreferences;
import kd.InterfaceC4846f;
import kotlin.jvm.internal.G;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements InterfaceC4846f<Object, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f239852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f239853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f239854c;

    public i(@NotNull String name, @NotNull String defaultValue, @NotNull SharedPreferences preferences) {
        G.p(name, "name");
        G.p(defaultValue, "defaultValue");
        G.p(preferences, "preferences");
        this.f239852a = name;
        this.f239853b = defaultValue;
        this.f239854c = preferences;
    }

    @Override // kd.InterfaceC4846f, kd.InterfaceC4845e
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String getValue(@NotNull Object thisRef, @NotNull n<?> property) {
        G.p(thisRef, "thisRef");
        G.p(property, "property");
        String string = this.f239854c.getString(this.f239852a, this.f239853b);
        G.m(string);
        return string;
    }

    @Override // kd.InterfaceC4846f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void setValue(@NotNull Object thisRef, @NotNull n<?> property, @NotNull String value) {
        G.p(thisRef, "thisRef");
        G.p(property, "property");
        G.p(value, "value");
        this.f239854c.edit().putString(this.f239852a, value).apply();
    }
}
