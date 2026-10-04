package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f102164d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<D> f102166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MotionEvent f102167c;

    public C(long j10, @NotNull List<D> list, @NotNull MotionEvent motionEvent) {
        this.f102165a = j10;
        this.f102166b = list;
        this.f102167c = motionEvent;
    }

    @NotNull
    public final MotionEvent a() {
        return this.f102167c;
    }

    @NotNull
    public final List<D> b() {
        return this.f102166b;
    }

    public final long c() {
        return this.f102165a;
    }
}
