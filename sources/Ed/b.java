package Ed;

import android.support.v4.media.session.f;
import androidx.core.app.C2392o;
import ed.InterfaceC4376a;
import java.util.Arrays;
import java.util.logging.Level;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    @NotNull
    public static final String b(long j10) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j10 <= -999500000 ? f.a(new StringBuilder(), (j10 - ((long) 500000000)) / ((long) 1000000000), " s ") : j10 <= -999500 ? f.a(new StringBuilder(), (j10 - ((long) C2392o.a.f111076f)) / ((long) 1000000), " ms") : j10 <= 0 ? f.a(new StringBuilder(), (j10 - ((long) 500)) / ((long) 1000), " µs") : j10 < 999500 ? f.a(new StringBuilder(), (j10 + ((long) 500)) / ((long) 1000), " µs") : j10 < 999500000 ? f.a(new StringBuilder(), (j10 + ((long) C2392o.a.f111076f)) / ((long) 1000000), " ms") : f.a(new StringBuilder(), (j10 + ((long) 500000000)) / ((long) 1000000000), " s ")}, 1));
    }

    public static final void c(a aVar, c cVar, String str) {
        d.f33893h.getClass();
        d.f33895j.fine(cVar.f33882b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f33877a);
    }

    public static final <T> T d(@NotNull a task, @NotNull c queue, @NotNull InterfaceC4376a<? extends T> block) {
        long jNanoTime;
        G.p(task, "task");
        G.p(queue, "queue");
        G.p(block, "block");
        d.f33893h.getClass();
        boolean zIsLoggable = d.f33895j.isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = queue.f33881a.f33896a.nanoTime();
            c(task, queue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T tInvoke = block.invoke();
            if (zIsLoggable) {
                c(task, queue, G.C("finished run in ", b(queue.f33881a.f33896a.nanoTime() - jNanoTime)));
            }
            return tInvoke;
        } catch (Throwable th) {
            if (zIsLoggable) {
                c(task, queue, G.C("failed a run in ", b(queue.f33881a.f33896a.nanoTime() - jNanoTime)));
            }
            throw th;
        }
    }

    public static final void e(@NotNull a task, @NotNull c queue, @NotNull InterfaceC4376a<String> messageBlock) {
        G.p(task, "task");
        G.p(queue, "queue");
        G.p(messageBlock, "messageBlock");
        d.f33893h.getClass();
        if (d.f33895j.isLoggable(Level.FINE)) {
            c(task, queue, messageBlock.invoke());
        }
    }
}
