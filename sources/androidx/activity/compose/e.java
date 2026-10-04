package androidx.activity.compose;

import androidx.activity.result.g;
import androidx.compose.runtime.X1;
import androidx.compose.runtime.internal.r;
import androidx.core.app.C2382e;
import d.AbstractC4282a;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class e<I, O> extends g<I> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f84997c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b<I> f84998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final X1<AbstractC4282a<I, O>> f84999b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull b<I> bVar, @NotNull X1<? extends AbstractC4282a<I, O>> x12) {
        this.f84998a = bVar;
        this.f84999b = x12;
    }

    @Override // androidx.activity.result.g
    @NotNull
    public AbstractC4282a<I, ?> a() {
        return this.f84999b.getValue();
    }

    @Override // androidx.activity.result.g
    public void c(I i10, @Nullable C2382e c2382e) {
        this.f84998a.b(i10, c2382e);
    }

    @Override // androidx.activity.result.g
    @InterfaceC4982o(message = "Registration is automatically handled by rememberLauncherForActivityResult")
    public void d() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
