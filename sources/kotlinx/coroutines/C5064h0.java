package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5064h0 implements InterfaceC5114u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f220263a;

    public C5064h0(boolean z10) {
        this.f220263a = z10;
    }

    @Override // kotlinx.coroutines.InterfaceC5114u0
    @Nullable
    public K0 getList() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC5114u0
    public boolean isActive() {
        return this.f220263a;
    }

    @NotNull
    public String toString() {
        return androidx.compose.runtime.R0.a(new StringBuilder("Empty{"), this.f220263a ? "Active" : "New", '}');
    }
}
