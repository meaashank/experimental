package h0;

import android.os.LocaleList;
import android.util.Log;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.text.platform.y;
import e.T;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T(api = 24)
@r(parameters = 0)
public final class C4477e implements InterfaceC4482j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f202374d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public LocaleList f202375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4481i f202376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final y f202377c = new y();

    @Override // h0.InterfaceC4482j
    @NotNull
    public Locale a(@NotNull String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (G.g(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e(C4478f.f202378a, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    @Override // h0.InterfaceC4482j
    @NotNull
    public C4481i b() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f202377c) {
            C4481i c4481i = this.f202376b;
            if (c4481i != null && localeList == this.f202375a) {
                return c4481i;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new C4480h(localeList.get(i10)));
            }
            C4481i c4481i2 = new C4481i(arrayList);
            this.f202375a = localeList;
            this.f202376b = c4481i2;
            return c4481i2;
        }
    }
}
