package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.InterfaceC5043v;
import kotlin.coroutines.i;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Key f218715c = new Key();

    @InterfaceC5043v
    public static final class Key extends kotlin.coroutines.b<CoroutineDispatcher, ExecutorCoroutineDispatcher> {
        public /* synthetic */ Key(C4969v c4969v) {
            this();
        }

        public Key() {
            super(CoroutineDispatcher.f218710b, new ed.l<i.b, ExecutorCoroutineDispatcher>() { // from class: kotlinx.coroutines.ExecutorCoroutineDispatcher.Key.1
                @Override // ed.l
                @Nullable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final ExecutorCoroutineDispatcher invoke(@NotNull i.b bVar) {
                    if (bVar instanceof ExecutorCoroutineDispatcher) {
                        return (ExecutorCoroutineDispatcher) bVar;
                    }
                    return null;
                }
            });
        }
    }

    @NotNull
    public abstract Executor Z2();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();
}
