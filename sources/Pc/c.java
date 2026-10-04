package Pc;

import Xc.f;
import dd.j;
import ed.l;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.InterfaceC4850b0;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@j(name = "TimersKt")
public final class c {

    @V({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,149:1\n*E\n"})
    public static final class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<TimerTask, L0> f65708a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super TimerTask, L0> lVar) {
            this.f65708a = lVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f65708a.invoke(this);
        }
    }

    @f
    public static final Timer a(String str, boolean z10, long j10, long j11, l<? super TimerTask, L0> action) {
        G.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), j10, j11);
        return timerK;
    }

    @f
    public static final Timer b(String str, boolean z10, Date startAt, long j10, l<? super TimerTask, L0> action) {
        G.p(startAt, "startAt");
        G.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), startAt, j10);
        return timerK;
    }

    public static /* synthetic */ Timer c(String str, boolean z10, long j10, long j11, l action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            j10 = 0;
        }
        G.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), j10, j11);
        return timerK;
    }

    public static /* synthetic */ Timer d(String str, boolean z10, Date startAt, long j10, l action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        G.p(startAt, "startAt");
        G.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), startAt, j10);
        return timerK;
    }

    @f
    public static final TimerTask e(Timer timer, long j10, long j11, l<? super TimerTask, L0> action) {
        G.p(timer, "<this>");
        G.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, j10, j11);
        return aVar;
    }

    @f
    public static final TimerTask f(Timer timer, long j10, l<? super TimerTask, L0> action) {
        G.p(timer, "<this>");
        G.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, j10);
        return aVar;
    }

    @f
    public static final TimerTask g(Timer timer, Date time, long j10, l<? super TimerTask, L0> action) {
        G.p(timer, "<this>");
        G.p(time, "time");
        G.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, time, j10);
        return aVar;
    }

    @f
    public static final TimerTask h(Timer timer, Date time, l<? super TimerTask, L0> action) {
        G.p(timer, "<this>");
        G.p(time, "time");
        G.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, time);
        return aVar;
    }

    @f
    public static final TimerTask i(Timer timer, long j10, long j11, l<? super TimerTask, L0> action) {
        G.p(timer, "<this>");
        G.p(action, "action");
        a aVar = new a(action);
        timer.scheduleAtFixedRate(aVar, j10, j11);
        return aVar;
    }

    @f
    public static final TimerTask j(Timer timer, Date time, long j10, l<? super TimerTask, L0> action) {
        G.p(timer, "<this>");
        G.p(time, "time");
        G.p(action, "action");
        a aVar = new a(action);
        timer.scheduleAtFixedRate(aVar, time, j10);
        return aVar;
    }

    @InterfaceC4850b0
    @NotNull
    public static final Timer k(@Nullable String str, boolean z10) {
        return str == null ? new Timer(z10) : new Timer(str, z10);
    }

    @f
    public static final Timer l(String str, boolean z10, long j10, long j11, l<? super TimerTask, L0> action) {
        G.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), j10, j11);
        return timerK;
    }

    @f
    public static final Timer m(String str, boolean z10, Date startAt, long j10, l<? super TimerTask, L0> action) {
        G.p(startAt, "startAt");
        G.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), startAt, j10);
        return timerK;
    }

    public static /* synthetic */ Timer n(String str, boolean z10, long j10, long j11, l action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            j10 = 0;
        }
        G.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), j10, j11);
        return timerK;
    }

    public static /* synthetic */ Timer o(String str, boolean z10, Date startAt, long j10, l action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        G.p(startAt, "startAt");
        G.p(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), startAt, j10);
        return timerK;
    }

    @f
    public static final TimerTask p(l<? super TimerTask, L0> action) {
        G.p(action, "action");
        return new a(action);
    }
}
