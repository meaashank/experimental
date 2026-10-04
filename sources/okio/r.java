package okio;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.n0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f226087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f226088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final V f226089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Long f226090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Long f226091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Long f226092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Long f226093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Map<kotlin.reflect.d<?>, Object> f226094h;

    public r() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ r b(r rVar, boolean z10, boolean z11, V v10, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = rVar.f226087a;
        }
        if ((i10 & 2) != 0) {
            z11 = rVar.f226088b;
        }
        if ((i10 & 4) != 0) {
            v10 = rVar.f226089c;
        }
        if ((i10 & 8) != 0) {
            l10 = rVar.f226090d;
        }
        if ((i10 & 16) != 0) {
            l11 = rVar.f226091e;
        }
        if ((i10 & 32) != 0) {
            l12 = rVar.f226092f;
        }
        if ((i10 & 64) != 0) {
            l13 = rVar.f226093g;
        }
        if ((i10 & 128) != 0) {
            map = rVar.f226094h;
        }
        Long l14 = l13;
        Map map2 = map;
        Long l15 = l11;
        Long l16 = l12;
        return rVar.a(z10, z11, v10, l10, l15, l16, l14, map2);
    }

    @NotNull
    public final r a(boolean z10, boolean z11, @Nullable V v10, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @NotNull Map<kotlin.reflect.d<?>, ? extends Object> extras) {
        kotlin.jvm.internal.G.p(extras, "extras");
        return new r(z10, z11, v10, l10, l11, l12, l13, extras);
    }

    @Nullable
    public final <T> T c(@NotNull kotlin.reflect.d<? extends T> type) {
        kotlin.jvm.internal.G.p(type, "type");
        T t10 = (T) this.f226094h.get(type);
        if (t10 == null) {
            return null;
        }
        kotlin.reflect.e.a(type, t10);
        return t10;
    }

    @Nullable
    public final Long d() {
        return this.f226091e;
    }

    @NotNull
    public final Map<kotlin.reflect.d<?>, Object> e() {
        return this.f226094h;
    }

    @Nullable
    public final Long f() {
        return this.f226093g;
    }

    @Nullable
    public final Long g() {
        return this.f226092f;
    }

    @Nullable
    public final Long h() {
        return this.f226090d;
    }

    @Nullable
    public final V i() {
        return this.f226089c;
    }

    public final boolean j() {
        return this.f226088b;
    }

    public final boolean k() {
        return this.f226087a;
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f226087a) {
            arrayList.add("isRegularFile");
        }
        if (this.f226088b) {
            arrayList.add("isDirectory");
        }
        if (this.f226090d != null) {
            arrayList.add("byteCount=" + this.f226090d);
        }
        if (this.f226091e != null) {
            arrayList.add("createdAt=" + this.f226091e);
        }
        if (this.f226092f != null) {
            arrayList.add("lastModifiedAt=" + this.f226092f);
        }
        if (this.f226093g != null) {
            arrayList.add("lastAccessedAt=" + this.f226093g);
        }
        if (!this.f226094h.isEmpty()) {
            arrayList.add("extras=" + this.f226094h);
        }
        return kotlin.collections.U.r3(arrayList, U6.j.f68738d, "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public r(boolean z10, boolean z11, @Nullable V v10, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @NotNull Map<kotlin.reflect.d<?>, ? extends Object> extras) {
        kotlin.jvm.internal.G.p(extras, "extras");
        this.f226087a = z10;
        this.f226088b = z11;
        this.f226089c = v10;
        this.f226090d = l10;
        this.f226091e = l11;
        this.f226092f = l12;
        this.f226093g = l13;
        this.f226094h = n0.D0(extras);
    }

    public /* synthetic */ r(boolean z10, boolean z11, V v10, Long l10, Long l11, Long l12, Long l13, Map map, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : v10, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) != 0 ? null : l13, (i10 & 128) != 0 ? n0.z() : map);
    }
}
