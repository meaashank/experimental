package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.L0;
import kotlin.collections.AbstractC4864f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nOnDemandAllocatingPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPoolKt\n*L\n1#1,103:1\n37#1:104\n37#1:105\n28#1,10:106\n37#1:126\n1549#2:116\n1620#2,2:117\n1622#2:121\n1549#2:122\n1620#2,3:123\n97#3,2:119\n*S KotlinDebug\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n*L\n31#1:104\n50#1:105\n72#1:106,10\n88#1:126\n73#1:116\n73#1:117,2\n73#1:121\n87#1:122\n87#1:123,3\n75#1:119,2\n*E\n"})
public final class G<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f220287d = AtomicIntegerFieldUpdater.newUpdater(G.class, "controlState$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f220288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.l<Integer, T> f220289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f220290c;
    private volatile /* synthetic */ int controlState$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public G(int i10, @NotNull ed.l<? super Integer, ? extends T> lVar) {
        this.f220288a = i10;
        this.f220289b = lVar;
        this.f220290c = new AtomicReferenceArray(i10);
    }

    public final boolean a() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f220287d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i10) != 0) {
                return false;
            }
            if (i10 >= this.f220288a) {
                return true;
            }
        } while (!f220287d.compareAndSet(this, i10, i10 + 1));
        this.f220290c.set(i10, this.f220289b.invoke(Integer.valueOf(i10)));
        return true;
    }

    @NotNull
    public final List<T> b() {
        int i10;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f220287d;
        while (true) {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & Integer.MIN_VALUE) != 0) {
                i10 = 0;
                break;
            }
            if (f220287d.compareAndSet(this, i10, Integer.MIN_VALUE | i10)) {
                break;
            }
        }
        md.l lVarY1 = md.u.Y1(0, i10);
        ArrayList arrayList = new ArrayList(kotlin.collections.J.d0(lVarY1, 10));
        Iterator<Integer> it = lVarY1.iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC4864f0) it).nextInt();
            do {
                andSet = this.f220290c.getAndSet(iNextInt, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    public final /* synthetic */ int c() {
        return this.controlState$volatile;
    }

    public final /* synthetic */ AtomicReferenceArray e() {
        return this.f220290c;
    }

    public final boolean f(int i10) {
        return (i10 & Integer.MIN_VALUE) != 0;
    }

    public final /* synthetic */ void g(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, ed.l<? super Integer, L0> lVar) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    public final /* synthetic */ void h(int i10) {
        this.controlState$volatile = i10;
    }

    @NotNull
    public final String i() {
        int i10 = f220287d.get(this);
        md.l lVarY1 = md.u.Y1(0, Integer.MAX_VALUE & i10);
        ArrayList arrayList = new ArrayList(kotlin.collections.J.d0(lVarY1, 10));
        Iterator<Integer> it = lVarY1.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f220290c.get(((AbstractC4864f0) it).nextInt()));
        }
        return androidx.compose.runtime.changelist.j.a(arrayList.toString(), (i10 & Integer.MIN_VALUE) != 0 ? "[closed]" : "");
    }

    public final int j() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f220287d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & Integer.MIN_VALUE) != 0) {
                return 0;
            }
        } while (!f220287d.compareAndSet(this, i10, Integer.MIN_VALUE | i10));
        return i10;
    }

    @NotNull
    public String toString() {
        return "OnDemandAllocatingPool(" + i() + ')';
    }
}
