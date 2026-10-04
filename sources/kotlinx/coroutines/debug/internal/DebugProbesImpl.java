package kotlinx.coroutines.debug.internal;

import a.C1415a;
import androidx.compose.runtime.R0;
import dd.j;
import ed.InterfaceC4376a;
import ed.l;
import ed.p;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.C4885d0;
import kotlin.InterfaceC4850b0;
import kotlin.L0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.B;
import kotlin.collections.U;
import kotlin.collections.m0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.jvm.internal.Y;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C5032y;
import kotlin.text.F;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.J;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.K;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import kotlinx.coroutines.internal.M;
import kotlinx.coroutines.internal.P;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,616:1\n146#1:634\n147#1,4:636\n152#1,5:641\n146#1:646\n147#1,4:648\n152#1,5:653\n1#2:617\n1#2:635\n1#2:647\n766#3:618\n857#3,2:619\n1208#3,2:621\n1238#3,4:623\n1855#3,2:661\n350#3,7:669\n1819#3,8:676\n603#4:627\n603#4:640\n603#4:652\n603#4:658\n1313#4,2:659\n37#5,2:628\n37#5,2:630\n37#5,2:632\n1627#6,6:663\n1735#6,6:684\n*S KotlinDebug\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n241#1:634\n241#1:636,4\n241#1:641,5\n248#1:646\n248#1:648,4\n248#1:653,5\n241#1:635\n248#1:647\n106#1:618\n106#1:619,2\n107#1:621,2\n107#1:623,4\n303#1:661,2\n412#1:669,7\n502#1:676,8\n150#1:627\n241#1:640\n248#1:652\n283#1:658\n284#1:659,2\n207#1:628,2\n208#1:630,2\n209#1:632,2\n351#1:663,6\n554#1:684,6\n*E\n"})
@InterfaceC4850b0
public final class DebugProbesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final DebugProbesImpl f219244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final StackTraceElement f219245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final SimpleDateFormat f219246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static Thread f219247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final ConcurrentWeakMap<a<?>, Boolean> f219248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f219249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f219250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f219251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static final l<Boolean, L0> f219252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final ConcurrentWeakMap<Vc.c, DebugCoroutineInfoImpl> f219253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ b f219254k;

    public static final class a<T> implements kotlin.coroutines.e<T>, Vc.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dd.g
        @NotNull
        public final kotlin.coroutines.e<T> f219255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dd.g
        @NotNull
        public final DebugCoroutineInfoImpl f219256b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull kotlin.coroutines.e<? super T> eVar, @NotNull DebugCoroutineInfoImpl debugCoroutineInfoImpl) {
            this.f219255a = eVar;
            this.f219256b = debugCoroutineInfoImpl;
        }

        public final i a() {
            return this.f219256b.f219230a;
        }

        @Override // Vc.c
        @Nullable
        public Vc.c getCallerFrame() {
            i iVar = this.f219256b.f219230a;
            if (iVar != null) {
                return iVar.f219290a;
            }
            return null;
        }

        @Override // kotlin.coroutines.e
        @NotNull
        public kotlin.coroutines.i getContext() {
            return this.f219255a.getContext();
        }

        @Override // Vc.c
        @Nullable
        public StackTraceElement getStackTraceElement() {
            i iVar = this.f219256b.f219230a;
            if (iVar != null) {
                return iVar.f219291b;
            }
            return null;
        }

        @Override // kotlin.coroutines.e
        public void resumeWith(@NotNull Object obj) {
            DebugProbesImpl.f219244a.G(this);
            this.f219255a.resumeWith(obj);
        }

        @NotNull
        public String toString() {
            return this.f219255a.toString();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f219257a = AtomicIntegerFieldUpdater.newUpdater(b.class, "installations$volatile");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AtomicLongFieldUpdater f219258b = AtomicLongFieldUpdater.newUpdater(b.class, "sequenceNumber$volatile");
        private volatile /* synthetic */ int installations$volatile;
        private volatile /* synthetic */ long sequenceNumber$volatile;

        public b() {
        }

        public final /* synthetic */ int c() {
            return this.installations$volatile;
        }

        public final /* synthetic */ long e() {
            return this.sequenceNumber$volatile;
        }

        public final /* synthetic */ void g(int i10) {
            this.installations$volatile = i10;
        }

        public final /* synthetic */ void h(long j10) {
            this.sequenceNumber$volatile = j10;
        }

        public b(C4969v c4969v) {
        }
    }

    @V({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,328:1\n150#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return Oc.g.l(Long.valueOf(((a) t10).f219256b.f219231b), Long.valueOf(((a) t11).f219256b.f219231b));
        }
    }

    @V({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,328:1\n283#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return Oc.g.l(Long.valueOf(((a) t10).f219256b.f219231b), Long.valueOf(((a) t11).f219256b.f219231b));
        }
    }

    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        f219244a = debugProbesImpl;
        f219245b = new C1415a().b();
        f219246c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f219248e = new ConcurrentWeakMap<>(false, 1, null);
        f219249f = true;
        f219251h = true;
        f219252i = debugProbesImpl.u();
        f219253j = new ConcurrentWeakMap<>(true);
        f219254k = new b();
    }

    public static /* synthetic */ void t(A0 a02) {
    }

    public final boolean A(a<?> aVar) {
        A0 a02;
        kotlin.coroutines.i iVarC = aVar.f219256b.c();
        if (iVarC == null || (a02 = (A0) iVarC.get(A0.f218690A3)) == null || !a02.U()) {
            return false;
        }
        f219248e.remove(aVar);
        return true;
    }

    @j(name = "isInstalled$kotlinx_coroutines_debug")
    public final boolean B() {
        return b.f219257a.get(f219254k) > 0;
    }

    public final boolean C(StackTraceElement stackTraceElement) {
        return F.L2(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    public final a<?> D(Vc.c cVar) {
        while (!(cVar instanceof a)) {
            cVar = cVar.getCallerFrame();
            if (cVar == null) {
                return null;
            }
        }
        return (a) cVar;
    }

    public final a<?> E(kotlin.coroutines.e<?> eVar) {
        Vc.c cVar = eVar instanceof Vc.c ? (Vc.c) eVar : null;
        if (cVar != null) {
            return D(cVar);
        }
        return null;
    }

    public final void F(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    public final void G(a<?> aVar) {
        Vc.c cVarK;
        f219248e.remove(aVar);
        Vc.c cVarF = aVar.f219256b.f();
        if (cVarF == null || (cVarK = K(cVarF)) == null) {
            return;
        }
        f219253j.remove(cVarK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T> kotlin.coroutines.e<T> H(@NotNull kotlin.coroutines.e<? super T> eVar) {
        if (B() && (!(f219251h && eVar.getContext() == EmptyCoroutineContext.f217673a) && E(eVar) == null)) {
            return e(eVar, f219250g ? R(L(new Exception())) : null);
        }
        return eVar;
    }

    public final void I(@NotNull kotlin.coroutines.e<?> eVar) {
        V(eVar, kotlinx.coroutines.debug.internal.d.f219286b);
    }

    public final void J(@NotNull kotlin.coroutines.e<?> eVar) {
        V(eVar, kotlinx.coroutines.debug.internal.d.f219287c);
    }

    public final Vc.c K(Vc.c cVar) {
        do {
            cVar = cVar.getCallerFrame();
            if (cVar == null) {
                return null;
            }
        } while (cVar.getStackTraceElement() == null);
        return cVar;
    }

    public final <T extends Throwable> List<StackTraceElement> L(T t10) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i11 = length2 - 1;
                if (G.g(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i10 = length2;
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                length2 = i11;
            }
        }
        int i12 = i10 + 1;
        if (!f219249f) {
            int i13 = length - i12;
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList.add(stackTrace[i14 + i12]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i12) + 1);
        while (i12 < length) {
            if (C(stackTrace[i12])) {
                arrayList2.add(stackTrace[i12]);
                int i15 = i12 + 1;
                while (i15 < length && C(stackTrace[i15])) {
                    i15++;
                }
                int i16 = i15 - 1;
                int i17 = i16;
                while (i17 > i12 && stackTrace[i17].getFileName() == null) {
                    i17--;
                }
                if (i17 > i12 && i17 < i16) {
                    arrayList2.add(stackTrace[i17]);
                }
                arrayList2.add(stackTrace[i16]);
                i12 = i15;
            } else {
                arrayList2.add(stackTrace[i12]);
                i12++;
            }
        }
        return arrayList2;
    }

    public final void M(boolean z10) {
        f219250g = z10;
    }

    public final void N(boolean z10) {
        f219251h = z10;
    }

    public final void O(boolean z10) {
        f219249f = z10;
    }

    public final void P() {
        f219247d = Pc.b.c(false, true, null, "Coroutines Debugger Cleaner", 0, new InterfaceC4376a<L0>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$startWeakRefCleanerThread$1
            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ L0 invoke() {
                invoke2();
                return L0.f217464a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DebugProbesImpl.f219253j.q();
            }
        }, 21, null);
    }

    public final void Q() throws InterruptedException {
        Thread thread = f219247d;
        if (thread == null) {
            return;
        }
        f219247d = null;
        thread.interrupt();
        thread.join();
    }

    public final i R(List<StackTraceElement> list) {
        i iVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                iVar = new i(iVar, listIterator.previous());
            }
        }
        return new i(iVar, f219245b);
    }

    public final String S(Object obj) {
        return e.b(obj.toString());
    }

    public final void T() throws InterruptedException {
        l<Boolean, L0> lVar;
        if (!B()) {
            throw new IllegalStateException("Agent was not installed");
        }
        if (b.f219257a.decrementAndGet(f219254k) != 0) {
            return;
        }
        Q();
        f219248e.clear();
        f219253j.clear();
        kotlinx.coroutines.debug.internal.a.f219270a.getClass();
        if (kotlinx.coroutines.debug.internal.a.f219271b || (lVar = f219252i) == null) {
            return;
        }
        lVar.invoke(Boolean.FALSE);
    }

    public final void U(Vc.c cVar, String str) {
        boolean z10;
        if (B()) {
            ConcurrentWeakMap<Vc.c, DebugCoroutineInfoImpl> concurrentWeakMap = f219253j;
            DebugCoroutineInfoImpl debugCoroutineInfoImplRemove = concurrentWeakMap.remove(cVar);
            if (debugCoroutineInfoImplRemove != null) {
                z10 = false;
            } else {
                a<?> aVarD = D(cVar);
                if (aVarD == null || (debugCoroutineInfoImplRemove = aVarD.f219256b) == null) {
                    return;
                }
                Vc.c cVarF = debugCoroutineInfoImplRemove.f();
                Vc.c cVarK = cVarF != null ? K(cVarF) : null;
                if (cVarK != null) {
                    concurrentWeakMap.remove(cVarK);
                }
                z10 = true;
            }
            G.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
            debugCoroutineInfoImplRemove.j(str, (kotlin.coroutines.e) cVar, z10);
            Vc.c cVarK2 = K(cVar);
            if (cVarK2 == null) {
                return;
            }
            concurrentWeakMap.put(cVarK2, debugCoroutineInfoImplRemove);
        }
    }

    public final void V(kotlin.coroutines.e<?> eVar, String str) {
        if (B()) {
            if (f219251h && eVar.getContext() == EmptyCoroutineContext.f217673a) {
                return;
            }
            if (G.g(str, kotlinx.coroutines.debug.internal.d.f219286b)) {
                Vc.c cVar = eVar instanceof Vc.c ? (Vc.c) eVar : null;
                if (cVar == null) {
                    return;
                }
                U(cVar, str);
                return;
            }
            a<?> aVarE = E(eVar);
            if (aVarE == null) {
                return;
            }
            W(aVarE, eVar, str);
        }
    }

    public final void W(a<?> aVar, kotlin.coroutines.e<?> eVar, String str) {
        if (B()) {
            aVar.f219256b.j(str, eVar, true);
        }
    }

    public final void d(A0 a02, Map<A0, DebugCoroutineInfoImpl> map, StringBuilder sb2, String str) {
        DebugCoroutineInfoImpl debugCoroutineInfoImpl = map.get(a02);
        if (debugCoroutineInfoImpl != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) U.L2(debugCoroutineInfoImpl.h());
            String str2 = debugCoroutineInfoImpl._state;
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a(str);
            sbA.append(s(a02));
            sbA.append(", continuation is ");
            sbA.append(str2);
            sbA.append(" at line ");
            sbA.append(stackTraceElement);
            sbA.append('\n');
            sb2.append(sbA.toString());
            str = R0.a(new StringBuilder(), str, '\t');
        } else if (!(a02 instanceof M)) {
            StringBuilder sbA2 = androidx.compose.runtime.changelist.a.a(str);
            sbA2.append(s(a02));
            sbA2.append('\n');
            sb2.append(sbA2.toString());
            str = R0.a(new StringBuilder(), str, '\t');
        }
        Iterator<A0> it = a02.Q0().iterator();
        while (it.hasNext()) {
            d(it.next(), map, sb2, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> kotlin.coroutines.e<T> e(kotlin.coroutines.e<? super T> eVar, i iVar) {
        if (!B()) {
            return eVar;
        }
        a<?> aVar = new a<>(eVar, new DebugCoroutineInfoImpl(eVar.getContext(), iVar, b.f219258b.incrementAndGet(f219254k)));
        ConcurrentWeakMap<a<?>, Boolean> concurrentWeakMap = f219248e;
        concurrentWeakMap.put(aVar, Boolean.TRUE);
        if (!B()) {
            concurrentWeakMap.clear();
        }
        return aVar;
    }

    @j(name = "dumpCoroutines")
    public final void f(@NotNull PrintStream printStream) {
        synchronized (printStream) {
            f219244a.j(printStream);
        }
    }

    @NotNull
    public final List<kotlinx.coroutines.debug.internal.c> g() {
        if (B()) {
            return SequencesKt___SequencesKt.I3(SequencesKt___SequencesKt.S1(SequencesKt___SequencesKt.q3(U.E1(f219248e.keySet()), new c()), new l<a<?>, kotlinx.coroutines.debug.internal.c>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // ed.l
                @Nullable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final c invoke(@NotNull DebugProbesImpl.a<?> aVar) {
                    kotlin.coroutines.i iVarC;
                    if (DebugProbesImpl.f219244a.A(aVar) || (iVarC = aVar.f219256b.c()) == null) {
                        return null;
                    }
                    return new c(aVar.f219256b, iVarC);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    @NotNull
    public final Object[] h() {
        String str;
        List<kotlinx.coroutines.debug.internal.c> listG = g();
        int size = listG.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (kotlinx.coroutines.debug.internal.c cVar : listG) {
            kotlin.coroutines.i iVar = cVar.f219277a;
            K k10 = (K) iVar.get(K.f218768c);
            Long lValueOf = null;
            String strB = (k10 == null || (str = k10.f218769b) == null) ? null : e.b(str.toString());
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) iVar.get(CoroutineDispatcher.f218710b);
            String strB2 = coroutineDispatcher != null ? e.b(coroutineDispatcher.toString()) : null;
            StringBuilder sbA = androidx.activity.result.i.a("\n                {\n                    \"name\": ", strB, ",\n                    \"id\": ");
            J j10 = (J) iVar.get(J.f218740c);
            if (j10 != null) {
                lValueOf = Long.valueOf(j10.f218741b);
            }
            sbA.append(lValueOf);
            sbA.append(",\n                    \"dispatcher\": ");
            sbA.append(strB2);
            sbA.append(",\n                    \"sequenceNumber\": ");
            sbA.append(cVar.f219279c);
            sbA.append(",\n                    \"state\": \"");
            sbA.append(cVar.f219281e);
            sbA.append("\"\n                } \n                ");
            arrayList3.add(C5032y.v(sbA.toString()));
            arrayList2.add(cVar.f219283g);
            arrayList.add(cVar.f219282f);
        }
        return new Object[]{R0.a(new StringBuilder("["), U.r3(arrayList3, null, null, null, 0, null, null, 63, null), ']'), arrayList.toArray(new Thread[0]), arrayList2.toArray(new Vc.c[0]), listG.toArray(new kotlinx.coroutines.debug.internal.c[0])};
    }

    public final <R> List<R> i(final p<? super a<?>, ? super kotlin.coroutines.i, ? extends R> pVar) {
        if (B()) {
            return SequencesKt___SequencesKt.I3(SequencesKt___SequencesKt.S1(SequencesKt___SequencesKt.q3(U.E1(f219248e.keySet()), new c()), new l<a<?>, R>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // ed.l
                @Nullable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final R invoke(@NotNull DebugProbesImpl.a<?> aVar) {
                    kotlin.coroutines.i iVarC;
                    if (DebugProbesImpl.f219244a.A(aVar) || (iVarC = aVar.f219256b.c()) == null) {
                        return null;
                    }
                    return pVar.invoke(aVar, iVarC);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    public final void j(PrintStream printStream) {
        if (!B()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        printStream.print("Coroutines dump " + f219246c.format(Long.valueOf(System.currentTimeMillis())));
        for (a aVar : (SequencesKt___SequencesKt.i) SequencesKt___SequencesKt.q3(SequencesKt___SequencesKt.P0(U.E1(f219248e.keySet()), new l<a<?>, Boolean>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$2
            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull DebugProbesImpl.a<?> aVar2) {
                return Boolean.valueOf(!DebugProbesImpl.f219244a.A(aVar2));
            }
        }), new d())) {
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = aVar.f219256b;
            List<StackTraceElement> listH = debugCoroutineInfoImpl.h();
            DebugProbesImpl debugProbesImpl = f219244a;
            List<StackTraceElement> listN = debugProbesImpl.n(debugCoroutineInfoImpl._state, debugCoroutineInfoImpl.lastObservedThread, listH);
            printStream.print("\n\nCoroutine " + aVar.f219255a + ", state: " + ((G.g(debugCoroutineInfoImpl._state, kotlinx.coroutines.debug.internal.d.f219286b) && listN == listH) ? android.support.v4.media.e.a(new StringBuilder(), debugCoroutineInfoImpl._state, " (Last suspension stacktrace, not an actual stacktrace)") : debugCoroutineInfoImpl._state));
            if (listH.isEmpty()) {
                printStream.print("\n\tat " + f219245b);
                debugProbesImpl.F(printStream, debugCoroutineInfoImpl.b());
            } else {
                debugProbesImpl.F(printStream, listN);
            }
        }
    }

    @NotNull
    public final List<DebuggerInfo> k() {
        if (B()) {
            return SequencesKt___SequencesKt.I3(SequencesKt___SequencesKt.S1(SequencesKt___SequencesKt.q3(U.E1(f219248e.keySet()), new c()), new l<a<?>, DebuggerInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // ed.l
                @Nullable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final DebuggerInfo invoke(@NotNull DebugProbesImpl.a<?> aVar) {
                    kotlin.coroutines.i iVarC;
                    if (DebugProbesImpl.f219244a.A(aVar) || (iVarC = aVar.f219256b.c()) == null) {
                        return null;
                    }
                    return new DebuggerInfo(aVar.f219256b, iVarC);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    @NotNull
    public final List<StackTraceElement> l(@NotNull kotlinx.coroutines.debug.internal.c cVar, @NotNull List<StackTraceElement> list) {
        return n(cVar.f219281e, cVar.f219282f, list);
    }

    @NotNull
    public final String m(@NotNull kotlinx.coroutines.debug.internal.c cVar) {
        List<StackTraceElement> listN = n(cVar.f219281e, cVar.f219282f, cVar.f219284h);
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : listN) {
            StringBuilder sb2 = new StringBuilder("\n                {\n                    \"declaringClass\": \"");
            sb2.append(stackTraceElement.getClassName());
            sb2.append("\",\n                    \"methodName\": \"");
            sb2.append(stackTraceElement.getMethodName());
            sb2.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb2.append(fileName != null ? e.b(fileName.toString()) : null);
            sb2.append(",\n                    \"lineNumber\": ");
            sb2.append(stackTraceElement.getLineNumber());
            sb2.append("\n                }\n                ");
            arrayList.add(C5032y.v(sb2.toString()));
        }
        return R0.a(new StringBuilder("["), U.r3(arrayList, null, null, null, 0, null, null, 63, null), ']');
    }

    public final List<StackTraceElement> n(String str, Thread thread, List<StackTraceElement> list) {
        Object objA;
        if (G.g(str, kotlinx.coroutines.debug.internal.d.f219286b) && thread != null) {
            try {
                objA = thread.getStackTrace();
            } catch (Throwable th) {
                objA = C4885d0.a(th);
            }
            if (objA instanceof Result.Failure) {
                objA = null;
            }
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) objA;
            if (stackTraceElementArr != null) {
                int length = stackTraceElementArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTraceElementArr[i10];
                    if (G.g(stackTraceElement.getClassName(), P.f220306a) && G.g(stackTraceElement.getMethodName(), "resumeWith") && G.g(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                        break;
                    }
                    i10++;
                }
                Pair<Integer, Integer> pairO = o(i10, stackTraceElementArr, list);
                int iIntValue = pairO.f217467a.intValue();
                int iIntValue2 = pairO.f217468b.intValue();
                if (iIntValue != -1) {
                    ArrayList arrayList = new ArrayList((((list.size() + i10) - iIntValue) - 1) - iIntValue2);
                    int i11 = i10 - iIntValue2;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList.add(stackTraceElementArr[i12]);
                    }
                    int size = list.size();
                    for (int i13 = iIntValue + 1; i13 < size; i13++) {
                        arrayList.add(list.get(i13));
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }

    public final Pair<Integer, Integer> o(int i10, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i11 = 0; i11 < 3; i11++) {
            int iP = f219244a.p((i10 - 1) - i11, stackTraceElementArr, list);
            if (iP != -1) {
                return new Pair<>(Integer.valueOf(iP), Integer.valueOf(i11));
            }
        }
        return new Pair<>(-1, 0);
    }

    public final int p(int i10, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) B.hf(stackTraceElementArr, i10);
        if (stackTraceElement == null) {
            return -1;
        }
        int i11 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (G.g(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && G.g(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && G.g(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public final Set<a<?>> q() {
        return f219248e.keySet();
    }

    public final String s(A0 a02) {
        return a02 instanceof JobSupport ? ((JobSupport) a02).E1() : a02.toString();
    }

    public final l<Boolean, L0> u() {
        Object objA;
        try {
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            G.n(objNewInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            Y.q(objNewInstance, 1);
            objA = (l) objNewInstance;
        } catch (Throwable th) {
            objA = C4885d0.a(th);
        }
        return (l) (objA instanceof Result.Failure ? null : objA);
    }

    public final boolean v() {
        return f219250g;
    }

    public final boolean w() {
        return f219251h;
    }

    public final boolean x() {
        return f219249f;
    }

    @NotNull
    public final String y(@NotNull A0 a02) {
        if (!B()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        Set<a<?>> setKeySet = f219248e.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((a) obj).f219255a.getContext().get(A0.f218690A3) != null) {
                arrayList.add(obj);
            }
        }
        int iJ = m0.j(kotlin.collections.J.d0(arrayList, 10));
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            a aVar = (a) obj2;
            linkedHashMap.put(JobKt__JobKt.z(aVar.f219255a.getContext()), aVar.f219256b);
        }
        StringBuilder sb2 = new StringBuilder();
        f219244a.d(a02, linkedHashMap, sb2, "");
        String string = sb2.toString();
        G.o(string, "toString(...)");
        return string;
    }

    public final void z() {
        l<Boolean, L0> lVar;
        if (b.f219257a.incrementAndGet(f219254k) > 1) {
            return;
        }
        P();
        kotlinx.coroutines.debug.internal.a.f219270a.getClass();
        if (kotlinx.coroutines.debug.internal.a.f219271b || (lVar = f219252i) == null) {
            return;
        }
        lVar.invoke(Boolean.TRUE);
    }
}
