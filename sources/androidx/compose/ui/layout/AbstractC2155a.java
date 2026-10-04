package androidx.compose.ui.layout;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.layout.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public abstract class AbstractC2155a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0253a f102537b = new C0253a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102538c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f102539d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.p<Integer, Integer, Integer> f102540a;

    /* JADX INFO: renamed from: androidx.compose.ui.layout.a$a, reason: collision with other inner class name */
    public static final class C0253a {
        public C0253a() {
        }

        public C0253a(C4969v c4969v) {
        }
    }

    public /* synthetic */ AbstractC2155a(ed.p pVar, C4969v c4969v) {
        this(pVar);
    }

    @NotNull
    public final ed.p<Integer, Integer, Integer> a() {
        return this.f102540a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2155a(ed.p<? super Integer, ? super Integer, Integer> pVar) {
        this.f102540a = pVar;
    }
}
