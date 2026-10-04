package androidx.core.os;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.core.os.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@e.T(api = 35)
public abstract class AbstractC2402a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0281a f111279b = new C0281a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final AbstractC2402a f111280c = new b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final AbstractC2402a f111281d = new c(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111282a;

    /* JADX INFO: renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    public static final class C0281a {
        public C0281a() {
        }

        public C0281a(C4969v c4969v) {
        }
    }

    /* JADX INFO: renamed from: androidx.core.os.a$b */
    public static final class b extends AbstractC2402a {
        public b() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: androidx.core.os.a$c */
    public static final class c extends AbstractC2402a {
        public c() {
            super(2);
        }
    }

    public /* synthetic */ AbstractC2402a(int i10, C4969v c4969v) {
        this(i10);
    }

    public final int a() {
        return this.f111282a;
    }

    public AbstractC2402a(int i10) {
        this.f111282a = i10;
    }
}
