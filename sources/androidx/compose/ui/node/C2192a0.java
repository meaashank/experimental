package androidx.compose.ui.node;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.node.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nNestedVectorStack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,61:1\n523#2:62\n*S KotlinDebug\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n*L\n44#1:62\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2192a0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f103028d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f103029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public int[] f103030b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public androidx.compose.runtime.collection.c<T>[] f103031c = new androidx.compose.runtime.collection.c[16];

    public final boolean a() {
        int i10 = this.f103029a;
        return i10 > 0 && this.f103030b[i10 - 1] >= 0;
    }

    public final T b() {
        int i10 = this.f103029a;
        if (i10 <= 0) {
            throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
        }
        int i11 = i10 - 1;
        int i12 = this.f103030b[i11];
        androidx.compose.runtime.collection.c<T> cVar = this.f103031c[i11];
        kotlin.jvm.internal.G.m(cVar);
        if (i12 > 0) {
            this.f103030b[i11] = r3[i11] - 1;
        } else if (i12 == 0) {
            this.f103031c[i11] = null;
            this.f103029a--;
        }
        return cVar.f99564a[i12];
    }

    public final void c(@NotNull androidx.compose.runtime.collection.c<T> cVar) {
        if (cVar.U()) {
            return;
        }
        int i10 = this.f103029a;
        int[] iArr = this.f103030b;
        if (i10 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f103030b = iArrCopyOf;
            androidx.compose.runtime.collection.c<T>[] cVarArr = this.f103031c;
            Object[] objArrCopyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
            kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f103031c = (androidx.compose.runtime.collection.c[]) objArrCopyOf;
        }
        this.f103030b[i10] = cVar.f99566c - 1;
        this.f103031c[i10] = cVar;
        this.f103029a++;
    }
}
