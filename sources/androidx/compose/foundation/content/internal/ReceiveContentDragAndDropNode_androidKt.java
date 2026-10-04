package androidx.compose.foundation.content.internal;

import android.view.DragEvent;
import androidx.compose.foundation.content.f;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.f;
import androidx.compose.ui.platform.C2225a0;
import androidx.compose.ui.platform.Z;
import ed.l;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ReceiveContentDragAndDropNode_androidKt {

    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f88951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<androidx.compose.ui.draganddrop.b, L0> f88952b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(c cVar, l<? super androidx.compose.ui.draganddrop.b, L0> lVar) {
            this.f88951a = cVar;
            this.f88952b = lVar;
        }

        @Override // androidx.compose.ui.draganddrop.f
        public /* synthetic */ void E0(androidx.compose.ui.draganddrop.b bVar) {
        }

        @Override // androidx.compose.ui.draganddrop.f
        public void F1(@NotNull androidx.compose.ui.draganddrop.b bVar) {
            this.f88951a.a().a();
        }

        @Override // androidx.compose.ui.draganddrop.f
        public boolean M0(@NotNull androidx.compose.ui.draganddrop.b bVar) {
            this.f88952b.invoke(bVar);
            androidx.compose.foundation.content.f fVarB = ReceiveContentDragAndDropNode_androidKt.b(bVar);
            return !fVarB.equals(this.f88951a.a().c(fVarB));
        }

        @Override // androidx.compose.ui.draganddrop.f
        public void p0(@NotNull androidx.compose.ui.draganddrop.b bVar) {
            this.f88951a.a().b();
        }

        @Override // androidx.compose.ui.draganddrop.f
        public void t0(@NotNull androidx.compose.ui.draganddrop.b bVar) {
            this.f88951a.a().d();
        }

        @Override // androidx.compose.ui.draganddrop.f
        public void t1(@NotNull androidx.compose.ui.draganddrop.b bVar) {
            this.f88951a.a().onDragEnd();
        }

        @Override // androidx.compose.ui.draganddrop.f
        public /* synthetic */ void u1(androidx.compose.ui.draganddrop.b bVar) {
        }
    }

    @NotNull
    public static final androidx.compose.ui.draganddrop.d a(@NotNull c cVar, @NotNull l<? super androidx.compose.ui.draganddrop.b, L0> lVar) {
        return DragAndDropNodeKt.b(new l<androidx.compose.ui.draganddrop.b, Boolean>() { // from class: androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$1
            @NotNull
            public final Boolean e(@NotNull androidx.compose.ui.draganddrop.b bVar) {
                return Boolean.TRUE;
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.draganddrop.b bVar) {
                return Boolean.TRUE;
            }
        }, new a(cVar, lVar));
    }

    @NotNull
    public static final androidx.compose.foundation.content.f b(@NotNull androidx.compose.ui.draganddrop.b bVar) {
        DragEvent dragEvent = bVar.f100461a;
        Z z10 = new Z(dragEvent.getClipData());
        C2225a0 c2225a0 = new C2225a0(dragEvent.getClipDescription());
        f.a.f88943b.getClass();
        return new androidx.compose.foundation.content.f(z10, c2225a0, f.a.f88945d, null, 8, null);
    }
}
