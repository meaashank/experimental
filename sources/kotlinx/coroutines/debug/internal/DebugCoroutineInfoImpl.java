package kotlinx.coroutines.debug.internal;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.InterfaceC4850b0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.sequences.C5004q;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nDebugCoroutineInfoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugCoroutineInfoImpl.kt\nkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
@InterfaceC4850b0
public final class DebugCoroutineInfoImpl {

    @dd.g
    @Nullable
    public volatile WeakReference<Vc.c> _lastObservedFrame;

    @dd.g
    @NotNull
    public volatile String _state = d.f219285a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final i f219230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    public final long f219231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final WeakReference<kotlin.coroutines.i> f219232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f219233d;

    @dd.g
    @Nullable
    public volatile Thread lastObservedThread;

    public DebugCoroutineInfoImpl(@Nullable kotlin.coroutines.i iVar, @Nullable i iVar2, long j10) {
        this.f219230a = iVar2;
        this.f219231b = j10;
        this.f219232c = new WeakReference<>(iVar);
    }

    public final List<StackTraceElement> b() {
        i iVar = this.f219230a;
        return iVar == null ? EmptyList.f217510a : SequencesKt___SequencesKt.I3(C5004q.b(new DebugCoroutineInfoImpl$creationStackTrace$1(this, iVar, null)));
    }

    @Nullable
    public final kotlin.coroutines.i c() {
        return this.f219232c.get();
    }

    @Nullable
    public final i d() {
        return this.f219230a;
    }

    @NotNull
    public final List<StackTraceElement> e() {
        return b();
    }

    @Nullable
    public final Vc.c f() {
        WeakReference<Vc.c> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @NotNull
    public final String g() {
        return this._state;
    }

    @NotNull
    public final List<StackTraceElement> h() {
        Vc.c cVarF = f();
        if (cVarF == null) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList();
        while (cVarF != null) {
            StackTraceElement stackTraceElement = cVarF.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            cVarF = cVarF.getCallerFrame();
        }
        return arrayList;
    }

    public final void i(@Nullable Vc.c cVar) {
        this._lastObservedFrame = cVar != null ? new WeakReference<>(cVar) : null;
    }

    public final synchronized void j(@NotNull String str, @NotNull kotlin.coroutines.e<?> eVar, boolean z10) {
        try {
            if (G.g(this._state, d.f219286b) && G.g(str, d.f219286b) && z10) {
                this.f219233d++;
            } else if (this.f219233d > 0 && G.g(str, d.f219287c)) {
                this.f219233d--;
                return;
            }
            if (G.g(this._state, str) && G.g(str, d.f219287c) && f() != null) {
                return;
            }
            this._state = str;
            i(eVar instanceof Vc.c ? (Vc.c) eVar : null);
            this.lastObservedThread = G.g(str, d.f219286b) ? Thread.currentThread() : null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0048 -> B:25:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0059 -> B:24:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(kotlin.sequences.AbstractC5002o<? super java.lang.StackTraceElement> r6, Vc.c r7, kotlin.coroutines.e<? super kotlin.L0> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1) r0
            int r1 = r0.f219243f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219243f = r1
            goto L18
        L13:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f219241d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f219243f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f219240c
            Vc.c r6 = (Vc.c) r6
            java.lang.Object r7 = r0.f219239b
            kotlin.sequences.o r7 = (kotlin.sequences.AbstractC5002o) r7
            java.lang.Object r2 = r0.f219238a
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r2 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r2
            kotlin.C4885d0.n(r8)
            goto L5c
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.C4885d0.n(r8)
            r2 = r5
        L3f:
            if (r7 != 0) goto L44
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        L44:
            java.lang.StackTraceElement r8 = r7.getStackTraceElement()
            if (r8 == 0) goto L5f
            r0.f219238a = r2
            r0.f219239b = r6
            r0.f219240c = r7
            r0.f219243f = r3
            java.lang.Object r8 = r6.b(r8, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r4 = r7
            r7 = r6
            r6 = r4
        L5c:
            r4 = r7
            r7 = r6
            r6 = r4
        L5f:
            Vc.c r7 = r7.getCallerFrame()
            if (r7 == 0) goto L66
            goto L3f
        L66:
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.k(kotlin.sequences.o, Vc.c, kotlin.coroutines.e):java.lang.Object");
    }

    @NotNull
    public String toString() {
        return "DebugCoroutineInfo(state=" + this._state + ",context=" + c() + ')';
    }
}
