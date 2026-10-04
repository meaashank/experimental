package Kd;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f58577a = new d();

    @Override // java.util.logging.Handler
    public void publish(@NotNull LogRecord record) {
        G.p(record, "record");
        c cVar = c.f58573a;
        String loggerName = record.getLoggerName();
        G.o(loggerName, "record.loggerName");
        int iB = e.b(record);
        String message = record.getMessage();
        G.o(message, "record.message");
        cVar.a(loggerName, iB, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
