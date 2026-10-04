package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C2150q;
import java.util.List;
import k0.InterfaceC4814e;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nAndroidScrollable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,36:1\n256#2,3:37\n33#2,4:40\n259#2,2:44\n38#2:46\n261#2:47\n149#3:48\n*S KotlinDebug\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n*L\n33#1:37,3\n33#1:40,4\n33#1:44,2\n33#1:46\n33#1:47\n33#1:48\n*E\n"})
public final class C1655c implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1655c f90022a = new C1655c();

    @Override // androidx.compose.foundation.gestures.v
    public long a(@NotNull InterfaceC4814e interfaceC4814e, @NotNull C2150q c2150q, long j10) {
        List<androidx.compose.ui.input.pointer.A> list = c2150q.f102318a;
        P.g.f65503b.getClass();
        P.g gVar = new P.g(P.g.f65504c);
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            androidx.compose.ui.input.pointer.A a10 = list.get(i10);
            i10++;
            gVar = new P.g(P.g.v(gVar.f65507a, a10.f102155j));
        }
        return P.g.x(gVar.f65507a, -interfaceC4814e.l2(64));
    }
}
