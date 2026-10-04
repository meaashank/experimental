package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.layout.InterfaceC2188x;
import androidx.compose.ui.semantics.SemanticsNode;
import k0.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SemanticsNode f104012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f104013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final v f104014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC2188x f104015d;

    public i(@NotNull SemanticsNode semanticsNode, int i10, @NotNull v vVar, @NotNull InterfaceC2188x interfaceC2188x) {
        this.f104012a = semanticsNode;
        this.f104013b = i10;
        this.f104014c = vVar;
        this.f104015d = interfaceC2188x;
    }

    @NotNull
    public final InterfaceC2188x a() {
        return this.f104015d;
    }

    public final int b() {
        return this.f104013b;
    }

    @NotNull
    public final SemanticsNode c() {
        return this.f104012a;
    }

    @NotNull
    public final v d() {
        return this.f104014c;
    }

    @NotNull
    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.f104012a + ", depth=" + this.f104013b + ", viewportBoundsInWindow=" + this.f104014c + ", coordinates=" + this.f104015d + ')';
    }
}
