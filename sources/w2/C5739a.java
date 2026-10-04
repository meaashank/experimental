package w2;

import android.util.Log;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: w2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nProcessLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C5739a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f240071f = "SupportSQLiteLock";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f240073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final File f240074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lock f240075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public FileChannel f240076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C0899a f240070e = new C0899a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Map<String, Lock> f240072g = new HashMap();

    /* JADX INFO: renamed from: w2.a$a, reason: collision with other inner class name */
    @V({"SMAP\nProcessLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,103:1\n361#2,7:104\n*S KotlinDebug\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock$Companion\n*L\n99#1:104,7\n*E\n"})
    public static final class C0899a {
        public C0899a() {
        }

        public final Lock b(String str) {
            Lock lock;
            synchronized (C5739a.f240072g) {
                try {
                    Map<String, Lock> map = C5739a.f240072g;
                    Lock reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = reentrantLock;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        public C0899a(C4969v c4969v) {
        }
    }

    public C5739a(@NotNull String name, @Nullable File file, boolean z10) {
        G.p(name, "name");
        this.f240073a = z10;
        this.f240074b = file != null ? new File(file, name.concat(".lck")) : null;
        this.f240075c = f240070e.b(name);
    }

    public static /* synthetic */ void c(C5739a c5739a, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c5739a.f240073a;
        }
        c5739a.b(z10);
    }

    public final void b(boolean z10) {
        this.f240075c.lock();
        if (z10) {
            try {
                File file = this.f240074b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f240074b).getChannel();
                channel.lock();
                this.f240076d = channel;
            } catch (IOException e10) {
                this.f240076d = null;
                Log.w(f240071f, "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f240076d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f240075c.unlock();
    }
}
