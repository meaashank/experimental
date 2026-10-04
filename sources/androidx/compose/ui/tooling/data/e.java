package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.r;
import androidx.compose.ui.layout.Z;
import java.util.Collection;
import java.util.List;
import k0.v;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@q
@r(parameters = 0)
public abstract class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f105363i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f105364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f105365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final o f105366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Object f105367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final v f105368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Collection<Object> f105369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Collection<e> f105370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f105371h;

    public /* synthetic */ e(Object obj, String str, o oVar, Object obj2, v vVar, Collection collection, Collection collection2, boolean z10, C4969v c4969v) {
        this(obj, str, oVar, obj2, vVar, collection, collection2, z10);
    }

    @NotNull
    public final v a() {
        return this.f105368e;
    }

    @NotNull
    public final Collection<e> b() {
        return this.f105370g;
    }

    @NotNull
    public final Collection<Object> c() {
        return this.f105369f;
    }

    @Nullable
    public final Object d() {
        return this.f105367d;
    }

    @Nullable
    public final Object e() {
        return this.f105364a;
    }

    @Nullable
    public final o f() {
        return this.f105366c;
    }

    @NotNull
    public List<Z> g() {
        return EmptyList.f217510a;
    }

    @Nullable
    public final String h() {
        return this.f105365b;
    }

    @NotNull
    public List<i> i() {
        return EmptyList.f217510a;
    }

    public final boolean j() {
        return this.f105371h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Object obj, String str, o oVar, Object obj2, v vVar, Collection<? extends Object> collection, Collection<? extends e> collection2, boolean z10) {
        this.f105364a = obj;
        this.f105365b = str;
        this.f105366c = oVar;
        this.f105367d = obj2;
        this.f105368e = vVar;
        this.f105369f = collection;
        this.f105370g = collection2;
        this.f105371h = z10;
    }
}
