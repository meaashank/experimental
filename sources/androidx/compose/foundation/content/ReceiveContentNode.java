package androidx.compose.foundation.content;

import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.modifier.h;
import androidx.compose.ui.modifier.i;
import androidx.compose.ui.modifier.j;
import androidx.compose.ui.modifier.k;
import androidx.compose.ui.node.AbstractC2206j;
import androidx.compose.ui.node.InterfaceC2199e;
import ed.l;
import kotlin.L0;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class ReceiveContentNode extends AbstractC2206j implements j, InterfaceC2199e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f88922u = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public e f88923r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final androidx.compose.foundation.content.internal.c f88924s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final h f88925t;

    public ReceiveContentNode(@NotNull e eVar) {
        this.f88923r = eVar;
        androidx.compose.foundation.content.internal.b bVar = new androidx.compose.foundation.content.internal.b(this);
        this.f88924s = bVar;
        this.f88925t = k.d(new Pair(ReceiveContentConfigurationKt.a(), bVar));
        e3(ReceiveContentDragAndDropNode_androidKt.a(bVar, new l<androidx.compose.ui.draganddrop.b, L0>() { // from class: androidx.compose.foundation.content.ReceiveContentNode.1
            {
                super(1);
            }

            public final void e(@NotNull androidx.compose.ui.draganddrop.b bVar2) {
                androidx.compose.foundation.content.internal.a.b(ReceiveContentNode.this, bVar2);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(androidx.compose.ui.draganddrop.b bVar2) {
                e(bVar2);
                return L0.f217464a;
            }
        }));
    }

    @Override // androidx.compose.ui.modifier.j, androidx.compose.ui.modifier.n
    public /* synthetic */ Object H(androidx.compose.ui.modifier.c cVar) {
        return i.a(this, cVar);
    }

    @Override // androidx.compose.ui.modifier.j
    public /* synthetic */ void e2(androidx.compose.ui.modifier.c cVar, Object obj) {
        i.c(this, cVar, obj);
    }

    @NotNull
    public final e p3() {
        return this.f88923r;
    }

    public final void q3(@NotNull e eVar) {
        this.f88923r = eVar;
    }

    public final void r3(@NotNull e eVar) {
        this.f88923r = eVar;
    }

    @Override // androidx.compose.ui.modifier.j
    @NotNull
    public h z0() {
        return this.f88925t;
    }
}
