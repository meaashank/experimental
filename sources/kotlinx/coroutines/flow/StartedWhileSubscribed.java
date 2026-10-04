package kotlinx.coroutines.flow;

import androidx.collection.C1550p;
import androidx.compose.runtime.R0;
import androidx.compose.ui.input.pointer.C2151s;
import kotlin.collections.U;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.flow.FlowKt__LimitKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nSharingStarted.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharingStarted.kt\nkotlinx/coroutines/flow/StartedWhileSubscribed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
public final class StartedWhileSubscribed implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f220037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f220038c;

    public StartedWhileSubscribed(long j10, long j11) {
        this.f220037b = j10;
        this.f220038c = j11;
        if (j10 < 0) {
            throw new IllegalArgumentException(C2151s.a("stopTimeout(", j10, " ms) cannot be negative").toString());
        }
        if (j11 < 0) {
            throw new IllegalArgumentException(C2151s.a("replayExpiration(", j11, " ms) cannot be negative").toString());
        }
    }

    @Override // kotlinx.coroutines.flow.r
    @NotNull
    public e<SharingCommand> a(@NotNull u<Integer> uVar) {
        return FlowKt__DistinctKt.a(new FlowKt__LimitKt.b(FlowKt__MergeKt.n(uVar, new StartedWhileSubscribed$command$1(this, null)), new StartedWhileSubscribed$command$2(2, null)));
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof StartedWhileSubscribed)) {
            return false;
        }
        StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
        return this.f220037b == startedWhileSubscribed.f220037b && this.f220038c == startedWhileSubscribed.f220038c;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return C1550p.a(this.f220038c) + (C1550p.a(this.f220037b) * 31);
    }

    @NotNull
    public String toString() {
        ListBuilder listBuilder = new ListBuilder(2);
        if (this.f220037b > 0) {
            listBuilder.add("stopTimeout=" + this.f220037b + "ms");
        }
        if (this.f220038c < Long.MAX_VALUE) {
            listBuilder.add("replayExpiration=" + this.f220038c + "ms");
        }
        return R0.a(new StringBuilder("SharingStarted.WhileSubscribed("), U.r3(listBuilder.A(), null, null, null, 0, null, null, 63, null), ')');
    }
}
