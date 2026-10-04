package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import ed.InterfaceC4376a;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,92:1\n116#2,2:93\n33#2,6:95\n118#2:101\n33#2,6:102\n33#2,6:108\n33#2,6:114\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n*L\n48#1:93,2\n48#1:95,6\n48#1:101\n56#1:102,6\n60#1:108,6\n64#1:114,6\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class V implements D0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f103020c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f103021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<D0> f103022b = new ArrayList();

    @Override // androidx.compose.ui.node.D0
    public void a(@NotNull View view, @NotNull ViewGroup viewGroup) {
        List<D0> list = this.f103022b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).a(view, viewGroup);
        }
    }

    @Override // androidx.compose.ui.node.D0
    public void b(@NotNull View view, @NotNull ViewGroup viewGroup) {
        List<D0> list = this.f103022b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).b(view, viewGroup);
        }
    }

    @Override // androidx.compose.ui.node.D0
    public void c(@NotNull View view, @NotNull ViewGroup viewGroup) {
        List<D0> list = this.f103022b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).c(view, viewGroup);
        }
    }

    @NotNull
    public final <T extends D0> T d(int i10, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        D0 d02;
        List<D0> list = this.f103022b;
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                d02 = null;
                break;
            }
            d02 = list.get(i11);
            if (d02.getId() == i10) {
                break;
            }
            i11++;
        }
        T t10 = d02 instanceof D0 ? (T) d02 : null;
        if (t10 != null) {
            return t10;
        }
        T tInvoke = interfaceC4376a.invoke();
        this.f103022b.add(tInvoke);
        return tInvoke;
    }

    @NotNull
    public final List<D0> e() {
        return this.f103022b;
    }

    @Override // androidx.compose.ui.node.D0
    public int getId() {
        return this.f103021a;
    }
}
